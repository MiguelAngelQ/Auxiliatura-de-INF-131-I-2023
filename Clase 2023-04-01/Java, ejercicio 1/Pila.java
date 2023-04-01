package ExamenPrimero1;

class Pila {
	private int max = 50;
	private Artesania v[] = new Artesania[max + 1];
	private int tope;

	Pila() {
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

	void adicionar(Artesania elem) {
		if (!esllena()) {
			tope++;
			v[tope] = elem;
		} else
			System.out.println("Pila llena");
	}

	Artesania eliminar() {
		Artesania elem = new Artesania();
		if (!esvacia()) {
			elem = v[tope];
			tope--;
		} else
			System.out.println("Pila vacia");
		return (elem);
	}

	void mostrar() {
		Artesania elem = new Artesania();
		if (esvacia())
			System.out.println("Pila vacia");
		else {
			System.out.println("\n Datos de la Pila ");
			Pila aux = new Pila();
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
			Artesania elem = new Artesania();
			elem.leer();
			this.adicionar(elem);
		}
	}

	void vaciar(Pila a) {
		while (!a.esvacia())
			adicionar(a.eliminar());

	}
}
