
public class NodoZ {
	private String nombre;
	private LSimpleIV a = new LSimpleIV();
	private LDobleC b = new LDobleC();
	private NodoZ sig;

	public NodoZ() {
		sig = null;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LSimpleIV getA() {
		return a;
	}

	public void setA(LSimpleIV a) {
		this.a = a;
	}

	public LDobleC getB() {
		return b;
	}

	public void setB(LDobleC b) {
		this.b = b;
	}

	public NodoZ getSig() {
		return sig;
	}

	public void setSig(NodoZ sig) {
		this.sig = sig;
	}

}
