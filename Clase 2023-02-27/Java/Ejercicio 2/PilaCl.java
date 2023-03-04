package Clase28022023;

class PilaCl {
	private int max = 50;
	private Cliente v[] = new Cliente[max + 1];
	private int tope;

	PilaCl() {
		tope = 0;
	}

	boolean esvacia() {
		if (tope == 0)
			return (true);
		return (false);
	}

	boolean esllena() {
		if (tope == max)
			return (true);
		return (false);
	}

	int nroelem() {
		return (tope);
	}

	void adicionar(Cliente elem) {
		if (!esllena()) {
			tope++;
			v[tope] = elem;
		} else
			System.out.println("Pila llena");
	}

	Cliente eliminar() {
		Cliente elem = new Cliente();
		if (!esvacia()) {
			elem = v[tope];
			tope--;
		} else
			System.out.println("Pila vacia");
		return (elem);
	}

	void mostrar() {
		Cliente elem = new Cliente();
		if (esvacia())
			System.out.println("Pila vacia");
		else {
			System.out.println("\n Datos de la Pila ");
			PilaCl aux = new PilaCl();
			while (!esvacia()) {
				elem = eliminar();
				aux.adicionar(elem);
				elem.mostrar();
			}
			this.vaciar(aux);
		}
	}

	void llenar(int n) {
		for (int i = 1; i <= n; i++) {
			Cliente elem = new Cliente();
			elem.leer();
			this.adicionar(elem);
		}
	}

	void vaciar(PilaCl a) {
		while (!a.esvacia())
			adicionar(a.eliminar());

	}
}
