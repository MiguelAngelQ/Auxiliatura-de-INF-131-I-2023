import java.util.Iterator;
import java.util.Scanner;

import Clase10042023.Leer;

public class Main {

	public static Boolean funcion1(NodoE a, NodoE b){
		if(a == null && b == null)
			return true;
		if(a == null || b == null)
			return false;
		if(a.getNumero() != b.getNumero())
			return false;
		return funcion1(a.getSig(), b.getSig());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		LSimpleE a = new LSimpleE();// crea un nodo con null
		LSimpleE b = new LSimpleE();
		a.leer2(Leer.datoInt());
		b.leer2(Leer.datoInt());
		System.out.println(funcion1(a.getP(), b.getP()));
	}

}
