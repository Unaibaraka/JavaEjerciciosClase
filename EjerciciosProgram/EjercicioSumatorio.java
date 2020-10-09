package principal;
import java.util.Scanner;

public class EjercicioSumatorio {
	public static void main(String[] args) {
		
		int numero = pedirEnteroPositivo(); //Llamada al metodo pedirEnteroPositivo
		int suma=Sumatorio(numero); //Llamada al metodo sumatorio
		System.out.println(suma); //Se imprime el resultado de sumatorio
	}
	
	public static int Sumatorio(int numerito)
	/* In: un numero entero positivo
	 * 
	 * Out: el resultado del sumatorio de 0 al numero entero proporcionado en la entrada
	 */
	{
		int resultado=0;
		for(int contador=numerito;contador>0;contador--) //Bucle del sumatorio
		{
			resultado+=numerito;
			numerito--;
		}
		return resultado;
	}
	
	public static int pedirEnteroPositivo() {
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
	
}
