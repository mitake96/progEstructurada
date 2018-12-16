
import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		int x;
		int y;
		int z;
		
		System.out.print("Número 1: ");
		x=keyboard.nextInt();
		System.out.print("Número 2: ");
		y=keyboard.nextInt();
		System.out.print("Número 3: ");
		z=keyboard.nextInt();
		keyboard.close();
		
		if (x==z&&x==y) {
			System.out.printf("Hay 3 numeros igual a " + x);
		}
		
		else if (x==z||x==y||z==y) {
				if (x==z) {
					System.out.printf("Hay 2 números iguales a " + x);
				}
				else if (y==z) {
					System.out.printf("Hay 2 números iguales a " + y);
				}
		}
		
		
		else {
			System.out.println("No hay números iguales");
		}
	
}
	
	
}
