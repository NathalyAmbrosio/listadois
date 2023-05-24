/*Algoritmo para checar se as informações para assistir filme estão corretas
Nathaly
24/05/2023
*/

import java.util.Scanner;
public class NathalyAmbrosio_exercicio08 {
    public static void main(String args []) {
        Scanner leitor = new Scanner(System.in);

        //criando as variáveis
        double valor;
        int classe;
        String filme;
       char conf;
     
     //iniciando as variaveis
     valor = 0.0;
     classe = 0;
     filme = " ";
     conf = ' ';

     //recebendo os valores

     filme = "Big bob, o homem";
     System.out.println("CINETHY");
     System.out.println("filme em cartaz " + filme);
     System.out.println("valor do ingresso: 25 reais");
     System.out.println("insira sua idade");
      classe = leitor.nextInt();
       System.out.println("insira o valor que você ira pagar");
     
       valor = leitor.nextDouble();
       if(classe >= 12 && valor >=25){
       System.out.println("Blz, esta tudo certo" + conf);
       }else{
       System.out.println("infelizmente, não poderei aceitar" + conf);}
       leitor.close();
    }
    
}
