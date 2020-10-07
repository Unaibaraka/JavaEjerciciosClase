package principal;
import java.util.Scanner;


public class Main {
	
	 public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //Se abre el scanner por teclado
		
		System.out.println("Introduce un numero");
		int entero = Integer.parseInt(sc.nextLine());
		
		int i = 1; //Variable del bucle
		
		while(i<=10) {
			System.out.println(entero +  "*" +  i + "=" + (entero*i)); 
			i = i+1;
		}
		
		i = 1; //Reinicio de la variable del bucle
		
		do {
			System.out.println(entero +  "*" +  i + "=" + (entero*i)); 
			i=i+1;
		}while(i<=10);
		
		for(int j=1;j<=10;j++) { //j como variable del bucle
			System.out.println(entero +  "*" +  j + "=" + (entero*j));
		}
		sc.close(); //Se cierra el scanner para evitar perdida de memoria
		
		
		
	 	}

}

