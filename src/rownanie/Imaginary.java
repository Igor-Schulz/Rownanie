package rownanie;

public class Imaginary {
	private double real;
	private double imaginary;
	public void setReal(double real) {
		this.real = real;
	}
	public void setImaginary(double imaginary) {
		this.imaginary = imaginary;
	}
	public void showNumber() {
		System.out.println(this.real);
		System.out.println(this.imaginary +"j");
	}
	public double getReal() {
		return real;
	}
	public double getImaginary() {
		return imaginary;
	}
}
