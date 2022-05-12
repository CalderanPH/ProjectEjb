/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package br.jsf;

import br.ejb.EjbLocalLocal;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author default
 */
@Named(value = "jsfLocal")
@RequestScoped
public class JsfLocal {

    @EJB
    private EjbLocalLocal ejbLocal;

    /**
     * Creates a new instance of JsfLocal
     */
    public JsfLocal() {
    }
    
    private int valor1;
    private int valor2;
    
    private int resultado;

    public void somar(){
        resultado = ejbLocal.somar(valor1, valor2);
    }

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }
    
    

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
}
