package Recursividad;

import java.util.Scanner;

public class Main {

	public static int cantidadAprobados(NodoE w) {
		if (w != null) {
			if (w.getNota() >= 51)
				return cantidadAprobados(w.getSig()) + 1;
			else
				return cantidadAprobados(w.getSig()) + 0;
		} else {
			return 0;
		}
	}

	public static void inciso2(NodoM w) {
		// a señoritas, b jovenes
		if (w != null) {
			int cantSeñoritas = cantidadAprobados(w.getA().getP());
			int cantJovenes = cantidadAprobados(w.getB().getP());
			if (cantSeñoritas > cantJovenes)
				System.out.println(w.getSigla());
			inciso2(w.getSig());
		}
	}

	public static int mostrarContar(NodoE w) {
		if (w != null) {
			System.out.println(w.getCi() + ", " + w.getNom() + ", " + w.getPat() + ", " + w.getMat());
			return mostrarContar(w.getSig()) + 1;
		} else {
			return 0;
		}
	}

	public static void inciso3(NodoM w, String sigla) {
		if (w != null) {
			if (w.getSigla().equals(sigla))
				System.out.println(mostrarContar(w.getB().getP()));
			inciso3(w.getSig(), sigla);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		LSimpleM a = new LSimpleM();
		a.leer2(in.nextInt());
		// mostrar las materias donde hay mas señoritas aprobadas que jovenes
		//inciso2(a.getP());
		inciso3(a.getP(), "INF-131");
	}

}
