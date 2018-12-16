

import java.util.Scanner;

public class Ejercicio1 { 	//1.Hacer un programa que lea por teclado un número entero y nos diga si el número es positivo,	negativo o cero.

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		int x;
		System.out.print("Introduce un número: ");
		x=keyboard.nextInt();
		keyboard.close();
		
		if(x>=1)
			System.out.println("El número es positivo");
		else if(x==0)
			System.out.println("El número es 0");
		else if(x<=-1)
			System.out.println("El número es negativo");
		
		
	}
}
