package n2exercici2;



public class Execucio {

	public static void main(String[] args) {
		
		ClaseGenerica<ImplementadoraDoble> generica = new ClaseGenerica<ImplementadoraDoble>(new ImplementadoraDoble());
		generica.metode1();
		System.out.println();
		generica.metode2();

	}

}
