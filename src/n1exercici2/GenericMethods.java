package n1exercici2;

import java.util.Date;

public class GenericMethods {

	public static void main(String[] args) {
		
		Object objecte = new Object();
		Date data = new Date();
		
		GenericMethods.f("Hola",35,true);		
		
		GenericMethods.f(189.5672, data, objecte);
		
		GenericMethods.f(data, true, "Exemple");
		
	}
	
	public static <T, U, V> void f(T entrada1, U entrada2, V entrada3){
		
		System.out.println(entrada1);
		System.out.println(entrada2);
		System.out.println(entrada3);
		System.out.println();
	}

}
