package ExamenPrimero1;

public class ColaSimple {
	private int max = 100;
	private Artesania v[] = new Artesania[max + 1];
	private int ini, fin;

	public ColaSimple() {
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

	void adicionar(Artesania elem) {
		if (!esllena()) {
			fin++;
			v[fin] = elem;
		} else
			System.out.println("Cola Simple llena");
	}

	Artesania eliminar() {
		Artesania elem = new Artesania();
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
		Artesania elem = new Artesania();
		if (esvacia())
			System.out.println("Cola vacia");
		else {
			System.out.println("\n Datos de la Cola ");
			ColaSimple aux = new ColaSimple();
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
			Artesania aux = new Artesania();
			aux.leer();
			adicionar(aux);
		}
	}

	void vaciar(ColaSimple a) {
		while (!a.esvacia())
			adicionar(a.eliminar());

	}
}
