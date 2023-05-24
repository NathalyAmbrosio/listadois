/*
Receba um número e mostra se ele é impar ou par
Nathaly Ambrósio
23/05/2023
*/
import java.util.Scanner;
public class NathalyAmbrosio_exercicio10{
        public static void main (String args []){ 
         Scanner leitor = new Scanner (System.in);

         //criando as variáveis
         int n1;

         //iniciando as variáveis
         n1 = 0;

         System.out.println("insira um valor");

         //leia a variável
         n1 = leitor.nextInt();

         //compara os valores
         if ((n1 % 2) == 0){
                  System.out.println("é um número par");
         } else {
                   System.out.println("é um número ímpar");}
        
            leitor.close();
                  

        }
}
