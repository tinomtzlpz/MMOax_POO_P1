package figurasgeometricas;

/**
 *
 * @author P3RZIV4L
 */
public class Pentagono implements FigGeometrica {
     
    private float Apotema=5;
    private float Lado=8;
    
    public Pentagono(float Apotema,float Lado){
        this.Apotema=Apotema;
        this.Lado=Lado;
          }
    
   private void setApotema(float Apotema){
          }
   
  private void setLado(float Lado){
          }
  
   private float getApotema(){
       return Apotema;
          }
   
   private float getLado(){
       return Lado;
          }
   
   public float calculaPerimetro(){
       return (Lado*5);
          }
   
   public float calculaArea(){
       return ((Lado*5)*(Apotema)/2);
          }
   
       } 