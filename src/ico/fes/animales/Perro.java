/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.animales;

/**
 *
 * @author rene
 */
public class Perro extends Animales {
    private String raza;

    public Perro(String raza, int NumeroDePatas, String mamifero, String aullido) {
        super(NumeroDePatas, mamifero, aullido);
        this.raza = raza;
    }

    public Perro(String raza) {
        this.raza = raza;
    }

    public Perro() {
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perro{" + "raza=" + raza + '}';
    }
    
}
