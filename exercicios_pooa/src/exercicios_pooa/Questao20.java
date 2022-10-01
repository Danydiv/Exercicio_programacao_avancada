package exercicios_pooa;

import java.util.Locale;
import java.util.Scanner;

public class Questao20
{
	
	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);// para aceitar ponto na entrada 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("S - Santa Ana\n"
				+ "I - Industriários\n"
				+ "T - Tabatinga\n"
				+ "Digite seu bairro: " ); // solicitação
		String bairro = sc.next(); 
		System.out.print("Renda: ");//armazenar
		double renda = sc.nextDouble(); 
		System.out.print("Valor do seu consumo: ");//armazenar
		double consumo = sc.nextDouble();
		
		double desconto1 = (consumo - 50.00);
		double desconto2 = (consumo - 25.00);
		double desconto3  = (consumo - 240.00);
		double desconto4 = (consumo - 120.00);
		double desconto5  = (consumo - 720.00);
		double desconto6  = (consumo - 360.00);
		
		if(bairro == "S" && renda >50 && renda <=500)
		{	
			System.out.printf("%.2f",desconto2);
		}
		else if(bairro == "S" && renda >500 && renda <=1000)
		{
			System.out.printf("%.2f",desconto2);
		}
		else if(bairro == "I" && renda >240 && renda <=1000)
		{
			System.out.printf("%.2f",desconto3);
		}
		else if(bairro == "I" && renda >1000 && renda <=5000)
		{
			System.out.printf("%.2f",desconto4);
		}
		else if(bairro == "T" && renda >5000 && renda <=10000)
		{
			System.out.printf("%.2f",desconto5);
		}
		else if(bairro == "T" && renda >10000 && renda <=20000)
		{
			System.out.printf("%.2f",desconto6);
		}
		else if(renda < 0 || consumo < 0 )
		{
			System.out.print("RENDA OU CONSUMO NÃO PODEM SER NEGATIVOS!");
		}
		else if(bairro != "T" || bairro != "I" || bairro != "S")
		{
			System.out.print("BAIRRO INVÁLIDO!");
		}
		sc.close();
	}

}
