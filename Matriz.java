package matriz;
import java.util.Scanner;
public class Matriz {
      public static void main(String[] args) {
        int C=0,L=0;
        String nome;
        Scanner LerS = new Scanner(System.in);
      System.out.print ("Qual o numero de linhas?");
      L = LerS.nextInt();
      System.out.print ("Qual o numero de colunas?");
      C = LerS.nextInt();
      String matriz [][] = new String [L][C];
       for (int i=0;i<L;i++)
        for(int j=0;j<C;j++){
               System.out.print ("Qual e o elemento?");
               matriz [i][j] = LerS.next();}
       for(int i=0;i<L;i++)
               for(int j=0;j<C;j++)
       System.out.println(matriz[i][j]);
       
    }
    
}
