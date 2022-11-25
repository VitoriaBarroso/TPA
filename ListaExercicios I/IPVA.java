import java.util.Scanner;
public class IPVA {
	public static void main(String[]args) {
		int pviculo,ipva;
		Scanner in= new Scanner(System.in);
		System.out.println("digite o valor de pviculo");
		pviculo= in.nextInt();
		ipva= pviculo* 4/100;
		System.out.println("esse é o valor do ipva "+ipva);
		in.close();
	}
}
