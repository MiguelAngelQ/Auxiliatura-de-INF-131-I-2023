
public class Stand {
	private int nroStand, idCom;
	private String productor;
	private LSimpleP e = new LSimpleP();

	public Stand() {
		// TODO Auto-generated constructor stub
	}

	public void leer() {
		System.out.println("Stand");
		System.out.println("nroStand, productor, idCom, nroElementos de la lista de productos");
		nroStand = Leer.datoInt();
		productor = Leer.dato();
		idCom = Leer.datoInt();
		e.leer2(Leer.datoInt());
	}

	public void mostrar() {
		System.out.println("{" + nroStand + ", " + productor + " " + idCom + "}");
		e.mostrar();
	}

	public int getNroStand() {
		return nroStand;
	}

	public void setNroStand(int nroStand) {
		this.nroStand = nroStand;
	}

	public int getIdCom() {
		return idCom;
	}

	public void setIdCom(int idCom) {
		this.idCom = idCom;
	}

	public String getProductor() {
		return productor;
	}

	public void setProductor(String productor) {
		this.productor = productor;
	}

	public LSimpleP getE() {
		return e;
	}

	public void setE(LSimpleP e) {
		this.e = e;
	}
}
