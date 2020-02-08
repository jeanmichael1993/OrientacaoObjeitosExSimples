package entities;

public class Student {

	public String nome;
	public double notaA;
	public double notaB;
	public double notaC;

	public double notaFinal() {
		return notaA + notaB + notaC;
	}

	public String toString() {

		if (notaFinal() < 60.0) {
			return "FINAL GRADE = " + String.format("%.2f", notaFinal()) + "\n" + "FAILED" + "\n" + "MISSING "
					+ String.format("%.2f", 60 - notaFinal()) + " POINTS";
		} else {
			return "FINAL GRADE = " + String.format("%.2f", notaFinal()) + "\n" + "PASS";
		}

	}

}
