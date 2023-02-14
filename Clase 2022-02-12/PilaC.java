
class PilaC {
	private int max = 30;
	private Cuaderno v[] = new Cuaderno[max + 1];
	int tope;

	PilaC() {
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

	void adicionar(Cuaderno elem) {
		if (!this.esllena()) {
			tope++;
			v[tope] = elem;
		} else
			System.out.println("Pila llena");
	}

	Cuaderno eliminar() {
		Cuaderno elem = new Cuaderno();
		if (!this.esvacia()) {
			elem = v[tope];
			tope--;
		} else
			System.out.println("Pila vacia");
		return (elem);
	}

	void mostrar() {
		Cuaderno elem = new Cuaderno();
		if (this.esvacia())
			System.out.println("Pila vacia");
		else {
			System.out.println("\n Cuadernos de la Pila ");
			PilaC aux = new PilaC();
			while (!this.esvacia()) {
				elem = this.eliminar();
				aux.adicionar(elem);
				elem.mostrar();
			}
			this.vaciar(aux);
		}
	}

	void llenar(int n) {
		for (int i = 1; i <= n; i++) {
			Cuaderno elem = new Cuaderno();
			elem.leer();
			this.adicionar(elem);
		}
	}

	void vaciar(PilaC a) {
		while (!a.esvacia())
			this.adicionar(a.eliminar());

	}
}
