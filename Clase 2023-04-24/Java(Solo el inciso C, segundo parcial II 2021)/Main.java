
public class Main {

	public static void IncisoC(LSimpleF a, int i, int x) {
		NodoF w = a.getP(); // NodoF
		int j = 0;
		while (w != null) {
			j = j + 1;
			if (i == j) {
				FAgropecuaria fa = w.getH(); // feria agro
				LDobleS b = fa.getG(); // LDobleS
				NodoS w2 = b.getP();// NodoS
				while (w2 != null) {
					Stand st = w2.getF(); // stand
					LSimpleP c = st.getE(); // LSimpleP
					NodoP w3 = c.getP(); // NodoP
					int n = c.nroNodos();
					for (int ii = 1; ii <= n; ii++) {
						w3 = c.getP();
						// si el primer nodo tiene precio > x
						if (w3.getD().getPrecio() > x) {
							c.eliPrincipio(); // a implementar
						} else {
							Boolean sw = false; // no hay precio > x
							while (w3 != null) {
								Producto pr = w3.getD();// Producto
								if (pr.getPrecio() > x) {
									sw = true;
									break;
								}
								w3 = w3.getSig();
							}
							if (sw == true) {
								NodoP w4 = c.getP();// NodoP
								while (w4.getSig() != w3)
									w4 = w4.getSig();
								w4.setSig(w3.getSig());
							}
						}
					}
					w2 = w2.getSig();
				}
			}
			w = w.getSig();
		}
	}

	public static void main(String[] args) {
		LSimpleF a = new LSimpleF();
		a.leer2(Leer.datoInt());
		a.mostrar();
		System.out.println();
		IncisoC(a, 1, 10);
		a.mostrar();
	}

}
