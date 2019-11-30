/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wallet.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

/**
 *
 * @author Ton
 */
@Entity  // classe
@Data //lombok
public class User implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
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
