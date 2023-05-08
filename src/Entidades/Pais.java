/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.TreeSet;

/**
 *
 * @author Stilo
 */
public class Pais {
    
    private TreeSet<String> paises = new TreeSet();

    public Pais(TreeSet<String> paises) {
        this.paises = paises;
    }

    public Pais() {
    }

    public TreeSet<String> getPaises() {
        return paises;
    }

    public void setPaises(TreeSet<String> paises) {
        this.paises = paises;
    }

    @Override
    public String toString() {
        return "Pais{" + "paises=" + paises + '}';
    
}
}
