package mediaarimetrica;
import java.util.Scanner;
public class madiaaritmetrica {
 public static void main(String [] args) {
{ int N,I;
double med=0;
Scanner dados = new Scanner (System.in);
System.out.print("Quantos elementos tem o vetor?");
N =dados.nextInt();
double []A= new double [N];
for (I=0;I<=N-1;I++)
{System.out.printf("Elemento %d=",I+1);
A[I]=dados.nextDouble();}
for (I=0;I<=N-1;I++)
	med+=A[I];
med=med/N;
System.out.printf(String.format("Média aritmétrica %5.2f", med));

}
 }
}

