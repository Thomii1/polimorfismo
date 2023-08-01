/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo1;

/**
 *
 * @author thomii
 */
public class rectangulo extends Figura {
    public rectangulo (int largo, int ancho){
        super(largo, ancho);
    }

    @Override
    public void calcularArea() {
        System.out.println("Area Rectangulo: " + lado*lado);
    }
    
    
}
