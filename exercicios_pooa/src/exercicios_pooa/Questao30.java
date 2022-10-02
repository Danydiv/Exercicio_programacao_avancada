package exercicios_pooa;

import java.util.Scanner;

public class Questao30 
{

	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);

	        System.out.println("Digite o primeiro valor: ");
	        int valor1 = sc.nextInt();
	        System.out.println("Digite o segundo valor: ");
	        int valor2 = sc.nextInt();

	        int soma = 0;

	        if (valor1 < valor2) 
	        {
	            for (int i = valor1; i <= valor2; i++) 
	            {
	                System.out.printf("%s ",i);
	                soma += i;
	            }
	        }
	        else if (valor1 > valor2) 
	        {
	            for (int i = valor2; i <= valor1; i++) 
	            {
	                System.out.printf("%s ",i);
	                soma += i;
	            }
	        }
	        System.out.printf("Soma = %s", soma);

	        sc.close();
		

	}

}
