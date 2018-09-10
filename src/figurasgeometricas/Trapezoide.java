package figurasgeometricas;

public class Trapezoide extends FigGeometrica{
    private float baseMayor;
    private float baseMenor;
    private float altura;
    
    public Trapezoide(float baseMayor, float baseMenor, float altura){
        this.baseMayor=baseMayor;
        this.baseMenor=baseMenor;
        this.altura=altura;
    }
    
    private void setBaseMayor(float baseMayor){
        this.baseMayor=baseMayor;
    }
    private void setBaseMenor(float baseMenor){
        this.baseMenor=baseMenor;
    }
    private void setAltura(float altura){
        this.altura=altura;
    }
    private float getBaseMayor(){
        return baseMayor;
    }
    private float getBaseMenor(){
        return baseMenor;
    }
    private float getAltura(){
        return altura;
    }
    public float calculaArea(){
        return ((baseMayor+baseMenor)*altura)/2;
    }
}