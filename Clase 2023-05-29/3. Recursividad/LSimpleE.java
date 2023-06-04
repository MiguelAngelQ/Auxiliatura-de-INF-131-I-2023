package Recursividad;

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

	public void adifinal(int ci, String nom, String pat, String mat, int nota) {
		NodoE nue = new NodoE();
		nue.setCi(ci);
		nue.setNom(nom);
		nue.setPat(pat);
		nue.setMat(mat);
		nue.setNota(nota);
		if (getP() == null)
			setP(nue);
		else {
			NodoE w = getP();
			while (w.getSig() != null)
				w = w.getSig();
			w.setSig(nue);
		}
	}

	public NodoE eliPrincipio() {
		NodoE r = getP();
		setP(r.getSig());
		r.setSig(null);
		return r;
	}

	public void leer2(int n) {
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			System.out.println("Datos estudiante:");
			adifinal(in.nextInt(), in.next(), in.next(), in.next(), in.nextInt());
		}
	}

	public void mostrar() {
		NodoE k = getP();
		while (k != null) {
			System.out.println(
					k.getCi() + ", " + k.getNom() + ", " + k.getPat() + ", " + k.getMat() + ", " + k.getNota());
			k = k.getSig();
		}
	}

}
