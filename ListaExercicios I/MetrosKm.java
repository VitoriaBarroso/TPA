import java.util.Scanner;
public class MetrosKm {
	public static void main(String[]args) {
		int mts,km;
		Scanner in = new Scanner(System.in);
		System.out.println("digite os metros");
		mts = in.nextInt();
		km = mts/100;
		System.out.println("os metros convertidos é "+km+" kilometros");
		in.close();
		
	}
}
