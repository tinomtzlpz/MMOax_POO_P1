

/**
 *
 * @author Sony
 */
package figurasgeometricas;


public class Cuadrado extends FigGeometrica{
      
    
   private int base;
   private int altura;

    public Cuadrado(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public float calculaArea(){
        return base*altura;
    }
    
    public float calculaPerimetro(){
        return  (base*2)+(altura*2);
    }
    
    
}
