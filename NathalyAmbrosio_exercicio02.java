/* Receba um algoritmo de 3n° e mostre qual é o maior
 Nathaly Ambrosio
 17/05/2023 
 */
 import java.util.Scanner;
public class NathalyAmbrosio_exercicio02 {
    public static void main(String args[]){

        Scanner leitor = new Scanner (System.in);
        
    //criando as variáveis
    int n1, n2, res, n3 ;

    //iniciando as variáveis
    n1 = n2 = n3 = 0;
    res = 0;
    
    System.out.println ("digite 3 números");

    //leia as variáveis
    n1 = leitor.nextInt();
    n2 = leitor.nextInt();
    n3 = leitor.nextInt();

    if (n1 > n2)
    System.out.println (n1 + " o primeiro é o maior");
    
    else if (n2 > n3)

    System.out.println (n2 + " o segundo é o maior");

    else if ( n3 > res)
    System.out.println (n3 + " o terceiro é o maior ");

    leitor.close();

    }
}
