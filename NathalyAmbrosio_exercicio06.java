/* mostra a quantidade e o valor total dos picoles comprados
Nathaly Ambrosio
22/05/2023 
*/
import java.util.Scanner;
public class NathalyAmbrosio_exercicio06 {
    public static void main (String args []){
        Scanner leitor = new Scanner (System.in);
     
     //criando as variáveis
     int kiwi, roma, laranja;
     double resul;
       //iniciando as variáveis
     kiwi = 0;
     roma= 0;
     laranja = 0;
     
    //recebe a quantidade
    System.out.println("digite a quantidade de picoles de kiwi");
    kiwi = leitor.nextInt();
    
    System.out.println("digite a quantidade de picoles de laranja");
    laranja = leitor.nextInt();

     System.out.println("digite a quantidade de picoles de roma");
     roma = leitor.nextInt();
    
    //calcule o valor
    resul = (kiwi * 03.20) + (laranja * 02.39) + (roma * 07.99);

    System.out.println("o valor total é de " + resul);
    leitor.close();


        }
}
