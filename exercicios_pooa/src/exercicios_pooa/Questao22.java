package exercicios_pooa;

import java.util.Locale;
import java.util.Scanner;

public class Questao22
{

	public static void main(String[] args)
	{	Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o consumo: ");
		int consumo = sc.nextInt();
		
		double valor1 = 7;
		double valor2 = ((consumo - 10)*1) + valor1;
		double valor3 =valor1 +((30 - 10) * 1) + ((consumo - 31) * 2);
		double valor4 = valor1 + ((30 - 10) * 1) + ((100 - 30) * 2) + ((consumo - 100) * 5);
		
		if(consumo <= 10)
		{      
            System.out.printf("R$ %.2f ",valor1);
        } 
		else if(consumo <= 30)
		{
            System.out.printf("R$ %.2f " , valor2);
        }
		else if(consumo > 30 && consumo <= 100)
		{
			System.out.printf("R$ %.2f" + valor3);
        }
		else if(consumo > 100)
		{
            System.out.printf("R$ %.2f",valor4);
        }
		sc.close();
		
	}

	
}
