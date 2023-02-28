package clase23022023b;

public class ColaSimpleV {
	private int max = 50;
	private Vehiculo v[] = new Vehiculo[max + 1];
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

	void adicionar(Vehiculo elem) {
		if (!esllena()) {
			fin++;
			v[fin] = elem;
		} else
			System.out.println("Cola Simple llena");
	}

	Vehiculo eliminar() {
		Vehiculo elem = new Vehiculo();
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
		Vehiculo elem = new Vehiculo();
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
			Vehiculo aux = new Vehiculo();
			aux.leer();
			adicionar(aux);
		}
	}

	void vaciar(ColaSimpleV a) {
		while (!a.esvacia())
			adicionar(a.eliminar());

	}
}
