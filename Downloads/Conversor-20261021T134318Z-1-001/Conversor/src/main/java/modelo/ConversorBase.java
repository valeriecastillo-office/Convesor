/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author emgallego
 */


public class ConversorBase {
    protected double tasaDeCambio;

    // Constructor
    public ConversorBase(double tasaDeCambio) {
        // Como no podemos usar "throw", corregimos el valor si es inválido
        if (tasaDeCambio <= 0) {
            this.tasaDeCambio = 4000.0; // Tasa por defecto
        } else {
            this.tasaDeCambio = tasaDeCambio;
        }
    }

    // Método que será sobrescrito
    public double convertir(double dolares) {
        // En lugar de throw, retornamos -1.0 como "código de error"
        if (dolares < 0) {
            return -1.0; 
        }
        return dolares * tasaDeCambio;
    }
    
    // Método adicional para demostrar polimorfismo
    public String obtenerTipoTasa() {
        return "Tasa Estándar";
    }
}
