package n1exercici1;

public class NoGenericMethods {

	public static void main(String[] args) {
		
		String exemple1 = "Exemple1";
		String exemple2 = "Exemple2";
		String exemple3 = "Exemple3";
		
		NoGenericMethods prova1 = new NoGenericMethods(exemple1, exemple2, exemple3);
		NoGenericMethods prova2 = new NoGenericMethods(exemple2, exemple3, exemple1);
		NoGenericMethods prova3 = new NoGenericMethods(exemple3, exemple1, exemple2);
		NoGenericMethods prova4 = new NoGenericMethods(exemple1, exemple3, exemple2);
		
		System.out.println(prova1.getCamp1() + " " + prova1.getCamp2() + " " + prova1.getCamp3());
		System.out.println(prova2.getCamp1() + " " + prova2.getCamp2() + " " + prova2.getCamp3());
		System.out.println(prova3.getCamp1() + " " + prova3.getCamp2() + " " + prova3.getCamp3());
		System.out.println(prova4.getCamp1() + " " + prova4.getCamp2() + " " + prova4.getCamp3());

	}
	
	private String camp1;
	private String camp2;
	private String camp3;
	
	public NoGenericMethods(String camp1, String camp2, String camp3) {
		super();
		this.camp1 = camp1;
		this.camp2 = camp2;
		this.camp3 = camp3;
	}

	public String getCamp1() {
		return camp1;
	}

	public void setCamp1(String camp1) {
		this.camp1 = camp1;
	}

	public String getCamp2() {
		return camp2;
	}

	public void setCamp2(String camp2) {
		this.camp2 = camp2;
	}

	public String getCamp3() {
		return camp3;
	}

	public void setCamp3(String camp3) {
		this.camp3 = camp3;
	}
	
	
}
