/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author JUAN CARLOS
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ConvesorBaseTest {
    @Test
    public void testConvertirDolaresPositivos_Base(){
        ConversorBase conversor = new ConversorBase(4000);
        // 10 dolares * 4000 mi pesos= 40000
        // yo quiero que eso de 40 o x numero
        assertEquals(40000, conversor.convertir(10),0.01);
        
    }
}
