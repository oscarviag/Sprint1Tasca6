package n2exercici1;

public class Generica <T extends MiInterfaz>{
	
	private T implementadora;
	
	public Generica(T objecte) {
		
		this.implementadora=objecte;
	}
	
	public void metodeGeneric() {
		
		implementadora.metode1();
		implementadora.metode1();
	}

}
