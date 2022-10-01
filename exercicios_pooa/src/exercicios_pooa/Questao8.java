package exercicios_pooa;

import java.util.Locale;
import java.util.Scanner;

public class Questao8 
{

	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double IR = 0,RL,RendaConjunta;
				
		System.out.println("Digite o valor da renda da Pessoa 1: ");
		double RendaPessoa1 = sc.nextDouble();
		
		System.out.println("Digite o valor da renda da Pessoa 1: ");
		double RendaPessoa2 = sc.nextDouble();
		
		RendaConjunta = (RendaPessoa1 + RendaPessoa2);		
				
		if ( RendaConjunta <= 900)
		{
			System.out.printf("RENDA CONJUNTA: %.2f%n", RendaConjunta);
			System.out.println("ALÍQUOTA UTILIZADA: Isento");
			System.out.printf("IMPOSTO DE RENDA: 0.00%n");
			System.out.printf("RENDA LÍQUIDA: %.2f%n",RendaConjunta);
		}	
		else if ( RendaConjunta >= 900.01 && RendaConjunta <= 1500.00)
		{
			IR = RendaConjunta * 0.1;
			RL = RendaConjunta - IR;
			System.out.printf("RENDA CONJUNTA: %.2f%n", RendaConjunta);
			System.out.println("ALÍQUOTA UTILIZADA: 10%");
			System.out.printf("IMPOSTO DE RENDA: %.2f%n", IR);
			System.out.printf("RENDA LÍQUIDA: %.2f", RL);
		}
		else if ( RendaConjunta >= 1500.01 && RendaConjunta <= 2500.00)	
		{
			IR = RendaConjunta * 0.15;
			RL = RendaConjunta - IR;
			System.out.printf("RENDA CONJUNTA: %.2f%n", RendaConjunta);
			System.out.println("ALÍQUOTA UTILIZADA: 15%");
			System.out.printf("IMPOSTO DE RENDA: %.2f%n", IR);
			System.out.printf("RENDA LÍQUIDA: %.2f", RL);
		}
		else
		{
			IR = RendaConjunta * 0.25;
			RL = RendaConjunta - IR;
			System.out.printf("RENDA CONJUNTA: %.2f%n", RendaConjunta);
			System.out.println("ALÍQUOTA UTILIZADA: 25%");
			System.out.printf("IMPOSTO DE RENDA: %.2f%n", IR);
			System.out.printf("RENDA LÍQUIDA: %.2f", RL);
		}
		
		sc.close();

	}

}
