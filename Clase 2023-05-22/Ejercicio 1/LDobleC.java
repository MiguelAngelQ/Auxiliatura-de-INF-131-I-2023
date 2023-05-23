import java.util.Scanner;

public class LDobleC {
	private NodoC p;

	public LDobleC() {
		p = null;
	}

	public NodoC getP() {
		return p;
	}

	public void setP(NodoC p) {
		this.p = p;
	}

	public void adifinal(String color, String ubicación, double capacidad) {
		NodoC nue = new NodoC();
		nue.setColor(color);
		nue.setUbicacion(ubicación);
		nue.setCapacidad(capacidad);
		if (getP() == null)
			setP(nue);
		else {
			NodoC w = getP();
			while (w.getSig() != null)
				w = w.getSig();
			w.setSig(nue);
			nue.setAnt(w);
			// nue.setAnt(w);
		}
	}

	public NodoC eliPrincipio() {
		NodoC w = getP();
		if (w.getSig() == null)
			setP(null);
		else {
			setP(w.getSig());
			w.setSig(null);
			w.setAnt(null);
		}
		return w;
	}

	public NodoC eliFinal() {
		NodoC w = getP();
		if (w.getSig() == null)
			setP(null);
		else {
			while (w.getSig() != null)
				w = w.getSig();
			NodoC q = w.getAnt();
			q.setSig(null);
			w.setAnt(null);
		}
		return w;

	}

	public void leer2(int n) {
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			System.out.println("Contenedor: ");
			adifinal(in.next(), in.next(), in.nextDouble());
		}
	}

	public void mostrar() {
		NodoC k = getP();
		while (k != null) {
			System.out.println(k.getColor() + ", " + k.getUbicacion() + ", " + k.getCapacidad());
			k = k.getSig();
		}
	}

	public int nroNodos() {
		NodoC w = getP();
		int ans = 0;
		while (w != null) {
			ans += 1;
			w = w.getSig();
		}
		return ans;
	}

	public void adiPrincipio(String color, String ubicacion, double capacidad) {
		NodoC u = new NodoC();
		u.setColor(color);
		u.setCapacidad(capacidad);
		u.setUbicacion(ubicacion);
		if (getP() == null)
			setP(u);
		else {
			u.setSig(getP());
			getP().setAnt(u);
			setP(u);
		}
	}
}
