package exercicios_pooa;

import java.util.Scanner;

public class Questao33 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int cont=0;
		System.out.println("Digite um numero: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) 
		{
			for (int j =0; j<4; j++)
			{
				if(j % 4 == 0)
				{	
			        System.out.printf("PUM\n",cont);
				}
				
				else
				{
					System.out.print(cont + " ");
				}
			cont+=1;
			}
			
		}
		sc.close();	
	}
}
