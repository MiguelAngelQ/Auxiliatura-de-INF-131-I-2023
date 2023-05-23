package Ej2;

public class Main {

	public static void main(String[] args) {
		ABinarioP a = new ABinarioP();
		a.setRaiz(new NodoP());
		a.crear(a.getRaiz());
  		a.ejercicio2(a.getRaiz(), 5);
	}
}
