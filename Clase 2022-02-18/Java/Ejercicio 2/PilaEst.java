package clase1802_2023b;

class PilaEst {
	private int max = 30;
	private Estudiante v[] = new Estudiante[max + 1];
	private int tope;

	PilaEst() {
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

	void adicionar(Estudiante elem) {
		if (!esllena()) {
			tope++;
			v[tope] = new Estudiante();
			v[tope] = elem;
		} else
			System.out.println("Pila llena");
	}

	Estudiante eliminar() {
		Estudiante elem = new Estudiante();
		if (!esvacia()) {
			elem = v[tope];
			tope--;
		} else
			System.out.println("Pila vacia");
		return (elem);
	}

	void mostrar() {
		Estudiante elem = new Estudiante();
		if (esvacia())
			System.out.println("Pila vacia");
		else {
			System.out.println("\n Datos de la Pila ");
			PilaEst aux = new PilaEst();
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
			Estudiante elem = new Estudiante();
			elem.leer();
			this.adicionar(elem);
		}
	}

	void vaciar(PilaEst a) {
		while (!a.esvacia())
			adicionar(a.eliminar());

	}
}
