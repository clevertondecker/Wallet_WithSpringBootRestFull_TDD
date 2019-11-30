/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wallet.service;

import br.com.wallet.entity.User;
import java.util.Optional;

/**
 *
 * @author Ton
 */

public interface UserService {
    
    User save(User u);
    
    Optional<User> findByEmail(String email);
    
}
