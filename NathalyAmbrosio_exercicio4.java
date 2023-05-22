/*
Troca de valores
Nathaly Ambrósio
22/05/2023
*/
import java.util.Scanner;
public class NathalyAmbrosio_exercicio4 {
    public static void main (String args []){
        Scanner leitor = new Scanner (System.in);

        //Criando as variáveis
        double var1,var2,var3;

        //Iniciando as variáveis
        var1 = 0.0;
        var2 = 0.0;
        var3 = 0.0;
        System.out.println ("Insira dois valores");

        //Leia as variáveis
        var1 = leitor.nextDouble();
        var2 = leitor.nextDouble();

        //Trocando os valores
        var3 = var1;
        var1 = var2;
        var2 = var3;

        System.out.println ("A inversão dos números fica" + var1 + " " + var2);
        leitor.close();
}}