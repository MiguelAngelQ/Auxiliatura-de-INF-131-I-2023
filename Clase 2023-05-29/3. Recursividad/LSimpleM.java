package Recursividad;

import java.util.Scanner;

public class LSimpleM {
	private NodoM p;

	public LSimpleM() {
		p = null;
	}

	public NodoM getP() {
		return p;
	}

	public void setP(NodoM p) {
		this.p = p;
	}

	public int nroNodos() {
		NodoM w = getP();
		int c = 0;
		while (w != null) {
			c = c + 1;
			w = w.getSig();
		}
		return c;
	}

	public void adifinal(String sigla, LSimpleE a, LSimpleE b) {
		NodoM nue = new NodoM();
		nue.setSigla(sigla);
		nue.setA(a);
		nue.setB(b);
		if (getP() == null)
			setP(nue);
		else {
			NodoM w = getP();
			while (w.getSig() != null)
				w = w.getSig();
			w.setSig(nue);
		}
	}

	public NodoM eliPrincipio() {
		NodoM r = getP();
		setP(r.getSig());
		r.setSig(null);
		return r;
	}

	public void leer2(int n) {
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			System.out.println("Datos materia:");
			String sigla = in.next();
			LSimpleE a = new LSimpleE();
			LSimpleE b = new LSimpleE();
			a.leer2(in.nextInt());
			b.leer2(in.nextInt());
			adifinal(sigla, a, b);
		}
	}

	public void mostrar() {
		NodoM k = getP();
		while (k != null) {
			System.out.println(k.getSigla());
			k.getA().mostrar();
			k.getB().mostrar();
			k = k.getSig();
		}
	}

}
