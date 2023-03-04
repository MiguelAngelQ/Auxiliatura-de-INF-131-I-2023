package Clase28022023;

public class ColaSimpleV {
	private int max = 100;
	private Venta v[] = new Venta[max + 1];
	private int ini, fin;

	public ColaSimpleV() {
		ini = fin = 0;
	}

	boolean esvacia() {
		if (ini == 0 && fin == 0)
			return (true);
		return (false);
	}

	boolean esllena() {
		if (fin == max)
			return (true);
		return (false);
	}

	int nroelem() {
		return (fin - ini);
	}

	void adicionar(Venta elem) {
		if (!esllena()) {
			fin++;
			v[fin] = elem;
		} else
			System.out.println("Cola Simple llena");
	}

	Venta eliminar() {
		Venta elem = new Venta();
		if (!esvacia()) {
			ini++;
			elem = v[ini];
			if (ini == fin)
				ini = fin = 0;
		} else
			System.out.println("Cola Simple vacia");
		return (elem);
	}

	void mostrar() {
		Venta elem = new Venta();
		if (esvacia())
			System.out.println("Cola vacia");
		else {
			System.out.println("\n Datos de la Cola ");
			ColaSimpleV aux = new ColaSimpleV();
			while (!esvacia()) {
				elem = eliminar();
				aux.adicionar(elem);
				elem.mostrar();
			}
			vaciar(aux);
		}
	}

	void llenar(int n) {
		int i;
		for (i = 1; i <= n; i++) {
			Venta aux = new Venta();
			aux.leer();
			adicionar(aux);
		}
	}

	void vaciar(ColaSimpleV a) {
		while (!a.esvacia())
			adicionar(a.eliminar());

	}
}
