
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		double n1, n2, n3;
		
		System.out.print("N�mero 1: ");
	    n1=keyboard.nextDouble();
	    System.out.print("N�mero 2: ");
	    n2=keyboard.nextDouble();
	    System.out.print("N�mero 3: ");
	    n3=keyboard.nextDouble();
	    keyboard.close();
	    
	    if (n1 >= n2 && n2 >= n3) {
	    	System.out.printf("%d %d %d", n3, n2, n1);
	    
	    }
	    
	    else if (n2 >= n1 && n1 >=n3) {
	    	System.out.printf("%d %d %d", n3, n1, n2);
	    }
	    
	    else {
	    	System.out.println("ERROR");
	    }
	    // ------------------------- Acabar
	
	}

}
