
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		int x;
		int y;
		
		System.out.print("N�mero 1: ");
		x=keyboard.nextInt();
		System.out.print("N�mero 2: ");
		y=keyboard.nextInt();
		keyboard.close();
		
		if(x%y==0) {
			System.out.printf(x + " Es m�ltiplo de " + y);
		}
		else {
			System.out.println(x + " No es m�ltiplo de " + y);
		}
		
	
	
	
	}
}
