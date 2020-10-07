package principal;

import java.util.Scanner;

public class Ejercicio14 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //Apertura del escaner
		boolean ok = true; //Variable para comprobacion de excepciones
		int empleados = 0; //Se inicializa la variable empleados que se usara varias veces en el codigo
		
		System.out.println("Cuantos empleados vas a introducir");
		do { //Se pedira la cantidad de empleados hasta que se obtenga un entero
			try {
				ok = false;
				empleados = Integer.parseInt(sc.nextLine()); //Cantidad de vueltas que dara el bucle
			}catch(Exception e) {
				ok = true;
				System.out.println("Introduce un entero");
			}
		}while(ok==true);
		
		//Se inicializan las variables en las que se contará el total de sueldos, los bajos (1000 a 3000) y los altos (mas de 3000)
		int total = 0; 
		int sueldoBajo = 0;
		int sueldoAlto = 0;
		
		//Bucle en el que se introducen los numeros
		int sueldo = 0; //Inicializamos el sueldo que se usara en dos partes distintas del codigo
		for(int i = 0;i<empleados;i++) { //Empezamos desde 0, se puede empezar de 1 pero el condicional seria "<="
			
			System.out.println("Introduce un sueldo"); //Pedimos numero
			do {
				try {
					ok = false;
					sueldo = Integer.parseInt(sc.nextLine());
				}catch(Exception e) {
					ok = true;
					System.out.println("Introduce un entero");
				}
			}while(ok==true);
			
			
			if (sueldo <=3000) { //Si el sueldo es menor que 3000, entra en sueldos bajos
				sueldoBajo++;
			}
			else { //Si no, en altos
				sueldoAlto++;
			}
			total = total + sueldo;
			
		}
		
		//Impresion de numeros y cerrado del teclado
		System.out.println("El numero de sueldos bajos es " + sueldoBajo);
		System.out.println("El numero de sueldos altos es " + sueldoAlto);
		System.out.println("El gasto total en sueldos es " + total);
		sc.close();
	}
}
