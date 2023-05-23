
public class NodoIV {
	private String ubicacion;
	private NodoIV sig;

	public NodoIV() {
		sig = null;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public NodoIV getSig() {
		return sig;
	}

	public void setSig(NodoIV sig) {
		this.sig = sig;
	}

}
