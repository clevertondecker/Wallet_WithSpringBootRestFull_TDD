/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wallet.br.repository;

import br.com.wallet.entity.User;
import br.com.wallet.repository.UserRepository;
import java.util.Optional;
import org.junit.After;
import org.junit.Assert;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



/**
 *
 * @author Ton
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {
    
    
    private static final String EMAIL= "enail@test.com";
    @Autowired
    UserRepository repository;
          
    @Before  
    public void setUp(){  //Instrucoes para serem executadas antes da classe test
        User u = new User();
        u.setName("Set Up User");
        u.setPassword("senha123");
        u.setEmail(EMAIL);
        
        repository.save(u);
    }
    
    @After 
    public void tearDOwn(){  // limpa a base de teste
        repository.deleteAll();
    }
    
    @Test
     public void testSave(){
         User u = new User();
         u.setName("Cleverton");
         u.setPassword("123456");
         u.setEmail("ton@cdecker.com.br");
         
         User response = repository.save(u); // JPA Repository
         
         assertNotNull(response); //verifica se eh null
     }
     
     public void testFindByEmail(){

         Optional<User> response = repository.findByEmailEquals(EMAIL);
    
        assertTrue(response.isPresent()); //se existe
        Assert.assertEquals(response.get().getEmail(), EMAIL); // compara se eh igual o e-mail do optional 
     }
}
