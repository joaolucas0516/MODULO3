package MAIORDE3;
import java.util.Scanner;
public class PF4 {
	static int MAIORDE3 (int X, int Y, int Z)
		    { if (X>Y)
	        X=Y;
			 if (X>Z)
			X=Z;
			return X;}
		public static void main (String [] args) throws Exception{
		 int X,Y,Z;
	Scanner LerS = new Scanner (System.in);
	System.out.print ("Digite o primeiro valor (X)");
	X = LerS.nextInt ();
	System.out.print ("Digite o segundo valor (Y)");
	Y = LerS.nextInt ();
	System.out.print ("Digite o terceiro valor (Z)");
	Z = LerS.nextInt ();
	System.out.println("Menor =" + MAIORDE3 (X, Y, Z));
					}
		    }
		