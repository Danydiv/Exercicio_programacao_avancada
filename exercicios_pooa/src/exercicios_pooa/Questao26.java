package exercicios_pooa;

import java.util.Locale;
import java.util.Scanner;

public class Questao26 
{

	public static void main(String[] args)
	{	Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1 - Barca Viking \n"
				+ "2 - Elevator of Death\n"
				+ "3 - Final Killer\n"
				+ "Digite sua altura e idade: ");
		float altura = sc.nextFloat();
		int idade = sc.nextInt();
		
		if(altura >=1.4 && altura <=1.5 && idade>=14)
		{
			System.out.println("2");
		}
		else if(altura >=1.5 && altura <=1.7 && idade>=12)
		{
			System.out.println("1");
		}
		else if(altura >=1.7 && idade>=16)
		{
			System.out.println("3");
		}
				
		sc.close();
	}

}
