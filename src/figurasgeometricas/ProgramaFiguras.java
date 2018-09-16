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
        System.out.println("4.- Trapezoide regular");  
        System.out.println("5.- Octágono");
        System.out.println("Selecciona una opción..."); 
        
        int opcion = 0;
        opcion = sc.nextInt();
        switch(opcion){
            case 3: System.out.println("Por favor, ingresa el valor del apotema: ");
                    float apotema = sc.nextFloat();
                    System.out.println("Por favor, ingresa el valor del lado: ");
                    float lado = sc.nextFloat();
                    Pentagono varPentagono = new Pentagono(apotema, lado);
                    System.out.println("El perímetro del pentágono es:");
                    System.out.println(varPentagono.calculaPerimetro());
                    System.out.println("El área del pentágono es:");
                    System.out.println(varPentagono.calculaArea());
                    break;
            case 4: System.out.println("Por favor, ingresa el valor de la base mayor: ");
                    float baseMayor = sc.nextFloat();
                    System.out.println("Por favor, ingresa el valor de la base menor: ");
                    float baseMenor = sc.nextFloat();
                    System.out.println("Por favor, ingresa el valor de la altura: ");
                    float altura = sc.nextFloat();
                    Trapezoide varTrapezoide = new Trapezoide(baseMayor, baseMenor, altura, altura);
                    System.out.println("El perímetro del trapezoide regular es:");
                    System.out.println(varTrapezoide.calculaPerimetro());
                    System.out.println("El área del trapezoide regular es:");
                    System.out.println(varTrapezoide.calculaArea());
                    
        }
        //System.out.println("Escogiste la opcion: ");
        //System.out.println(String.valueOf(opcion));
    }    
}
