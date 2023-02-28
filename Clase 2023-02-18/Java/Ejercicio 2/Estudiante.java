package clase1802_2023b;

public class Estudiante {

	private String nom, pat, mat;
	private int ci;

	public Estudiante() {
		// TODO Auto-generated constructor stub
	}

	public void leer() {
		System.out.println("Into nombre, paterno, materno y ci ");
		nom = Leer.dato();
		pat = Leer.dato();
		mat = Leer.dato();
		ci = Leer.datoInt();
	}

	public void mostrar() {
		System.out.println("[ " + nom + ", " + pat + ", " + mat + ", " + ci + "]");
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPat() {
		return pat;
	}

	public void setPat(String pat) {
		this.pat = pat;
	}

	public String getMat() {
		return mat;
	}

	public void setMat(String mat) {
		this.mat = mat;
	}

	public int getCi() {
		return ci;
	}

	public void setCi(int ci) {
		this.ci = ci;
	}
	
	

}
