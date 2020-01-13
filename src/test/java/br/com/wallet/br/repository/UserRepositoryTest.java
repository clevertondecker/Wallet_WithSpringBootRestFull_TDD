/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wallet.br.repository;

import br.com.wallet.entity.User;
import br.com.wallet.repository.UserRepository;
import br.com.wallet.util.enums.RoleEnum;

import java.util.Optional;
import org.junit.After;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class UserRepositoryTest {

    private static final String EMAIL = "email@teste.com";

    @Autowired
    UserRepository repository;

    @Before
    public void setUp() {
        User u = new User();
        u.setName("Set up User");
        u.setPassword("Senha123");
        u.setEmail(EMAIL);
        u.setRole(RoleEnum.ROLE_ADMIN);
        repository.save(u);
    }

    @After
    public void tearDown() {

        repository.deleteAll();

    }

    @Test
    public void testSave() {
        User u = new User();
        u.setName("Teste");
        u.setPassword("123456");
        u.setEmail("teste@teste.com");
        u.setRole(RoleEnum.ROLE_ADMIN);

        User response = repository.save(u);

        assertNotNull(response);
    }

    public void testFindByEmail() {
        Optional<User> response = repository.findByEmailEquals(EMAIL);

        assertTrue(response.isPresent());
        assertEquals(response.get().getEmail(), EMAIL);
    }
}
