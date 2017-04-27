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
public class FuncaoBean {
    
    private Funcao funcaoCadastro;
    
    //mudar, pode haver mais de uma função para cada usuário
    public Funcao getFuncaoCadastro() {
        if(funcaoCadastro == null)
            funcaoCadastro = new Funcao();
        return funcaoCadastro;
    }

    public void setFuncaoCadastro(Funcao funcaoCadastro) {
        this.funcaoCadastro = funcaoCadastro;
    }
}
