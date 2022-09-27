public class Main
{
	public static void main(String[] args) {
		System.out.println("EJERCICIO CONDICIONALES");
		System.out.println("");
		
		int numerolf = 788;
		int numeroWhile = 0;
		int numeroFOr = 0;
    String estacion = "INVIERNO";
	
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
		for(int x= 3 ; numeroFor < x ;  numeroFor ++){
	        System.out.println(numeroFor);
	    }
		}
    
    //switch
    switch(estacion){
		    case "PRIMAVERA":
		        System.out.println("Es "+ estacion);
		        break;
		    case "INVIERNO":
		        System.out.println("Es "+ estacion);
		        break;
		    case "OTOÑO":
		        System.out.println("Es "+ estacion);
		        break;
		    case "VERANO":
		        System.out.println("Es "+ estacion);
		        break;
		    default:
		        System.out.println("No estableciste una estación");
		}
	}
}
