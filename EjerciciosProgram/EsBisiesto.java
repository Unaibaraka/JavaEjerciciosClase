package main;

import java.util.Scanner;

public class EsBisiesto {

	public static void main(String[] args) {
		int num = 0;
		num = obtenerAnno();
		esBisiesto(num);
	}
	
	public static int obtenerAnno() {
		/* In: 
		 * 
		 * Out: un numero entero positivo proporcinado por el usuario por teclado durante la ejecucion del programa
		 */
		
		Scanner entrada=new Scanner(System.in);
		boolean ok = false; //Boolean de control para las excepciones y el entero positivo
		int numero = 0; //Variable de almacencamiento del entero positivo
		
		do {
			try {
				ok = true;
				System.out.println("Introducir numero positivo\n");
				numero = Integer.parseInt(entrada.nextLine());
				if(numero<0) {
					ok = false; //Reutilizacion del ok para controlar que se pasa un numero positivo
				}
			}
			catch(Exception e) {
				ok = false;
				System.out.println("Por favor, introduce un numero entero positivo");
			}
		}while(ok==false);
		
		entrada.close();//Cierre del teclado
		return numero;
	}
	public static void esBisiesto(int anno) {
		if(anno % 4 == 0 && anno % 100 != 0) {
			System.out.println("Es bisiesto");
		}
		else {
			System.out.println("No es bisiesto");
		}
	}

}