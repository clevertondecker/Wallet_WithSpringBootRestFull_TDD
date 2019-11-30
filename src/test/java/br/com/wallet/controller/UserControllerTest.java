package br.com.wallet.controller;

import br.com.wallet.dto.UserDTO;
import br.com.wallet.entity.User;
import br.com.wallet.service.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.mockito.BDDMockito;
import org.mockito.Mockito;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("Test")

public class UserControllerTest {
    
    private static final String EMAIL = "test@test.com";
    private static final String NAME = "User Test";
    private static final String PASSWORD = "123456";
    private static final String URL = "/user";
    
    @MockBean
    UserService service;
    
    @Autowired
    MockMvc mvc;
    
    @Test
    public void testSave() throws Exception{
        
        //end point
        BDDMockito.given(service.save(Mockito.any(User.class))).willReturn(getMockUser());
        mvc.perform(MockMvcRequestBuilders.post(URL).content(getJsonPayLoad()) //Chamando um post no "/User" e passando no body/payload o retorno do metodo getJsonPayload
            .contentType(MediaType.APPLICATION_JSON) 
            .accept(MediaType.APPLICATION_JSON))     //aceita json
            .andExpect(status().isCreated());       //espera o retorno 201
    }
    
    public User getMockUser(){
        User u = new User();
        u.setEmail(EMAIL);
        u.setName(NAME);
        u.setPassword(PASSWORD);
        
        return u;
    }
    
    
    //JsonProcessingException caso nao consiga converter o DTO para JSON
    public String getJsonPayLoad() throws JsonProcessingException{
        UserDTO dto = new UserDTO();
        dto.setEmail(EMAIL);
        dto.setName(NAME);
        dto.setPassword(PASSWORD);
        
        ObjectMapper mapper = new ObjectMapper();   //Convert DTO para String em JSON
        return mapper.writeValueAsString(dto);             //Convert DTO para String em JSON
    }
}
