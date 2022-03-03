/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication37;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class JavaApplication37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
 {
        // TODO code application logic here
        int a=3,b=4,c=19;
        System.out.println("la suma es "+(a+b+c)+" ok");
        if (!(a > b && a > c ))
            System.out.println("a es mayor");
        else 
            System.out.println("a no es mayor que b");
           
        double resul = Math.sqrt(c);
        System.out.println("Raiz de "+c+" es "+resul);
       //String no es primitivo, sino de clase
        String nombre = "Cristina";
        System.out.println(nombre.toUpperCase());
        String apellido = JOptionPane.showInputDialog("Ingrese su apellido");
        System.out.println("Usted ingresó: "+apellido);
        JOptionPane.showMessageDialog(null, "Usted ingresó: "+apellido);
 }
    
}
