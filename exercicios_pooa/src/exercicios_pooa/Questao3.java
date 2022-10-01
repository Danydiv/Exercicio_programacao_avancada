package exercicios_pooa;

import java.util.Locale;
import java.util.Scanner;

public class Questao3 
{

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US); // biblioteca para mudança de virgula para ponto
		Scanner sc = new Scanner(System.in); // instanciar leitura
		
		
		System.out.println("Digite o nome do vendedor:  "); // solicitação
		String name = sc.next(); // 
		
		System.out.println("Digite o salário fixo do vendedor:  ");
		double sal = sc.nextDouble();
		
		System.out.println("Digite o total em valores das vendas deste vendedor:  ");
		double vendas = sc.nextDouble();
		
		double recebe = sal +=(vendas * 0.15);
		
		System.out.printf("TOTAL = R$ %.2f", recebe); // saída
		
		sc.close(); // fechar leitura
	}

}
