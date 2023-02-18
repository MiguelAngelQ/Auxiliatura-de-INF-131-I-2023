package clase1802_2023b;

public class Evaluacion {

	private int nroEvaluacion, ci, nota;

	public Evaluacion() {
		// TODO Auto-generated constructor stub
	}

	public void leer() {
		System.out.println("Into nroEvaluacion, ci y nota");
		nroEvaluacion = Leer.datoInt();
		ci = Leer.datoInt();
		nota = Leer.datoInt();
	}

	public void mostrar() {
		System.out.println("[" + nroEvaluacion + ", " + ci + ", " + nota + "]");
	}

	public int getNroEvaluacion() {
		return nroEvaluacion;
	}

	public void setNroEvaluacion(int nroEvaluacion) {
		this.nroEvaluacion = nroEvaluacion;
	}

	public int getCi() {
		return ci;
	}

	public void setCi(int ci) {
		this.ci = ci;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

}
