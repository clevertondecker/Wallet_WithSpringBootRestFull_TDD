package br.com.wallet.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.Data;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL) // nao adiciona valores nulos

public class UserDTO {  //Data Transfer Object

    private Long id;
    @Email(message = "Email inválido")
    private String email;
    @Length(min = 3, max = 50, message = "O nome deve conter entre 3 e 50 caracteres")
    private String name;
    @NotNull
    @Length(min = 6, message = "A senha deve conter no mínimo 6 caracteres")
    private String password;
    @NotNull(message = "Informe uma role de acesso")
	@Pattern(regexp="^(ROLE_ADMIN|ROLE_USER)$", message = "Para o role de acesso são aceitos os valores ROLE_ADMIN|ROLE_USER")
	private String role;

}
