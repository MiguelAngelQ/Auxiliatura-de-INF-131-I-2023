package clase23022023b;

public class Main {

	public static void ultimo(ColaSimpleV w) {
		ColaSimpleV aux = new ColaSimpleV();
		while (!w.esvacia()) {
			Vehiculo x = w.eliminar();// x es Vehiculo
			if (w.esvacia())
				x.mostrar();
			aux.adicionar(x);
		}
		w.vaciar(aux);
	}

	public static void ultimo2(ColaSimpleV w) {
		int n = w.nroelem();
		for (int i = 1; i <= n; i++)
			w.adicionar(w.eliminar());
		Vehiculo x = w.eliminar();
		x.mostrar();
		w.adicionar(x);
	}

	public static void intercambiar(ColaSimpleV w) {
		Vehiculo primero = w.eliminar();
		int n = w.nroelem();
		for (int i = 1; i <= n; i++)
			w.adicionar(w.eliminar());
		w.adicionar(primero);
	}

	public static void ordenarPorModelo(ColaSimpleV w) {
		ColaSimpleV a = new ColaSimpleV();
		ColaSimpleV b = new ColaSimpleV();
		while (!w.esvacia()) {
			Vehiculo elem = w.eliminar();
			while (!w.esvacia()) {
				Vehiculo x = w.eliminar();
				// ver nota abajo de esta funcion
				if (x.getModelo().compareTo(elem.getModelo()) > 0) {
					a.adicionar(elem);
					elem = x;
				} else
					a.adicionar(x);
			}
			b.adicionar(elem);
			w.vaciar(a);
		}
		w.vaciar(b);
	}

	/*
	 * Nota: 
	 * if (cadena1.compareTo(cadena2) == 0)
	 * 		System.out.println("cadena1 y cadena2 son iguales"); 
	 * else if(cadena1.compareTo(cadena2) < 0) 
	 * 		System.out.println("cadena1 va antes que cadena2"); 
	 * else if (cadena1.compareTo(cadena2) > 0)
	 * 		System.out.println("cadena1 va después que cadena2");
	 */

	public static void main(String[] args) {
		ColaSimpleV a = new ColaSimpleV();
		int n = Leer.datoInt();
		a.llenar(n);
		a.mostrar();
		// inciso a
		ultimo(a); 
		// inciso b
		intercambiar(a); 
		a.mostrar();
		// inciso c
		ordenarPorModelo(a);
		a.mostrar();
	}

}
