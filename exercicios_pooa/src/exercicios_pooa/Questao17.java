package exercicios_pooa;

import java.util.Scanner;

public class Questao17 
{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de casos: ");
		int n =sc.nextInt();
		
		int n1,contador;
		for( int i = 1; i <= n ; i++) // numeros de vezes que o programa vai rodar e pedir um nemero
		{
			contador=0; // um contador iniciando em zero
			n1=sc.nextInt();// solicitação de um numero
			for(int j = 2 ; j < n1; j++)
			{
				if (n1 % j == 0) contador++;
			}
				
			if( contador == 0)
				{
					System.out.printf(n1 + " é primo \n");
				}
				else
				{
					System.out.printf(n1 + " não é primo \n");
				}
			}sc.close();
		}
		
	}

	

