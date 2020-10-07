package principal;

import java.util.Scanner;

public class Ejercicio17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//Apertura del escaner
		
		boolean ok = true; //Variable de control de excepciones
		
		
		int saldo = 0; //Variable del saldo
		int saldoAcreedores = 0; //Saldo total de los acreedores
		int nCuenta = 0; //Variable del numero de cuenta
		
		while (nCuenta >= 0) { //Condicion del bucle: el numero de cuenta es positivo (contamos 0 como positivo)
			do {
				System.out.println("Introduce el numero de cuenta");
				try{
					//Al ser las dos excepciones de la misma naturaleza se pueden colocar en el mismo bloque. No se diferencia entre un error en la insercion del numero de cuenta y en la insercion del saldo de la cuenta. Un error en el saldo de la cuenta hara que se deba volver a introducir el numero de la cuenta, creando un sistema para poder repetir el numero en caso de error.
					
					ok = false;
					nCuenta = Integer.parseInt(sc.nextLine());
					if(nCuenta >=0) { //Solo se introduce el saldo si el numero de cuenta es 0 o positivo, ya que el programa debe entonces imprimir por pantalla el saldo total de acreedores y cerrarse
						
						System.out.println("Introduce el saldo de la cuenta");
						saldo = Integer.parseInt(sc.nextLine());
						System.out.println("El numero de la cuenta es " + nCuenta);
						
						if(saldo>0) { // Se notifica el estado del numero de la cuenta
							System.out.println("El estado es: Acreedor");
							saldoAcreedores = saldoAcreedores + saldo; //En el caso de acreedor, tambien se suma al saldo total de estos
						}
						else if(saldo ==0) {
							System.out.println("El estado es: Nulo");
						}
						else {
							System.out.println("El estado es deudor");
						}
					}
				}catch(Exception e) { // Si se introduce un valor que no es un entero, se resolvera la excepcion NumberFormatException
					ok = true; //Al saltar excepcion, se repite
					System.out.println("Por favor introduce correctamente los datos. Solo se aceptan enteros"); //Mensaje de error
				}
			}while (ok==true); //ok solo sera true si atrapa una excepcion
		}
		
		System.out.println("El saldo total de los acreedores es " + saldoAcreedores);
		
		sc.close();//Cierre del escaner
	}

}
