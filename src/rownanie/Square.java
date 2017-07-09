package rownanie;
import java.lang.Math;



public class Square {
	
	public static void RozwiazRownanie(double A, double B, double C) {
		double wyroznik = B*B - 4*A*C;
		double X1;
		double X2;
		if(wyroznik > 0) {
			X1 = ((-B)+Math.sqrt(wyroznik))/(2*A);
			X2 = ((-B)-Math.sqrt(wyroznik))/(2*A);
			System.out.println("Rozwi¹zaniami równania s¹ " + X1 + " oraz " + X2);
		}else if(wyroznik == 0) {
			X1 = (-B)/(2*A);
			System.out.println("Rozwi¹zaniem równania jest " + X1);
		}else if (wyroznik <0) {
			double delta = Math.abs(wyroznik);
			Imaginary liczba1 = new Imaginary();
			liczba1.setReal((-B)/(2*A));
			liczba1.setImaginary((Math.sqrt(delta))/(2*A));
			
			Imaginary liczba2 = new Imaginary();
			liczba2.setReal((-B)/(2*A));
			liczba2.setImaginary((-Math.sqrt(delta))/(2*A));
			
			System.out.println("Rozwi¹zaniami równania s¹ " + liczba1.getReal()+"+"+ liczba1.getImaginary()+"j "+"oraz "+liczba2.getReal()+liczba2.getImaginary()+"j" );
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RozwiazRownanie(2,2,1);
	}

}
