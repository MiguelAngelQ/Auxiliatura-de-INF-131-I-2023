public class NodoE {
	private String nom;
	private int nota;
	private NodoE izq, der;

	public NodoE() {
		izq = der = null;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public NodoE getIzq() {
		return izq;
	}

	public void setIzq(NodoE izq) {
		this.izq = izq;
	}

	public NodoE getDer() {
		return der;
	}

	public void setDer(NodoE der) {
		this.der = der;
	}
}