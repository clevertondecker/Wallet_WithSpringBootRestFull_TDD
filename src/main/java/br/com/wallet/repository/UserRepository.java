package br.com.wallet.repository;

import br.com.wallet.entity.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,  Long>{
    
    Optional<User> findByEmailEquals(String email);  //pesquisa
    
}
