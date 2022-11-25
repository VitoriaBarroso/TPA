import java.util.Scanner;
public class SalarioBruto { 
	public static void main(String[]args) {
		double salario,desc,vale;
		Scanner in= new Scanner (System.in);
		System.out.println("digite o salario");
		salario= in.nextDouble();
		System.out.println ("digite o desconto");
		desc=in.nextDouble();
		vale = salario*desc/100;
		System.out.println("esse é "+vale);
		in.close();
   }
}
