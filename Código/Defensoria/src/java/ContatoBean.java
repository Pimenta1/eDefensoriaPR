/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bruno
 */
public class ContatoBean {
    private Contato contatoCadastro;
    
    public Contato getContatoCadastro() {
        if(contatoCadastro == null)
            contatoCadastro = new Contato();
        return contatoCadastro;
    }

    public void setContatoCadastro(Contato contatoCadastro) {
        this.contatoCadastro = contatoCadastro;
    }
    
    public void addContato() {
        try{
            Contato pd = new Contato();
            pd.addContato();
            //FacesUtil.addMsgInfo("Contato cadastrada");
        }catch(RuntimeException r){  
            //FacesUtil.addMsgError("Ocorreu um erro");
        }
        
    }
}
