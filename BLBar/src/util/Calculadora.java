/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package util;

/**
 *
 * @author Administrador
 */
public class Calculadora {
    
    public double resultado;
    public String modelo = "Meu modelo";
    public String marca = "Minha marca";
 
    public void somar(double a, double b) {
        this.resultado = a + b;
    }
 
    public void multiplicar(double a, double b) {
        this.resultado = a * b;
    }
 
    public void dividir(double a, double b) {
        this.resultado = a / b;
    }
 
    public void subtrair(double a, double b) {
        this.resultado = a - b;
 
    }
    
}
