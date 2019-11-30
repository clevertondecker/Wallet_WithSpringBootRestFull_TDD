/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wallet.response;

import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Ton
 */

@Getter
@Setter
@NoArgsConstructor
public class Response<T> {   // <T> generics
    
    private T data;  //response do payload //sucesso
    private List<String> erros;   // error
    
}
