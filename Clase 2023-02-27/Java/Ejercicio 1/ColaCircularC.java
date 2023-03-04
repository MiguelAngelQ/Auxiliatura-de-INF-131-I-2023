package clase23022023;

public class ColaCircularC {
	private int max = 50;
	private char v[] = new char[max + 1];
	private int ini, fin;

	ColaCircularC() {
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

	void adicionar(char elem) {
		if (!esllena()) {
			fin = (fin + 1) % max;
			v[fin] = elem;
		} else
			System.out.println("Cola circular llena");
	}

	char eliminar() {
		char elem = ' ';
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
		char elem = ' ';
		if (esvacia())
			System.out.println("Cola vacia");
		else {
			System.out.println("\n Datos de la Cola ");
			ColaCircularC aux = new ColaCircularC();
			while (!esvacia()) {
				elem = eliminar();
				aux.adicionar(elem);
				System.out.println(elem);
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
			char x = ' ';
			x = Leer.dato().charAt(0);
			adicionar(x);
		}
	}

	void vaciar(ColaCircularC a) {
		while (!a.esvacia())
			adicionar(a.eliminar());

	}
}
