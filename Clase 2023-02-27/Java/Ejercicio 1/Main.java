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

	public static void invertir1(ColaCircularC w) {
		ColaCircularC a = new ColaCircularC();
		int nro = w.nroelem();
		for (int r = 1; r <= nro; r++) {
			int n = w.nroelem();
			for (int i = 1; i <= n - 1; i++)
				w.adicionar(w.eliminar());
			a.adicionar(w.eliminar());
		}
		w.vaciar(a);
	}

	public static void invertir2(ColaCircularC a) {
		int n = a.nroelem();
		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= n - i - 1; j++)
				a.adicionar(a.eliminar());
			char x = a.eliminar();
			for (int j = 0; j < i; j++)
				a.adicionar(a.eliminar());
			a.adicionar(x);
		}
	}

	public static void main(String[] args) {
		ColaCircularC a = new ColaCircularC();
		int n = Leer.datoInt();
		a.llenar(n);
		a.mostrar();
		// Inciso 1
		llevarAlFinal(a);
		a.mostrar();
		// Inciso 2
		// invertir1(a);
		invertir2(a);
		a.mostrar();
	}

}
