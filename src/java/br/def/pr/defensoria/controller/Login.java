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
public class Login {
    String senha;
    NivelAcesso idNivelAcesso;
    String usuario;

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public NivelAcesso getIdNivelAcesso() {
        return idNivelAcesso;
    }

    public void setIdNivelAcesso(NivelAcesso idNivelAcesso) {
        this.idNivelAcesso = idNivelAcesso;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
 
}
