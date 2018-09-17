/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

/**
 *
 * @author Oscar
 */
import javax.swing.*;

public class Circulo extends FigGeometrica {
   float radio;
public Circulo(float radio){
this.radio=radio;
}
     
    public float calculaArea(){      
     return (float) ((radio*radio)*Math.PI);
    }
  
    public float calculaPerimetro(){
     return (float) ((radio+radio)*Math.PI);
    }
    
    public void setRadio(float radio){
        this.radio=radio;
    }
    public void getRadio(float radio){
        this.radio=radio;
    }
}
