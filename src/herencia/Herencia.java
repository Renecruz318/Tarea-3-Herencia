/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import ico.fes.animales.Gato;
import ico.fes.animales.Perro;

/**
 *
 * @author rene
 */
public class Herencia {
    
    public static void main(String[] args) {
        Perro p=new Perro("salchicha", 4, "si", "si");
        System.out.println("Es un perro  " + (p.getRaza()));
        System.out.println(p.getAullido()+ " aulle");
        System.out.println(p.getMamifero()+ " es un mamifero");
        System.out.println("Tiene " + p.getNumeroDePatas()+ " de patas");
        
        Gato g=new Gato("manx", 4, "si", "si");
        System.out.println("Es un gato  " + (g.getRaza()));
        System.out.println(g.getAullido()+ " aulle");
        System.out.println(g.getMamifero()+ " es un mamifero");
        System.out.println("Tiene " + g.getNumeroDePatas()+ " de patas");
    }
    
}
