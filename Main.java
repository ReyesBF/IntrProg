public class Main{
  public static void main (Strig[] arg){
    coche miCoche = new coche();
    miCoche.sumarPuertas();
    System.out.println("Hola");
    System.out.println("Las puertas de tu coche son: "+miCoche.puertas);
  }
  public static class coche{
    int puertas = 0;
    public static class sumarPuerta(){
      puertas ++;
    }
  }
}
