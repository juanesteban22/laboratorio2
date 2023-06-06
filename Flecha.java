package poo;

public class Flecha {
	int longitud;
	String color;
	public Flecha() {
		longitud=18;
		color= "negro";
	}
	public Flecha(int longitud,String color) {
		this.longitud=longitud;
		this.color=color;
	}
	public void imprimirEspacio() {
	  System.out.println();
	}
	public void construirFlechas() {
		for (int i = 0; i < longitud; i++) {
			System.out.print("-");
		}
		System.out.print(">");
	}

}
