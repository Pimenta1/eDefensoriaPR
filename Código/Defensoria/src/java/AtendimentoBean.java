/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bruno
 */
public class AtendimentoBean {
    private Atendimento attCadastro;
    
    public Atendimento getAttCadastro(){
        if(attCadastro == null)
            attCadastro = new Atendimento();
        
        return attCadastro;
    }

    public void setAttCadastro(Atendimento attCadastro) {
        this.attCadastro = attCadastro;
    }
}
