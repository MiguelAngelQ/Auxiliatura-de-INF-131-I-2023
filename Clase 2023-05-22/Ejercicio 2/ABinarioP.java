package Ej2;

public class ABinarioP {
	private NodoP raiz;

	public ABinarioP() {
		raiz = null;
	}

	public void crear(NodoP r) {
		if (r != null) {
			System.out.print("Introduzca nombre: ");
			r.setNombre(Leer.dato());
			System.out.print("Introduzca precio: ");
			r.setPrecio(Leer.datoInt());
			System.out.print(r.getNombre() + " Tendra izq? s/n: ");
			String resp = Leer.dato();
			if (resp.equals("s")) {
				NodoP nue = new NodoP();
				r.setIzq(nue);
				crear(r.getIzq());
			}
			System.out.print(r.getNombre() + " Tendra der? s/n: ");
			resp = Leer.dato();
			if (resp.equals("s")) {
				NodoP nue = new NodoP();
				r.setDer(nue);
				crear(r.getDer());
			}
		}
	}

	public void preorden(NodoP r) {
		if (r != null) {
			System.out.println("[" + r.getNombre() + ", " + r.getPrecio() + "]");
			preorden(r.getIzq());
			preorden(r.getDer());
		}
	}

	public void ejercicio2(NodoP r, int x) {
		if (r != null) {
			if (r.getPrecio() == x) {
				subarbolesDerechos(r.getDer(), x);
				ejercicio2(r.getIzq(), x);
			} else {
				ejercicio2(r.getIzq(), x);
				ejercicio2(r.getDer(), x);
			}
		}
	}

	public void subarbolesDerechos(NodoP r, int x) {
		if (r != null) {
			if (r.getPrecio() > x)
				System.out.println(r.getNombre());
			subarbolesDerechos(r.getIzq(), x);
			subarbolesDerechos(r.getDer(), x);
		}
	}

	public NodoP getRaiz() {
		return raiz;
	}

	public void setRaiz(NodoP raiz) {
		this.raiz = raiz;
	}
}
