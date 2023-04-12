package Clase10042023;

public class Main {
	// adicionar un colegio antes del ultimo
	public static void ejercicio1_v2(LDobleC a) {
		NodoC w = a.getP();
		if (w == null)
			return;
		Colegio u = new Colegio();
		u.leer();
		if (w.getSig() == null)
			a.adiPrincipio(u);
		else {
			NodoC aux = a.eliFinal();
			a.adifinal(u);
			a.adifinal(aux.getA());
		}
	}

	// adicionar un colegio antes del ultimo
	public static void ejercicio1_v1(LDobleC a) {
		NodoC w = a.getP();
		if (w == null)
			return;
		Colegio u = new Colegio();
		u.leer();
		if (w.getSig() == null) {
			a.adiPrincipio(u);
		} else {
			// obtenemos el ultimo nodo
			while (w.getSig() != null)
				w = w.getSig();
			// creamos el nuevo nodo
			NodoC nue = new NodoC();
			nue.setA(u);
			nue.setAnt(w.getAnt());
			nue.setSig(w);
			w.getAnt().setSig(nue);
			w.setAnt(nue);
		}
	}

	// adicionar k nuevos colegios antes del ultimo
	public static void adicionarK(LDobleC a, int k) {
		for (int i = 0; i < k; i++)
			ejercicio1_v2(a);
	}

	// adicionar k nuevos colegios despues del i-esimo
	public static void ejercicio2(LDobleC a, int i, int k) {
		if (a.nroNodos() < i)
			return;
		NodoC w = a.getP();
		int j = 0;
		while (w != null) {
			j = j + 1;
			if (j == i) {
				// crear los k nuevos nodos
				LDobleC b = new LDobleC();
				b.leer2(k);
				b.getP().setAnt(w);
				NodoC e = b.getP();
				while (e.getSig() != null)
					e = e.getSig();
				e.setSig(w.getSig());
				w.setSig(b.getP());
			}
			w = w.getSig();
		}
	}

	public static void main(String[] args) {
		LDobleC a = new LDobleC();
		a.leer2(Leer.datoInt());
		a.mostrar();
		ejercicio2(a, 2, 4);
		a.mostrar();

	}

}
