package main;
import java.util.Scanner;
public class MenuPintar {
	public static void main(String[] args) {
		menu(); //El main unicamente llama al menu
	}
	
	public static void menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Elige\n1-Imprimir x veces un caracter\n2-Convertir un caracter en minuscula\n3-Convertir un caracter en mayuscula\n4-Convertir un string en minuscula\n5-Convertir un string en mayuscula\n6-Salir del programa");
		
		while(true){ //Bucle infinito en el que la unica manera de salir es elegir el programa numero 6, que rompe el bucle saliendo del programa con System.exit()
			int cod = Integer.parseInt(sc.nextLine());
			switch(cod) {
			
			case 1:
				System.out.println("Indica el caracter");
				String str = sc.nextLine();
				char car = str.charAt(0);
				System.out.println("Indica el numero de veces");
				int num = Integer.parseInt(sc.nextLine());
				pintarLinea(car, num);
				System.out.println("Indica la siguiente opcion");
				break;
				
			case 2:
				System.out.println("Indica el caracter");
				str = sc.nextLine();
				car = str.charAt(0);
				caracterMinus(car);
				System.out.println("Indica la siguiente opcion");
				break;
				
			case 3:
				System.out.println("Indica el caracter");
				str = sc.nextLine();
				car = str.charAt(0);
				caracterMayus(car);
				System.out.println("Indica la siguiente opcion");
				break;
				
			case 4:
				System.out.println("Indica el String");
				str = sc.nextLine();
				strMinus(str);
				System.out.println("Indica la siguiente opcion");
				break;
				
			case 5:
				System.out.println("Indica el String");
				str = sc.nextLine();
				strMayus(str);
				System.out.println("Indica la siguiente opcion");
				break;
				
			case 6:
				System.out.println("Adios");
				sc.close();
				System.exit(0);
				break;
			}
		}
		
	}
	
	public static void pintarLinea(char c, int num) { //Metodo que imprime por pantalla el caracter c un numero num de veces
		for(int i=1;num>=i;i++) {
			System.out.printf("%c%n", c);
		}
	}
	
	public static void caracterMinus(char c) { //Metodo que pasa un caracter de mayuscula a minuscula
		System.out.println(c + " minuscula " + Character.toLowerCase(c));
	}
	
	public static void caracterMayus(char c) { //Metodo que pasa un caracter de minuscula a mayuscula
		System.out.println(c + " MAYUSCULA " + Character.toUpperCase(c));
	}
	
	public static void strMinus(String str) { //Metodo que pasa un string de mayuscula a minuscula
		System.out.println(str + " minusculas " + str.toLowerCase());
	}
	
	public static void strMayus(String str) { //Metodo que pasa un string de minuscula a mayuscula
		System.out.println(str + " MAYUSCULAS " + str.toUpperCase());
	}
}
