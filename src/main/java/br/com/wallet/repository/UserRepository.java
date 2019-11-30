/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wallet.repository;

import br.com.wallet.entity.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Ton
 */
public interface UserRepository extends JpaRepository<User,  Long>{
    
    Optional<User> findByEmailEquals(String email);  //pesquisa
    
}
