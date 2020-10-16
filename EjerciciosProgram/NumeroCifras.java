package main;
import java.util.Scanner;

public class NumeroCifras {

	public static void main(String[] args) {
		System.out.println("Introduce tu numero");
		Scanner sc = new Scanner(System.in);
		int num = 0;
		boolean ok = true;
		do {
			try {
				ok = false;
				num = Integer.parseInt(sc.nextLine());
			}
			catch(Exception e) {
				ok = true;
				System.out.println("Debes introducir un entero");
			}
		}while(ok==true);
		sc.close();
		cifras(num);
	}
	
	public static void cifras(int num) {
		String cadena = Integer.toString(num);
		System.out.println("La longitud es " + cadena.length() );
		}
	}

