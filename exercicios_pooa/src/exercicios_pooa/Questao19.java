package exercicios_pooa;

import java.util.Locale;
import java.util.Scanner;

public class Questao19
{
	
	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);// para aceitar ponto na entrada 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o salário: "); // solicitação
		double salario = sc.nextDouble(); //armazenar
		
		double aumento10 = (salario * 0.1)+ salario; // aumento de 10%
		double aumento7 = (salario * 0.07)+ salario;// aumento de 7%
		double aumento5 = (salario * 0.05)+ salario; // aumento de 5%
		
		if(salario > 500) // condição se o slario for maior que 500
		{	
			System.out.println(aumento10); // imprimir o aumento de 10%
		}
		else if(salario >300 && salario < 500)// condição se o slario for maior que 300 e menor que 500
		{
			System.out.println(aumento7); // imprimir o aumento de 7%
		}
		else
		{
			System.out.println(aumento5); // condição se o slario não for nenhuma das duas
		}
	sc.close();
	}

}
