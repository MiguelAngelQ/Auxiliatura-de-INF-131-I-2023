
public class FAgropecuaria {
	private String fecha, lugar, version;
	private LDobleS g = new LDobleS();

	public FAgropecuaria() {
		// TODO Auto-generated constructor stub
	}

	public void leer() {
		System.out.println("FAgropecuaria");
		System.out.println("fecha, lugar, version y nro de elementos de la lista de stand");
		fecha = Leer.dato();
		lugar = Leer.dato();
		version = Leer.dato();
		g.leer2(Leer.datoInt());
	}

	public void mostrar() {
		System.out.println("{" + fecha + ", " + lugar + ", " + version + "}");
		g.mostrar();
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public LDobleS getG() {
		return g;
	}

	public void setG(LDobleS g) {
		this.g = g;
	}
}
