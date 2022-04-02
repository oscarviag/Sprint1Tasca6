package n2exercici1;

public class Execucio {

	public static void main(String[] args) {
		
		
		
		System.out.println("Classe Generica() fent servir mètodes de la MiInterfaz");
		Generica<Implementadora> generica = new Generica<Implementadora>(new Implementadora());
		generica.metodeGeneric();

	}

}
