/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conversor;

import Controlador.ConversorController;
import vista.ConversorView;

/**
 *
 * @author emgallego
 */
public class Conversor {

    public static void main(String[] args) {
        System.out.println("conversor de monedas");
        ConversorView vista = new ConversorView();
        ConversorController controlador = new ConversorController(vista);
        controlador.iniciar();
    }
}
