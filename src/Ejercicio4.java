

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		double billete, distancia;
		int estancia;
		final double PRECIOKM = 0.35, DESCUENTO = 0.30;
		
		System.out.print("Kilómetros recorridos: ");
		distancia=keyboard.nextDouble();
		System.out.print("Días de estancia: ");
		estancia=keyboard.nextInt();
		keyboard.close();
		
		if (distancia>1000&&estancia>7) {
				billete = (distancia*PRECIOKM)*DESCUENTO;
				System.out.printf("El billete cuesta %.2f€", billete);
		}
		else { 
			billete = (distancia*PRECIOKM);
			System.out.printf("El billete cuesta %.2f€", billete);
				
		}
		
		
		
		
		
	}

}
