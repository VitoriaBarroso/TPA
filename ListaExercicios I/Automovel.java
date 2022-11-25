import java.util.Scanner;
public class Automovel {
	public static void main(String[]args) {
		Double comb,km;
		Scanner in= new Scanner (System.in);
		System.out.println ("digite aqui litros");
		comb= in.nextDouble();
		km= comb/1000;
		System.out.println("apresente kilometros comvertidos em  litros");
		in.close();
		
	}
}
