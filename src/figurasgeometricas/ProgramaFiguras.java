/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

import java.util.Scanner;

/**
 *
 * @author tinom
 */
public class ProgramaFiguras {
   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);  
     
        System.out.println("Este programa puede hacer cálculos de área y perímetro de las siguientes figuras:");  
        System.out.println("1.- Círculo.");  
        System.out.println("2.- Rectángulo.");  
        System.out.println("3.- Pentágono.");  
        System.out.println("4.- Trapezoide");  
        System.out.println("5.- Octágono");
        System.out.println("Selecciona una opción..."); 
        
        int opcion = 0;
        opcion = sc.nextInt();
        System.out.println("Escogiste la opcion: ");
        System.out.println(String.valueOf(opcion));
    }    
}
