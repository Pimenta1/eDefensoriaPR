/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.def.pr.defensoria.app;

import br.def.pr.defensoria.dao.AssistidoDao;
import br.def.pr.defensoria.entity.Assistido;
import br.def.pr.defensoria.entity.Endereco;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author joao
 */
public class Main {
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Assistido assistido = new Assistido("João", "Felipe", "M");
        AssistidoDao ad = new AssistidoDao();
        
        ad.save(assistido);
        assistido.setNome("JAJAJA");
        ad.update(assistido);
        ad.delete(assistido);
        
        Assistido c2 = new Assistido("A", "AAA", "M");
        Assistido c3 = new Assistido("B", "BBB", "F");
        Assistido c4 = new Assistido("C", "CCC", "C");
        Assistido c5 = new Assistido("D", "DDD", "D");
        
        Endereco ed = new Endereco("Prude", "PR", "ruazinha", "32", "casa", "centro", "84400-000");
        
        c2.setEndereco(ed);
        ad.save(c2);
        ad.save(c3);
        ad.save(c4);
        ad.save(c5);
        
        List<Assistido> assistidos = ad.getAll(Assistido.class);
        System.out.println("Assistidos:");
        System.out.println(assistidos.toString());
                                         
        Assistido byID = ad.getById(3);
        System.out.println("ByID:");
        System.out.println(byID.toString());

//        Endereco e = new Endereco();
//        Endereco e2 = new Endereco();
//        Endereco e3 = new Endereco();
//        e.setCidade("prude");
//        e2.setCidade("prude2");
//        e3.setCidade("prude3");
//        
//        EnderecoDao ed = new EnderecoDao();
//        ed.save(e);
//        ed.save(e2);
//        ed.save(e3);
//        
//        e2.setCidade("alterado2");
//        ed.update(e2);
//        
//        ed.delete(e3);
//        
//        Endereco er = ed.getById(1);
//        System.out.println(er.toString());
//        
//        List<Endereco> eds = ed.getAll(Endereco.class);
//        System.out.println(eds.toString());
        
    }
}
