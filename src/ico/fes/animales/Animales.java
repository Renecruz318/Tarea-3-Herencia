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
public class Animales {
    private int NumeroDePatas;
    private String mamifero;
    private String aullido;    

    public Animales() {
    }

    public Animales(int NumeroDePatas, String mamifero, String aullido) {
        this.NumeroDePatas = NumeroDePatas;
        this.mamifero = mamifero;
        this.aullido = aullido;
    }

    public int getNumeroDePatas() {
        return NumeroDePatas;
    }

    public void setNumeroDePatas(int NumeroDePatas) {
        this.NumeroDePatas = NumeroDePatas;
    }

    public String getMamifero() {
        return mamifero;
    }

    public void setMamifero(String mamifero) {
        this.mamifero = mamifero;
    }

    public String getAullido() {
        return aullido;
    }

    public void setAullido(String aullido) {
        this.aullido = aullido;
    }

    @Override
    public String toString() {
        return "Animales{" + "NumeroDePatas=" + NumeroDePatas + ", mamifero=" + mamifero + ", aullido=" + aullido + '}';
    }

}