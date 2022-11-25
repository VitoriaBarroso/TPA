import java.util.*;
public class AnoNascAnoAtual {
      public static void main (String[] args ) {
    	  Scanner in = new Scanner (System.in);
    	  double anonasc anoatual;
    	  System.out.println (" digite anonasc");
    	  anonasc=in.nextDouble();
    	  System.out.println ("anoatual");
    	 anoatual=in.nextDouble();
    	 ( anonasc-anoatual >=18){
    		 System.out.println("Aprovado");
    	 } else {
    		 System.out.println("Reprovado");
    	 }
    	 
      }
}
