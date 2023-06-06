package poo;

public class flechaPrincipal {
Flecha flecha1,flecha2,flecha3;
public static void main(String[]args) {
	flechaPrincipal miPrincipal = new flechaPrincipal();
}
public flechaPrincipal() {
	flecha1=new Flecha();
	flecha1.construirFlechas();
	flecha1.imprimirEspacio();
	
	flecha2=new Flecha();
	flecha2.longitud=34;
	flecha2.color="rojo";
	flecha2.construirFlechas();
	flecha2.imprimirEspacio();
	
	flecha3= new Flecha(12,"negro");
	flecha3.construirFlechas();
	flecha3.imprimirEspacio();
}

}
