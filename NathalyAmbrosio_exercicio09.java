/* 
Algoritmo que compara os números e mostra qual é ooo maior ou se são iguais
Nathaly Ambrósio
23/05/2023
*/
import java.util.Scanner;
public class NathalyAmbrosio_exercicio09{
        public static void main (String args []){ 
         Scanner leitor = new Scanner (System.in);

         //criando as variáveis
         double n1, n2;
         
         //iniciando as variáveis
         n1 = n2 = 0.0;
         System.out.println(" insira dois valores");

         //leia as variáveis
        n1 = leitor.nextDouble();
        n2 = leitor.nextDouble();

        //comparação dos valores
        if (n1 == n2)
        System.out.println("os valores são iguais");

        else if ( n1 > n2){
                System.out.println("o primeiro valor é maior");
                
        }else
                        System.out.println("o segundo número é maior");

                        leitor.close();
        }
}
