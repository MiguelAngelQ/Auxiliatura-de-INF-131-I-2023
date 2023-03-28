
public class Main {

	public static void mostrarUltimo(LSimpleE a){
		if (a.nroNodos() == 0){
			System.out.println("no existe ultimo elemento en la lista");
		}else{
			NodoE w = a.getP();
			while (w.getSig() != null){
				w = w.getSig();
			}
			System.out.println(w.getNumero());
		}
	}

	public static Boolean esFibonacci(int x) {
		int a = -1;
		int b = 1;
		int c = a + b;
		while (c <= x) {
			if (c == x)
				return true;
			a = b;
			b = c;
			c = a + b;
		}
		return false;
	}

	public static void Incisob(LSimpleE a) {
		NodoE w = a.getP(); // NodoE
		while (w != null) {
			if (esFibonacci(w.getNumero())) {
				NodoE nue = new NodoE();
				nue.setNumero(-1);
				nue.setSig(w.getSig());
				w.setSig(nue);
			}
			w = w.getSig();
		}
	}

	public static void participacion(LSimpleE a) {
		NodoE w = a.getP();
		while (w != null) {
			if (w.getNumero() == 42) {
				NodoE nue = new NodoE();
				nue.setNumero(-1);
				NodoE nue2 = new NodoE();
				nue2.setNumero(-1);
				nue.setSig(nue2);
				nue2.setSig(w.getSig());
				w.setSig(nue);

			}
			w = w.getSig();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LSimpleE a = new LSimpleE();// crea un nodo con null
		a.leer2(7);
		a.mostrar();
		System.out.println();
		// participacion(a);
		mostrarUltimo(a);
	}

}
