package br.com.wallet.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import br.com.wallet.entity.User;
import br.com.wallet.util.enums.RoleEnum;
import lombok.NoArgsConstructor;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
public class JwtUserFactory {

	public static JwtUser create(User user) {
		return new JwtUser(user.getId(), user.getEmail(), user.getPassword(), createGrantedAuthorities(user.getRole()));
	}

	private static List<GrantedAuthority> createGrantedAuthorities(RoleEnum role) {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		authorities.add(new SimpleGrantedAuthority(role.toString()));
		return authorities;
		
	}

}
