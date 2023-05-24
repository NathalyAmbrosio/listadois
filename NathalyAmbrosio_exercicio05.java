/*mostre o sucessor e o antecessor
Nathaly Ambrosio de Araujo
22/05/2023
*/
import java.util.Scanner;
    public class NathalyAmbrosio_exercicio05{
    public static void main (String args []){
                Scanner leitor = new Scanner (System.in);
    
    //criando as variáveis
    int ant, suc, num;

     //iniciando as variáveis
    ant = 0;
    suc = 0;
    num = 0;
      //recebe os valores
    System.out.println("digite um número");

    //leia as variaveis
    num = leitor.nextInt();

   //conta do sucesssor e antecessor
   ant = num - 1;
   suc = num + 1;
      System.out.println("o ancetessor de " + num + " é: " + ant);
              System.out.println(" o sucessor de " + num + " é: " + suc);
     leitor.close();
    }
    }



