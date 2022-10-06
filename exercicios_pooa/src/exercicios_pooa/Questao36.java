package exercicios_pooa;

import java.util.Scanner;

public class Questao36 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

        System.out.print("Digite a quantidade de HO do Papai Noel: ");
        int qtd = scan.nextInt();

        for (int i = 0; i < qtd; i++) 
        {
            System.out.print(" HO");
        }
            System.out.print("!");

            scan.close();

	}

}
