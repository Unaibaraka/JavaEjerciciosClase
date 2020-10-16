package main;
import java.util.Scanner;

public class EjercicioStrings {
	
	public static void main(String[] args) {
		System.out.println("Introduce un string");
		Scanner sc = new Scanner(System.in);
		String cadena = sc.nextLine();
		sc.close();
		System.out.println("La longitud del string es " + cadena.length());
		if (cadena.length()==0||cadena.length()==1) { //El caso de un string de 0 o 1 elementos es un caso especial, por lo que se trata de manera distinta
			str1Ele(cadena);
		}
		else {
			primeraMitad(cadena);
			ultimoCaracter(cadena);
			stringInversa(cadena);
		}
	}
	
	public static void primeraMitad(String cadena) {
		System.out.println("Primera mitad " + cadena.substring(0,cadena.length()/2));
	}
	
	public static void ultimoCaracter(String cadena) {
		System.out.println("Ultimo caracter " + cadena.charAt(cadena.length()-1));
	}
	
	public static void stringInversa(String cadena) {
		String inversa = "";
		for (int i=cadena.length()-1;i>=0;i--) {
			inversa = inversa.concat(String.valueOf(cadena.charAt(i)));
		}
		System.out.println("Forma inversa " + inversa);
	}
	
	public static void str1Ele(String cadena) {
		System.out.println("Primera mitad " + cadena);
		System.out.println("Ultimo caracter " + cadena);
		System.out.println("Forma inversa " + cadena);
	}
}
