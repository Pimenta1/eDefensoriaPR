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
public class Processo {
    int idProcesso;
    SituacaoProcesso idSituacao;
    
    public void addProcesso(){
        
    }

    public int getIdProcesso() {
        return idProcesso;
    }

    public void setIdProcesso(int idProcesso) {
        this.idProcesso = idProcesso;
    }

    public SituacaoProcesso getIdSituacao() {
        return idSituacao;
    }

    public void setIdSituacao(SituacaoProcesso idSituacao) {
        this.idSituacao = idSituacao;
    }
}
