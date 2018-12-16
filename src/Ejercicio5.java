
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		byte tipodia, festivo;
		int horas;
	    final int preciodiurna = 3;
	    final double precionocturna = 4.80;
	    double precio1, precio2, precio3, precio4;
	    
	    System.out.print("¿Es una jornada diurna(1) o nocturna(2)? ");
	    tipodia=keyboard.nextByte();
	    System.out.print("¿Es un día festivo (1) o no (2)? ");
	    festivo=keyboard.nextByte();
	    System.out.print("¿Cúantas horas ha trabajado? ");
	    horas=keyboard.nextByte();
	    keyboard.close();
	    
	    if (tipodia == 1 && festivo == 1) {
	    	
	    	precio1 = ((preciodiurna*horas)*1.20);
	    	System.out.printf("El precio es %.2f€", precio1);
	    }
	    
	    else if (tipodia == 1 && festivo == 2) {
	    	
	    	precio2 = preciodiurna*horas;
	    	System.out.printf("El precio es %.2f€", precio2);
	    }
	    
	    else if (tipodia == 2 && festivo == 1) {
	    	precio3 = (precionocturna*horas)*1.80;
	    	System.out.printf("El precio es %.2f€", precio3);
	    }
	    
	    else if (tipodia == 2 && festivo == 2) {
	    	precio4 = (precionocturna*horas);
	    	System.out.printf("El precio es 1 %.2f€ ", precio4);
	    }
	    else {
	    	System.out.println("ERROR, ha escrito un número incorrecto");
	    }
	}

}
