/* Calcule a área do triângulo
Nathaly Ambrosio 
 17/05/23 
 */
import java.util.Scanner;

public class NathalyAmbrosio_exercicio3 {
    public static void main (String args[]){
        Scanner leitor = new Scanner (System.in);
 //criar as variáveis
 int n1, n2 , ar;
         
// iniciando as variáveis
n1 = n2 = ar = 0;

System.out.println("insira dois números"); 

 //leia as variáveis
 n1 = leitor.nextInt();
 n2 = leitor.nextInt();
 //calculo do triângulo
 ar = (n1 * n2) /2;
 System.out.println(" o valor da área é " + ar); 
 leitor.close();
    }
}