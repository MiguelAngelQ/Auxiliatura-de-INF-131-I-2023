package clase1802_2023b;

public class Main {

	public static void agrupar(PilaEst a, PilaEva b) {
		PilaEst aux = new PilaEst();
		PilaEva aux2 = new PilaEva();
		PilaEva aux3 = new PilaEva();
		while (!a.esvacia()) {
			Estudiante elem = a.eliminar();
			aux.adicionar(elem);
			while (!b.esvacia()) {
				Evaluacion w = b.eliminar();
				if (w.getCi() == elem.getCi()) {
					aux3.adicionar(w);
				} else {
					aux2.adicionar(w);
				}
			}
			b.vaciar(aux2);
		}
		a.vaciar(aux);
		b.vaciar(aux3);
	}

	public static void ordenar_y_agrupar(PilaEst a, PilaEva b) {
		PilaEst aux = new PilaEst();
		PilaEva aux2 = new PilaEva();
		PilaEva aux3 = new PilaEva();
		PilaEva aux4 = new PilaEva();
		while (!a.esvacia()) {
			Estudiante elem = a.eliminar();
			aux.adicionar(elem);
			while (!b.esvacia()) {
				Evaluacion w = b.eliminar();
				if (w.getCi() == elem.getCi()) {
					aux4.adicionar(w);
				} else {
					aux2.adicionar(w);
				}
			}
			ordenar(aux4);
			aux3.vaciar(aux4);
			b.vaciar(aux2);
		}
		a.vaciar(aux);
		b.vaciar(aux3);
	}

	public static void ordenar(PilaEva w) {
		PilaEva a = new PilaEva();
		PilaEva b = new PilaEva();
		while (!w.esvacia()) {
			Evaluacion elem = new Evaluacion();
			elem = w.eliminar();
			while (!w.esvacia()) {
				Evaluacion x = new Evaluacion();
				x = w.eliminar();
				if (x.getNota() > elem.getNota()) {
					a.adicionar(elem);
					elem = x;
				} else {
					a.adicionar(x);
				}
			}
			b.adicionar(elem);
			w.vaciar(a);
		}
		w.vaciar(b);
	}

	public static void main(String[] args) {
		PilaEst a = new PilaEst();
		PilaEva b = new PilaEva();
		a.llenar(2);// 2 estudiantes
		b.llenar(5);// 5 evaluaciones
		a.mostrar();
		b.mostrar();
		agrupar(a, b);
		a.mostrar();
		b.mostrar();
		ordenar_y_agrupar(a, b);
		a.mostrar();
		b.mostrar();
	}

}
