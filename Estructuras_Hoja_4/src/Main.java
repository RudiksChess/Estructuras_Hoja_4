import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		int opcion= 0; 
		Scanner entrada = new Scanner(System.in);
		
		while(opcion != 6){
			System.out.println("-------- Programa de infix a postfix ------");
			System.out.println("Seleccionar una opcion:");
			System.out.println("1. Encender programa");
			System.out.println("2. Cerrar");
			System.out.println("Respuesta: ");
			int a= entrada.nextInt();
			
			
			if (a == 1){
				System.out.println("Seleccione de Stack para la implementación de datos.txt: ");
				System.out.println("1. ArrayList");
				System.out.println("2. Vector");
				System.out.println("3. Lista");
				System.out.println("Respuesta: ");
				
				int b= entrada.nextInt();
				
				if (b==1) {
					
				}
				
				else if (b==2) {
					
				}
				
				else if (b==3) {
					System.out.println("Seleccione de la lista: ");
					System.out.println("1. Simplemente Encadenada");
					System.out.println("2. Doblemente Encadenada");
					System.out.println("Respuesta: ");
					
					int c= entrada.nextInt();
					
					
					if (c==1) {
						
					}
					
					else if (c==2) {
						
					}
					
					else {
						System.out.println("El programa se ha cerrado. Valor desconocido.");
					}
					
				}
					
				
				
				
				else {
					System.out.println("El programa se ha cerrado. Valor desconocido.");
				}
				
			}

			else{
				System.out.println("El programa se ha cerrado.");
				}
			
			}
		
		
		
		
	}
}