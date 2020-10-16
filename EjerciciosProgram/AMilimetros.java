package main;
import java.util.Scanner;

public class AMilimetros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce metros, centimetros y milimetros");
		int metros = cogerInt(sc);
		int centimetros = cogerInt(sc);
		int milimetros = cogerInt(sc);
		pasarAMM(metros,centimetros,milimetros);
		
	}
	public static void pasarAMM(int metros, int centimetros, int milimetros) {
		System.out.println("El resultado es: " + (metros*1000 + centimetros*10 + milimetros) + " milimetros");
	}
	public static int cogerInt(Scanner sc) {//Metodo que maneja la obtencion de enteros por todo el programa, ademas de hacer tratamiento de excepciones
		int num = 0;
		boolean ok = true;
		do {
			try {
				ok = false;
				num = Integer.parseInt(sc.nextLine());
			}
			catch(Exception e) {
				ok = true;
				System.out.println("Solo se aceptan numeros enteros");
			}
		}while(ok==true);
		return num;
	}

}
