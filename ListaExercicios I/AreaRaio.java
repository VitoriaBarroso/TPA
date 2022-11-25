import java.util.Scanner;
public class AreaRaio {
	 public static void main(String[]args) { 
		   double area,raio; 
		   Scanner in= new Scanner( System.in); 
		   System.out.println(" digite o raio"); 
		   raio=in.nextDouble();
		   area= 3.14*raio*raio;
	       System.out.println("apresente"+area);
	       in.close();
	 }
}
