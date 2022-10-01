package exercicios_pooa;

import java.util.Locale;
import java.util.Scanner;

public class Questao21
{

	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
				
		int year1 = sc.nextInt();
		double velocity1 = sc.nextDouble();
		int year2 = sc.nextInt();
		double velocity2 = sc.nextDouble();
		int year3 = sc.nextInt(); 
		double velocity3 = sc.nextDouble();
		
		// condição do ano
		if (year1 > year2 && year1 > year3)
		 {
			System.out.printf("Ano do carro mais novo = %s", year1);
	      }
		else if (year2 > year1 && year2 > year3)
		{
			System.out.printf("Ano do carro mais novo = %s", year2);
		}
		else 
		{
			System.out.printf("Ano do carro mais novo = %s", year3);
		}
		
		// condição da velocidade
		if (velocity1 > velocity2 && velocity1 > velocity3)
		{
			System.out.printf("Velocidade do mais rápido = %s", velocity1);
		}
		else if (velocity2 > velocity1 && velocity2 > velocity3)
		{
			System.out.printf("Velocidade do mais rápido = %s", velocity2);
		}
		else 
		{
			System.out.printf("Velocidade do mais rápido = %s", velocity3);
		}
		sc.close();
		

	}

}
