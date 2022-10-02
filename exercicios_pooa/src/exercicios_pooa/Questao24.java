package exercicios_pooa;

import java.util.Scanner;

public class Questao24 
{

	public static void main(String[] args)
	{
		Scanner scc = new Scanner(System.in);
		
		
		int n = 0, invert = 0, resto = 0; 
		
		System.out.println("Digite um numero com 5 algarismos: ");
		n = scc.nextInt();
		
		resto = n;

		while (n > 0) 
		{
			invert = invert * 10;
			invert = invert + (n % 10);
			n = n / 10;
		}
			
			if(invert == resto)
			{
				System.out.println("S");
			} 
			else 
			{
				System.out.println("N");
			}
			
			
	 scc.close();
	 }

}
