/* insira um número e recebá um desconto de 15%
 Nathaly Ambrosio
 17/05/2023
 */
 import java.util.Scanner;
public class NathalyAmbrosio_exercicio01 {
    public static void main (String args []){
        Scanner leitor = new Scanner (System.in);

        //criando as variáveis
        double val, des;
         
        //iniciando as variáveis
         val = 0.0;
         des = 0.0;

         System.out.println ("insira um valor");

         //leia as variáveis
         val = leitor.nextDouble();
         

        //calculo de desconto
         des = (val/100)* 15;

         System.out.println ("o valor orginal é " + val);
         System.out.println ("o valor de desconto é" + des);

        leitor.close();
    }
}
