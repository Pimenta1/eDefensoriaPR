/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bruno
 */
public class FuncionarioBean {
    private Funcionario funcionarioCd;
    
    //mudar, pode haver mais de uma função para cada usuário
    public Funcionario getFuncionarioCd() {
        if(funcionarioCd == null)
            funcionarioCd = new Funcionario();
        return funcionarioCd;
    }

    public void setFuncionarioCd(Funcionario funcionarioCd) {
        this.funcionarioCd = funcionarioCd;
    }
}
