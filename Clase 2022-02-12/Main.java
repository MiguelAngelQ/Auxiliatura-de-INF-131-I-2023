import java.awt.Container;
import java.util.Scanner;

public class Main {

	public static void contar(PilaC w, String x) {
		PilaC aux = new PilaC();
		int ans = 0;
		while (!w.esvacia()) {
			Cuaderno y = new Cuaderno();
			y = w.eliminar();
			if (y.getMarca().equals(x))
				ans = ans + 1;
			aux.adicionar(y);
		}
		w.vaciar(aux);
		System.out.println("Cuadernos de la marca " + x + ": " + ans);
	}

	public static void llevar(PilaC w, String x) {
		PilaC a = new PilaC();
		PilaC b = new PilaC();
		while (!w.esvacia()) {
			Cuaderno y = new Cuaderno();
			y = w.eliminar();
			if (y.getMarca().equals(x))
				a.adicionar(y);
			else
				b.adicionar(y);
		}
		w.vaciar(a);
		w.vaciar(b);
	}

	public static void ordenar(PilaC w) {
		PilaC a = new PilaC();
		PilaC b = new PilaC();
		while (!w.esvacia()) {
			Cuaderno elem = new Cuaderno();
			elem = w.eliminar();
			while (!w.esvacia()) {
				Cuaderno x = new Cuaderno();
				x = w.eliminar();
				if (x.getNroHojas() > elem.getNroHojas()) {
					a.adicionar(elem);
					elem = x;
				} else {
					a.adicionar(x);
				}
			}
			b.adicionar(elem);
			w.vaciar(a);
		}
		w.vaciar(b);
	}

	public static void intercalar(PilaC w, PilaC z) {
		PilaC a = new PilaC();
		PilaC b = new PilaC();
		a.vaciar(w);
		b.vaciar(z);
		while (!a.esvacia() || !b.esvacia()) {
			if (!a.esvacia()) {
				Cuaderno e1 = new Cuaderno();
				e1 = a.eliminar();
				w.adicionar(e1);
			}
			if (!b.esvacia()) {
				Cuaderno e2 = new Cuaderno();
				e2 = b.eliminar();
				w.adicionar(e2);
			}
		}
	}

	public static Boolean verificar(PilaC w, Cuaderno x) {
		Boolean sw = false;
		PilaC aux = new PilaC();
		while (!w.esvacia()) {
			Cuaderno y = new Cuaderno();
			y = w.eliminar();
			if (y.getMarca().equals(x.getMarca()) && y.getNroHojas() == x.getNroHojas()
					&& y.getTamanio().equals(x.getTamanio()) && y.getTipo().equals(x.getTipo())) {
				sw = true;
			}
			aux.adicionar(y);
		}
		w.vaciar(aux);
		return sw;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PilaC a = new PilaC();
		int n = in.nextInt();
		a.llenar(n);
		a.mostrar();
		// Inciso A
		contar(a, "top");
		// Inciso B
		llevar(a, "winner");
		a.mostrar();
		// Inciso C
		ordenar(a);
		a.mostrar();
		// Inciso D
		PilaC b = new PilaC();
		b.llenar(n);
		b.mostrar();
		intercalar(a, b);
		a.mostrar();
		b.mostrar();
		// Inciso E
		Cuaderno x = new Cuaderno();
		x.leer();
		verificar(a, x);
	}

}
