package ExamenPrimero1;

import java.util.Scanner;

public class Main {

	public static void intercambiarFilaA(Pila v, ColaSimple w, double x) {
		int tamPila = v.nroelem();
		int tamCola = w.nroelem();
		Pila aux = new Pila();
		while (!v.esvacia()) {
			Artesania a = v.eliminar();
			if (a.getPrecioArte() == x)
				w.adicionar(a);
			else
				aux.adicionar(a);
		}
		for (int i = 1; i <= tamCola; i++) {
			Artesania a = w.eliminar();
			if (a.getPrecioArte() == x)
				v.adicionar(a);
			else
				w.adicionar(a);
		}
		v.vaciar(aux);
	}

	public static void intercambiarFilaB(Pila v, ColaSimple w, double x) {
		int tamPila = v.nroelem();
		int tamCola = w.nroelem();
		Pila aux = new Pila();
		int cant = 0; // cuantos ingresaron a la cola
		while (!v.esvacia()) {
			Artesania a = v.eliminar();
			if (a.getPrecioArte() == x) {
				w.adicionar(a);
				cant = cant + 1;
			} else
				aux.adicionar(a);
		}
		v.vaciar(aux);
		for (int i = 1; i <= tamCola; i++) {
			Artesania a = w.eliminar();
			if (a.getPrecioArte() == x)
				v.adicionar(a);
			else
				w.adicionar(a);
		}
		for (int i = 1; i <= cant; i++)
			w.adicionar(w.eliminar());
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Pila a = new Pila();
		ColaSimple b = new ColaSimple();
		System.out.println("Into nro elem: ");
		int n = in.nextInt();
		a.llenar(n);
		System.out.println("Into nro elem: ");
		n = in.nextInt();
		b.llenar(n);
		a.mostrar();
		b.mostrar();
		System.out.println("Into precio X: ");
		double x = in.nextDouble();
		intercambiarFilaB(a, b, x);
		a.mostrar();
		b.mostrar();
	}

}
