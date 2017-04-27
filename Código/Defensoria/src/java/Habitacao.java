/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bruno
 */
public class Habitacao {
    SituacaoHabitacao idSituacaoHabitacao;
    int cep;
    String enderecoDomiciliar;
    String cidadeDomiciliar;
    String bairro;

    public SituacaoHabitacao getIdSituacaoHabitacao() {
        return idSituacaoHabitacao;
    }

    public void setIdSituacaoHabitacao(SituacaoHabitacao idSituacaoHabitacao) {
        this.idSituacaoHabitacao = idSituacaoHabitacao;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getEnderecoDomiciliar() {
        return enderecoDomiciliar;
    }

    public void setEnderecoDomiciliar(String enderecoDomiciliar) {
        this.enderecoDomiciliar = enderecoDomiciliar;
    }

    public String getCidadeDomiciliar() {
        return cidadeDomiciliar;
    }

    public void setCidadeDomiciliar(String cidadeDomiciliar) {
        this.cidadeDomiciliar = cidadeDomiciliar;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
}
