import java.util.Scanner;

public class LSimpleE {
	private NodoE p;

	public LSimpleE() {
		p = null;
	}

	public NodoE getP() {
		return p;
	}

	public void setP(NodoE p) {
		this.p = p;
	}

	public int nroNodos() {
		NodoE w = getP();
		int c = 0;
		while (w != null) {
			c = c + 1;
			w = w.getSig();
		}
		return c;
	}

	public void adifinal(int z) {
		NodoE nue = new NodoE();
		nue.setNumero(z);
		if (getP() == null)
			setP(nue);
		else {
			NodoE w = getP();
			while (w.getSig() != null)
				w = w.getSig();
			w.setSig(nue);
		}
	}

	public void leer2(int n) {
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			int x = in.nextInt();
			adifinal(x);
		}
	}

	public void mostrar() {
		NodoE k = getP();
		while (k != null) {
			System.out.println(k.getNumero());
			k = k.getSig();
		}
	}

}
