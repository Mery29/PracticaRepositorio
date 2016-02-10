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
        super(" ");
    }
    
    public void mostrar(){
        this.setVisible(true);
    }
    
    public void setTitulo(){
        this.setTittle("Practica");
    }
    
    
    //Hacer método de ajustarConfiguraciones
    public void ajustaConfiguracionInicial(){
        
    }
    
    
    public void iniciar(){
        ajustaConfiguracionInicial();
        setTitulo();
       //Debe llamar a los otros métodos q se creen 
        mostrar();
    }
    
    
    //Hacer método de agregarComponentes para poner un Panel con algo

    
    public static void main(String[] args) {
        PracticaRepositorio ventana= new PracticaRepositorio();
        ventana.iniciar();
    }
    
}
