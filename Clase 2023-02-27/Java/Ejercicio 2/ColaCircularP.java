package Clase28022023;

public class ColaCircularP {
	private int max = 50;
	private Producto v[] = new Producto[max + 1];
	private int ini, fin;

	ColaCircularP() {
		ini = fin = 0;
	}

	int nroelem() {
		return ((max + fin - ini) % max);
	}

	boolean esvacia() {
		if (nroelem() == 0)
			return (true);
		return (false);
	}

	boolean esllena() {
		if (nroelem() == max - 1)
			return (true);
		return (false);
	}

	void adicionar(Producto elem) {
		if (!esllena()) {
			fin = (fin + 1) % max;
			v[fin] = elem;
		} else
			System.out.println("Cola circular llena");
	}

	Producto eliminar() {
		Producto elem = new Producto();
		if (!esvacia()) {
			ini = (ini + 1) % max;
			elem = v[ini];
			if (nroelem() == 0)
				ini = fin = 0;
		} else
			System.out.println("Cola circular vacia");
		return (elem);
	}

	void mostrar() {
		Producto elem = new Producto();
		if (esvacia())
			System.out.println("Cola vacia");
		else {
			System.out.println("\n Datos de la Cola ");
			ColaCircularP aux = new ColaCircularP();
			while (!esvacia()) {
				elem = eliminar();
				aux.adicionar(elem);
				elem.mostrar();
			}
			while (!aux.esvacia()) {
				elem = aux.eliminar();
				adicionar(elem);
			}
		}
	}

	void llenar(int n) {
		int i;
		for (i = 1; i <= n; i++) {
			Producto elem = new Producto();
			elem.leer();
			adicionar(elem);
		}
	}

	void vaciar(ColaCircularP a) {
		while (!a.esvacia())
			adicionar(a.eliminar());

	}
}
