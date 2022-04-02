package n2exercici2;

public class ClaseGenerica <T extends Interficie1 & Interficie2>{
	
	private T objecteImplementador;
	
	public ClaseGenerica(T objecte) {
		
		objecteImplementador=objecte;
	}
	
	public void metode1() {
		
		System.out.println("Executant metode1() de la ClasseGenerica()");
		objecteImplementador.metodeInterficie1();
	}
	
	public void metode2() {
		
		System.out.println("Executant metode2() de la ClasseGenerica()");
		objecteImplementador.metodeInterficie2();
	}

}
