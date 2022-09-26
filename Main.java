public class Main{
  public static void main (String[] arg){
    //crea nuevo objeto
    coche miCoche = new coche();
    //llama a metodo
    miCoche.sumarPuerta();
    //imprime resultados
    System.out.println("Hola");
    System.out.println("Las puertas de tu coche son: "+miCoche.puertas);
    // llama a la función suma
    suma(1,3,7);
  }
  /*
  Seré honesto, no tengo ni ***** de por qué esta función no funiona (xD) debajo de la clase coche
  pero sí arriba de esa clase. bien dicen por ahí:
  
  "Si algo funciona no le muevas xD" 
  
  jajajajajajaaja
  */
  public static void suma(int a, int b, int c){
	    int resultado = a + b + c;
	    System.out.println("Este es tu resultado de la función suma: " +resultado);
	}
  public static class coche{
      int puertas = 0;
      public void sumarPuerta(){
          puertas ++;
    }
  }
}

