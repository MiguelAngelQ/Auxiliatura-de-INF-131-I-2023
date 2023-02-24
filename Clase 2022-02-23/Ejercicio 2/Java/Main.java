package clase23022023;

public class Main {

	public static int cantidadDeOcurrencias(ColaCircularC w, char x) {
		int cont = 0;
		int n = w.nroelem();
		for (int i = 0; i < n; i++) {
			char elem = w.eliminar();
			if (elem == x)
				cont = cont + 1;
			w.adicionar(elem);
		}
		return cont;
	}

	public static int maximoRepetido(ColaCircularC w) {
		int maximo = 0;
		int n = w.nroelem();
		for (int i = 0; i < n; i++) {
			char elem = w.eliminar();
			w.adicionar(elem);
			int ans = cantidadDeOcurrencias(w, elem);
			if (ans > maximo)
				maximo = ans;
		}
		return maximo;
	}

	public static void llevarAlFinal(ColaCircularC w) {
		int nro = w.nroelem();
		for (int i = 0; i < nro; i++) {
			int maximoRepe = maximoRepetido(w);
			ColaCircularC a = new ColaCircularC();
			ColaCircularC b = new ColaCircularC();
			while (!w.esvacia()) {
				char elem = w.eliminar();
				int cantidad = cantidadDeOcurrencias(w, elem) + 1;
				if (cantidad == maximoRepe) {
					a.adicionar(elem);
					while (!w.esvacia()) {
						char elem2 = w.eliminar();
						if (elem2 == elem)
							a.adicionar(elem2);
						else
							b.adicionar(elem2);
					}
				} else
					b.adicionar(elem);
			}
			w.vaciar(b);
			w.vaciar(a);
		}
	}

	public static void main(String[] args) {
		ColaCircularC a = new ColaCircularC();
		int n = Leer.datoInt();
		a.llenar(n);
		a.mostrar();
		System.out.println("---------------------------");
		llevarAlFinal(a);
		a.mostrar();

	}

}
