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
public class AssistidoBean {
    private Assistido assistidoCadastro;

    public Assistido getAssistidoCadastro() {
        if(assistidoCadastro == null)
            assistidoCadastro = new Assistido();
        return assistidoCadastro;
    }

    public void setAssistidoCadastro(Assistido assistidoCadastro) {
        this.assistidoCadastro = assistidoCadastro;
    }

    public void addAssistido() {
        try{
            Assistido pd = new Assistido();
            pd.addAssistido();
            //FacesUtil.addMsgInfo("Assistido cadastrada");
        }catch(RuntimeException r){  
            //FacesUtil.addMsgError("Ocorreu um erro");
        }
        
    }
}
