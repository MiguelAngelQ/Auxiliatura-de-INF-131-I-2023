package clase18_02_2023;

public class Main {

	public static void intercambiar(Pila w, Pila y) {
		int tamanioW = w.nroelem();
		int tamanioY = y.nroelem();
		w.vaciar(y);
		int aux = w.eliminar();
		y.vaciar(w);
		w.adicionar(aux);
		aux = y.eliminar();
		for (int i = 1; i <= tamanioW - 1; i++)
			w.adicionar(y.eliminar());
		w.vaciar(y);
		y.adicionar(aux);
		for (int i = 1; i <= tamanioY - 1; i++)
			y.adicionar(w.eliminar());
	}

	public static void main(String[] args) {
		/*
		 * Sean dos pilas de números, se pide intercambiar el primer elemento de ambas
		 * pilas sin usar ninguna estructura auxiliar.
		 */
		Pila a = new Pila();
		Pila b = new Pila();
		int tamanio = Leer.datoInt();
		a.llenar(tamanio);
		b.llenar(tamanio);
		a.mostrar();
		b.mostrar();
		intercambiar(a, b);
		a.mostrar();
		b.mostrar();
	}

}
