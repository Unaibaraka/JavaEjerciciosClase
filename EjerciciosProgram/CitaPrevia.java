package main;
import java.util.Scanner;

public class CitaPrevia {
	private static int TIS;
	private static String Apellido1;
	private static String Fecha;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		insertarDatos(sc);
	}
	
	public static void insertarDatos(Scanner sc) {
		System.out.println("Inserta el TIS");
		int num = cogerInt(sc); //Metodo para coger enteros con tratamiento de excepciones
		TIS = num;
		System.out.println("Inserta el primer apellido");
		Apellido1 = sc.nextLine();
		System.out.println("Inserta la fecha");
		Fecha = sc.nextLine();
		seleccionServicio(sc);
	}
	
	public static void seleccionServicio(Scanner sc) {
		System.out.println("Elige servicio\n1-Anula una cita\n2-Concierta una cita");
		int select = cogerInt(sc);
		switch (select) { // Los casos 1 y 2 avanzan al siguiente paso, el default llama recursivamente al mismo metodo hasta que se de un numero que avance al siguiente paso
		case 1:
			anularCita(sc);
			break;
		case 2:
			concertarCita(sc);
			break;
		default:
			System.out.println("Numero Erroneo\n");
			seleccionServicio(sc);
			break;
		}
		
	}
	
	public static void anularCita(Scanner sc) { //Metodo que coger el numero de la cita y la anula
		System.out.println("Inserta el numero de cita");
		int num = cogerInt(sc);
		System.out.println("Cita con numero " + num + " anulada");
	}
	
	public static void concertarCita(Scanner sc) { //Metodo para concertar la cita con uno de los encargados
		System.out.println("Elige servicio\n1-Cita con enfermero/a\n2-Cita con medico\n3-Volver al inicio");
		int select = cogerInt(sc);
		switch (select) { //case 1 y 2 llevan al mismo metodo, pero con un parametro de entrada distinto, 3 vuelve a llamar al menu de login y default llama recursivamente a este metodo
		case 1:
		case 2:
			indicarContacto(sc, select);
			break;
		case 3:
			insertarDatos(sc);
			break;
		default:
			System.out.println("Numero erroneo\n");
			concertarCita(sc);
			break;
		}
	}
	
	public static void indicarContacto(Scanner sc, int select) { //Este metodo pide el tipo de contacto que habra entre profesional y paciente, ademas de pasar a string la eleccion anterior
		String prof = "";
		if (select==1) {
			prof = "enfermero/a";
		}
		else {
			prof = "medico";
		}
		System.out.println("Indica tipo de contacto\n1-Presencial\n2-Telefono\n3-Volver al inicio");
		int select2 = cogerInt(sc);
		switch (select2) {//case 1 y 2 llevan al mismo metodo, pero con un parametro de entrada distinto, 3 vuelve a llamar al menu de login y default llama recursivamente a este metodo
		case 1:
		case 2:
			imprimirDatos(prof,select2);
			break;
		case 3:
			insertarDatos(sc);
			break;
		default:
			System.out.println("Numero erroneo");
			indicarContacto(sc,select);
			break;
		}
	}
	
	public static void imprimirDatos(String prof, int select) { //Pasa a string la eleccion anterior e imprime por pantalla los datos dados hasta ahora
		String cont = "";
		if (select==1) {
			cont = "presencial";
		}
		else {
			cont = "telefono";
		}
		System.out.println("Ha concertado usted una cita con su " + prof + " de manera " + cont + " con los datos:\nTIS: " + TIS + "\nApellido: " + Apellido1 +"\nAnno de nacimiento " + Fecha );
		
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
