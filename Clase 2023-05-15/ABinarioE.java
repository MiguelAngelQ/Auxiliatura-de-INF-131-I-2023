public class ABinarioE {
	private NodoE raiz;

	public ABinarioE() {
		raiz = null;
	}

	public void crear(NodoE r) {
		if (r != null) {
			System.out.print("Introduzca nombre: ");
			r.setNom(Leer.dato());
			System.out.print("Introduzca nota: ");
			r.setNota(Leer.datoInt());
			System.out.println("Tendra izq? s/n: ");
			String resp = Leer.dato();
			if (resp.equals("s")) {
				NodoE nue = new NodoE();
				r.setIzq(nue);
				crear(r.getIzq());
			}
			System.out.print("Tendra der? s/n: ");
			resp = Leer.dato();
			if (resp.equals("s")) {
				NodoE nue = new NodoE();
				r.setDer(nue);
				crear(r.getDer());
			}
		}
	}

	public void preorden(NodoE r) {
		if (r != null) {
			System.out.println("[" + r.getNom() + ", " + r.getNota() + "]");
			preorden(r.getIzq());
			preorden(r.getDer());
		}
	}

	public void inorden(NodoE r) {
		if (r != null) {
			inorden(r.getIzq());
			System.out.println("[" + r.getNom() + ", " + r.getNota() + "]");
			inorden(r.getDer());
		}
	}

	public void posorden(NodoE r) {
		if (r != null) {
			posorden(r.getIzq());
			posorden(r.getDer());
			System.out.println("[" + r.getNom() + ", " + r.getNota() + "]");
		}
	}
}
