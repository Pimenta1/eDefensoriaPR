/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.def.pr.defensoria.cotroller.util;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
 
@ManagedBean
public class AutoCompleteView {
     
    public List<String> completeEstadoCivil(String query) {
        List<String> results = new ArrayList<>();
        results.add("Casado(a)");
        results.add("Companheiro(a)");
        results.add("Divorciado(a)");
        results.add("Separado(a)");
        results.add("Solteiro(a)");
        results.add("Viúvo(a)");
         
        return results;
    }
     

     
    }
