/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wallet.serviceTest;

import br.com.wallet.repository.UserRepository;
import br.com.wallet.entity.User;
import br.com.wallet.service.UserService;
import java.util.Optional;
import static junit.framework.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.mockito.BDDMockito;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;


/**
 *
 * @author Ton
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")

public class UserServiceTest {
    
    @MockBean
     UserRepository repository;
   
    
    @Autowired
    UserService service;
    
    @Before
    public void setUp(){
        BDDMockito.given(repository.findByEmailEquals(Mockito.anyString())).willReturn(Optional.of(new User()));
    }
    
    @Test
    public void testFindByMail(){
        Optional<User> user = service.findByEmail("email@test.com");
        assertTrue(user.isPresent());
    }
    
}
