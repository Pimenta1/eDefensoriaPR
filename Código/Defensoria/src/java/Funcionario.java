/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bruno
 */
public class Funcionario {
    int idFuncionario;
    Funcao idFuncao;
    Login senha;
    String nome;

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public Funcao getIdFuncao() {
        return idFuncao;
    }

    public void setIdFuncao(Funcao idFuncao) {
        this.idFuncao = idFuncao;
    }

    public Login getSenha() {
        return senha;
    }

    public void setSenha(Login senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
