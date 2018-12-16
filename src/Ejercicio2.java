
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		int x;
		int y;
		
		System.out.print("Número 1: ");
		x=keyboard.nextInt();
		System.out.print("Número 2: ");
		y=keyboard.nextInt();
		keyboard.close();
		
		if(x%y==0) {
			System.out.printf(x + " Es múltiplo de " + y);
		}
		else {
			System.out.println(x + " No es múltiplo de " + y);
		}
		
	
	
	
	}
}
