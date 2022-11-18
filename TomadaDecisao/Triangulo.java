import java.util.Scanner;
public class Triangulo {
	public static void main	(String[]args) {
		Scanner in = new Scanner(System.in);
		double a,b,c;
		System.out.println("Digite o primeiro valor");
		a = in.nextDouble();
		System.out.println("digite o segundo valor");
		b = in.nextDouble();
		System.out.println("digite o terceiro valor");
		c = in.nextDouble();
		if (a == b & a==c) {
			System.out.println(" equilátero");
		}else if (a!=b &b!=c &  a!=c) {
			System.out.println("escaleno");
		if (a == b & a==c) {
		}else {
			System.out.println("isoceles");
			in.close();
		}
	}	
  }
}
