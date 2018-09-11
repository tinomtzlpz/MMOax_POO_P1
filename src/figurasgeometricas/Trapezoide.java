/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

/**
 *
 * @author ARKEONIS
 */
public class Trapezoide extends FigGeometrica{
    private float baseMayor;
    private float baseMenor;
    private float lado1;
    private float lado2;
    
    public Trapezoide(float baseMayor, float baseMenor, float lado1, float lado2){
        this.baseMayor=baseMayor;
        this.baseMenor=baseMenor;
        this.lado1=lado1;
        this.lado2=lado2;
    }
    
    private void setBaseMayor(float baseMayor){
        this.baseMayor=baseMayor;
    }
    private void setBaseMenor(float baseMenor){
        this.baseMenor=baseMenor;
    }
    private void setLado1(float lado1){
        this.lado1=lado1;
    }
    private void setLado2(float lado2){
        this.lado2=lado2;
    }
    private float getBaseMayor(){
        return baseMayor;
    }
    private float getBaseMenor(){
        return baseMenor;
    }
    private float getLado1(){
        return lado1;
    }
    private float getLado2(){
        return lado2;
    }
    public float calculaArea(){
        return ((baseMayor+baseMenor)*lado1)/2;
    }
    public float calculaPerimetro(){
        return baseMayor+baseMenor+lado1+lado2;
    }
}