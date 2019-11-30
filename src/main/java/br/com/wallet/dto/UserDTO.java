package br.com.wallet.dto;

import javax.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;

@Data
public class UserDTO {  //Data Transfer Object
    
    private Long id;
    @Email(message ="Email inválido")  // valida e-mail automcaticamente
    private String email;
    @Length (min=3, max=50, message="Nome deve conter entre 3 e 50 caracteres")
    private String name;
    @NotNull
    @Length( min=6, message="Minino de 6 caracteres")
    private String password;
    
}
