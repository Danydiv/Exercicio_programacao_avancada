package exercicios_pooa;

import java.util.Scanner;

public class Questao39 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para imprimir a tabuada: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int resultado = n*i;
            System.out.println(n + " x " + i + " = " + resultado);
        }


        sc.close();

	}

}
