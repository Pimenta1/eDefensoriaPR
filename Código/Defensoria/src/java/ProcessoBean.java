/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bruno
 */
public class ProcessoBean {
    private Processo processoCadastro;
    

    public void setProcessoCadastro(Processo processoCadastro) {
        this.processoCadastro = processoCadastro;
    }
    public Processo getProcessoCadastro() {
        if(processoCadastro == null)
            processoCadastro = new Processo();
        return processoCadastro;
    }
    
    public void addProcesso() {
        try{
            Processo processo = new Processo();
            processo.addProcesso();
            //FacesUtil.addMsgInfo("Processo cadastrada");
        }catch(RuntimeException r){  
            //FacesUtil.addMsgError("Ocorreu um erro");
        }
        
    }
}
