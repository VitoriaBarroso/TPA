import java.util.Scanner;
public class Vendas {
	public static void main(String[]args) {
		double n,s,tv,co,sf;
		Scanner in = new Scanner(System.in);
		System.out.println("digite o nome do vendedor");
		n = in. nextDouble();
		System.out.println("digite do salario fixo do vendedor");
		s = in.nextDouble();
		System.out.println("digite o total de vendas");
		tv = in.nextDouble();
		co = tv/15*100;
		sf = co+s;
		System.out.println("esse é o salario fixo"+s+"o salario final é "+n+"e nome do vendedor é "+sf);
		in.close();
	}

}
