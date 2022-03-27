package n1exercici3;

import java.util.Date;

public class GenericMethods {

	public static void main(String[] args) {
		
		Object objecte = new Object();
		Date data = new Date();
		
		GenericMethods.f("Hola", true);		
		
		GenericMethods.f(189.5672, data);
		
		GenericMethods.f(objecte, 35);
		
	}
	
	public static <T, U, V> void f(T entrada1, U entrada2){
		
		V entrada3 = (V) new Date();
		
		System.out.println(entrada1);
		System.out.println(entrada2);
		System.out.println(entrada3);
		System.out.println();
	}

}
