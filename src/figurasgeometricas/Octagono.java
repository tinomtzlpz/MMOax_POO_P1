
package figurasgeometricas;

public class Octagono {
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
        this.apotema = apotema;
    }
    
    public float calculaArea(float lado, float apotema){
        return ((this.calculaPerimetro(lado) * this.apotema)/2);
    }
    public float calculaPerimetro(float lado){
        return 8*lado;
    }
    public Octagono (float a, float l){
        this.setLado(l);
        this.setApotema(a);
    }
}
