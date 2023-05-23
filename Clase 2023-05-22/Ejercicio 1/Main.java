import java.util.Scanner;

public class Main {

	public static void ejercicio1(NodoZ z, int x) {
		if (z == null)
			return;
		int cant = recorrerConteneder(z.getB().getP());
		if (cant > x)
			System.out.println(z.getNombre());
		ejercicio1(z.getSig(), x);
	}

	public static int recorrerConteneder(NodoC w) {
		if (w == null)
			return 0;// 0 contenedores amarillos en el peor de los casos
		if (w.getColor().equals("amarillo"))
			return recorrerConteneder(w.getSig()) + 1;
		else
			return recorrerConteneder(w.getSig());
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		LSimpleZ z = new LSimpleZ();
		z.leer2(in.nextInt());
		ejercicio1(z.getP(), 2);
	}

}
