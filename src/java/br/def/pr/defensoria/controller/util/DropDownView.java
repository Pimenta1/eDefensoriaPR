/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.def.pr.defensoria.cotroller.util;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
 
@ManagedBean
@ViewScoped
public class DropDownView implements Serializable {
     
    private final Map<String,Map<String,String>> data = new HashMap<>();
    private String genero; 
    private String estadoCivil;  
    private Map<String,String> generos;
    private Map<String,String> estadosCivil;
     
    @PostConstruct
    public void init() {
        generos  = new HashMap<>();
        generos.put("Masculino", "Masculino");
        generos.put("Femenino", "Femenino");
         
        Map<String,String> map = new HashMap<>();
        map.put("Casado", "Casado");
        map.put("Companheiro", "Companheiro");
        map.put("Divorciado", "Divorciado");
        map.put("Separado", "Separado");
        map.put("Solteiro", "Solteiro");
        map.put("Viúvo", "Viúvo");
        data.put("Masculino", map);
         
        map = new HashMap<>();
        map.put("Casada", "Casada");
        map.put("Companheira", "Companheira");
        map.put("Divorciada", "Divorciada");
        map.put("Separada", "Separada");
        map.put("Solteira", "Solteira");
        map.put("Viúva", "Viúva");
        data.put("Femenino", map);
         
    }
 
    public Map<String, Map<String, String>> getData() {
        return data;
    }
 
    public String getGenero() {
        return genero;
    }
 
    public void setGenero(String genero) {
        this.genero = genero;
    }
 
    public String getEstadoCivil() {
        return estadoCivil;
    }
 
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
 
    public Map<String, String> getGeneros() {
        return generos;
    }
 
    public Map<String, String> getEstadosCivil() {
        return estadosCivil;
    }
 
    public void onGeneroChange() {
        if(genero !=null && !genero.equals(""))
            estadosCivil = data.get(genero);
        else
            estadosCivil = new HashMap<>();
    }
     
    public void displayEstado() {
        FacesMessage msg;
        if(estadoCivil != null && genero != null)
            msg = new FacesMessage("Selecionado ", estadoCivil + " de " + genero);
        else
            msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Inválido", "Genêro não foi selecionado."); 
        FacesContext.getCurrentInstance().addMessage(null, msg);  
    }
}