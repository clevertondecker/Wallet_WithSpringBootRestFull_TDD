/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wallet.service.impl;


import br.com.wallet.entity.User;
import br.com.wallet.repository.UserRepository;
import br.com.wallet.service.UserService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository repository;
    
    @Override
    public User save(User u) {
       return repository.save(u);
    }

    @Override
    public Optional<User> findByEmail(String email) {
       return repository.findByEmailEquals(email);
    }
    
}
