package clase1802_2023b;

class PilaEva {
	private int max = 30;
	private Evaluacion v[] = new Evaluacion[max + 1];
	private int tope;

	PilaEva() {
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

	void adicionar(Evaluacion elem) {
		if (!esllena()) {
			tope++;
			v[tope] = new Evaluacion();
			v[tope] = elem;
		} else
			System.out.println("Pila llena");
	}

	Evaluacion eliminar() {
		Evaluacion elem = new Evaluacion();
		if (!esvacia()) {
			elem = v[tope];
			tope--;
		} else
			System.out.println("Pila vacia");
		return (elem);
	}

	void mostrar() {
		Evaluacion elem = new Evaluacion();
		if (esvacia())
			System.out.println("Pila vacia");
		else {
			System.out.println("\n Datos de la Pila ");
			PilaEva aux = new PilaEva();
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
			Evaluacion elem = new Evaluacion();
			elem.leer();
			this.adicionar(elem);
		}
	}

	void vaciar(PilaEva a) {
		while (!a.esvacia())
			adicionar(a.eliminar());

	}
}
