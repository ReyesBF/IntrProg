public class Mainn
{
	public static void main(String[] args) {
		System.out.println("EJERCICIO CONDICIONALES");
		System.out.println("");
		
		int numerolf = 788;
		int numeroWhile = 0;
		int numeroFOr = 0;
	
		// condicional IF
		if (numerolf < 0){
		    System.out.println("El numero es negativo");
		} else if (numerolf == 0){
		    System.out.println("El numero es cero");
		} else {
		    System.out.println("El numero es positivo");
		}
		
		//while
		while (numeroWhile <3){
		    System.out.println(numeroWhile ++);
		}
		
		//Do While
		do{
		    System.out.println("El numero es menor a 3");
		} while(numerolf <3);
		
		// for
		for (int x = 0; x <3; numeroFOr++){
		    System.out.println(numeroFOr);
		}
	}
}
