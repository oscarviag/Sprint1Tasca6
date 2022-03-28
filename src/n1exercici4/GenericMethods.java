package n1exercici4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class GenericMethods {

	public static <T> void main(String[] args) {
		

		List<T> exemple1 = new ArrayList<>();
		Object objecte = new Object();
		Integer un=1;
		Integer dos=2;
		
				
		exemple1.add((T) "Exemple1");
		exemple1.add((T) un);
		exemple1.add((T) "Exemple2");
		exemple1.add((T) dos);
		exemple1.add((T) objecte);
		exemple1.add((T) new Date());
				
		GenericMethods.f(exemple1);
				
	}
	
	public static <T> void f(T llista){
		
		
			System.out.println(llista);

	}
	

}
