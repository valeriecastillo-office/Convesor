/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author emgallego
 */


public class ConversorPremium extends ConversorBase {

    // Constructor usando super()
    public ConversorPremium(double tasaDeCambio) {
        super(tasaDeCambio);
    }

    // POLIMORFISMO: Sobrescribimos el comportamiento matemático
    @Override
    public double convertir(double dolares) {
        if (dolares < 0) {
            return -1.0; // Código de error
        }
        // El cliente Premium recibe una mejor tasa (+100 pesos por dólar)
        return dolares * (tasaDeCambio + 100.0);
    }

    // POLIMORFISMO: Sobrescribimos el mensaje
    @Override
    public String obtenerTipoTasa() {
        return "Tasa VIP (+100 pesos por dólar)";
    }
}