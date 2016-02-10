/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicarepositorio;

import javax.swing.JFrame;

/**
 *
 * @author Mery Zuñiga
 */
public class PracticaRepositorio extends JFrame{
    
    public PracticaRepositorio(){
        super("Practica");
    }
    
    public void mostrar(){
        this.setVisible(true);
    }
    
    //Hacer método de ajustarConfiguraciones
    
    
    
    public void iniciar(){
        mostrar();
        //Debe llamar a los otros métodos q se creen 
    }
    
    
    //Hacer método de agregarComponentes para poner un Panel con algo

    
    public static void main(String[] args) {
        PracticaRepositorio ventana= new PracticaRepositorio();
        ventana.iniciar();
    }
    
}
