package entities;

//classe
public class Triangle {
	// Atributo
	public double a;
	public double b;
	public double c;

	// Método
	public double area() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}
