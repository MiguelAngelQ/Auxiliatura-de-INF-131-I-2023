public class Main {

	public static void main(String[] args) {
		ABinarioE arbol = new ABinarioE();
		arbol.setRaiz(new NodoE());//seteamos la raiz
		arbol.crear();
		arbol.preorden(arbol.getRaiz());
		System.out.println();
		arbol.inorden(arbol.getRaiz());
		System.out.println();
		arbol.posorden(arbol.getRaiz());
	}
}