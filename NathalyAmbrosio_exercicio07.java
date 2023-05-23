/*Algoritmo que mostra acertou caso seja um número inteiro entre 94 e 456
nathy
23/05/23
*/

import java.util.Scanner;

public class NathalyAmbrosio_exercicio07 {
    public static void main(String args []) {
        Scanner leitor = new Scanner(System.in);

        //criando variavel
        int num;

        System.out.println("Digite um número inteiro");
       //leia a variavel
      num = leitor.nextInt();

      if (num >= 94 && num <= 456) {
        System.out.println("ACERTOU ");
        } else {
             System.out.println("TENTE NOVAMENTE o numero esta fora do intervalo");
             
             leitor.close();
        }

    }
}
