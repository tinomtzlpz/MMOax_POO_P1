
package figurasgeometricas;

public class Octagono implements FigGeometrica{
    float lado,apotema;

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float getApotema() {
        return apotema;
    }

    public void setApotema(float apotema) {
        this.apotema= apotema;
    }
    
    public float calculaArea(){
        return ((this.calculaPerimetro() * this.apotema)/2);
    }
    public float calculaPerimetro(){
        return 8*lado;
    }
    public Octagono (float a, float l){
        this.setLado(l);
        this.setApotema(a);
    }
}
