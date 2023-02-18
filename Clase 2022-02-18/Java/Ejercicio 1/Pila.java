package clase18_02_2023;

class Pila {
	private int max = 30;
	private int v[] = new int[max + 1];
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

	void adicionar(int elem) {
		if (!esllena()) {
			tope++;
			v[tope] = elem;
		} else
			System.out.println("Pila llena");
	}

	int eliminar() {
		int elem = 0;
		if (!esvacia()) {
			elem = v[tope];
			tope--;
		} else
			System.out.println("Pila vacia");
		return (elem);
	}

	void mostrar() {
		int elem;
		if (esvacia())
			System.out.println("Pila vacia");
		else {
			System.out.println("\n Datos de la Pila ");
			Pila aux = new Pila();
			while (!esvacia()) {
				elem = eliminar();
				aux.adicionar(elem);
				System.out.println(elem);
			}
			this.vaciar(aux);
		}
	}

	void llenar(int n) {
		for (int i = 1; i <= n; i++) {
			int elem = Leer.datoInt();
			this.adicionar(elem);
		}
	}

	void vaciar(Pila a) {
		while (!a.esvacia())
			adicionar(a.eliminar());

	}
}
