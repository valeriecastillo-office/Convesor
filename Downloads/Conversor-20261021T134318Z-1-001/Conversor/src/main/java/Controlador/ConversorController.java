/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author emgallego
 */


import modelo.ConversorBase;
import modelo.ConversorPremium;
import vista.ConversorView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConversorController implements ActionListener {
    private ConversorView vista;
    private double tasaActual = 4200.0; // Tasa del día simulada
 // constructor
    public ConversorController(ConversorView vista) {
        this.vista = vista;
        // pide un evento no variable 
        // este boton tiene algo escuchala
        this.vista.btnConvertir.addActionListener(this);
    }
    
    public void iniciar() {
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }

    @Override // tomar el evento
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnConvertir) {
            try {
                double dolares = Double.parseDouble(vista.txtDolares.getText());
                boolean esPremium = vista.chkPremium.isSelected();

                // === APLICACIÓN DE POLIMORFISMO ===
                ConversorBase conversor;

                if (esPremium) {
                    conversor = new ConversorPremium(tasaActual);
                } else {
                    conversor = new ConversorBase(tasaActual);
                }

                // El método convertir() actuará diferente según el objeto instanciado
                double pesos = conversor.convertir(dolares);

                // Manejo de errores (sin throw, usando el valor -1.0 del modelo)
                if (pesos == -1.0) {
                    vista.lblResultado.setText("Error: Los dólares no pueden ser negativos.");
                    vista.lblTipoTasa.setText("");
                } else {
                    vista.lblResultado.setText(String.format("Total: $%,.2f COP", pesos));
                    vista.lblTipoTasa.setText("Aplicado: " + conversor.obtenerTipoTasa());
                }
                
            } catch (NumberFormatException ex) {
                // Esto atrapa si escriben letras en lugar de números
                vista.lblResultado.setText("Error: Ingrese solo números.");
                vista.lblTipoTasa.setText("");
            }
        }
    }
}
