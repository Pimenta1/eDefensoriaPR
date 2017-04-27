package br.def.pr.defensoria.controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bruno
 */
public class BensBean {
    
    private Bens bensCadastro;
    
    public Bens getAttCadastro(){
        if(bensCadastro == null)
            bensCadastro = new Bens();
        
        return bensCadastro;
    }
}
