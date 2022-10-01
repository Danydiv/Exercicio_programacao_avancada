package exercicios_pooa;

import java.util.Scanner;

public class Questao16
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Digite a plulação atual do país A: ");
		double pA = sc.nextDouble();
		
		System.out.println("Digite a plulação atual do país A: ");
		double pB = sc.nextDouble();
		

		for (int anos = 1; ; anos++) 
		{
		    pA = pA * 1.03; //3%
		    pB = pB * 1.015; //1,5%
		    if (pA >= pB) 
		    {
		        System.out.printf("%d anos", anos);
		        break;
		    }
		}
		
		
		sc.close();

	}

}
