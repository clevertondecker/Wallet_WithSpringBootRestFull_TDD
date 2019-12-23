package br.com.wallet.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;


@Entity  // classe
@Data //lombok
@Table(name= "users")

public class User implements Serializable{
    
    
	private static final long serialVersionUID = -2213778288545447817L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto generate ID
    private long id;
    @Column(nullable=false)
    private String password;
    @Column(nullable=false)   // Notnull
    private String name;
    @Column(nullable=false)   // Notnull
    private String email;
    
}
