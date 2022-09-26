public class Main{
  public static void main (String[] arg){
    coche miCoche = new coche();
    miCoche.sumarPuerta();
    System.out.println("Hola");
    System.out.println("Las puertas de tu coche son: "+miCoche.puertas);
  }
  public static class coche{
      int puertas = 0;
      public void sumarPuerta(){
          puertas ++;
    }
  }
}
