package exercicios_pooa;

import java.util.Scanner;

public class Questao10 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); // instânciar o scanner para ler e armazenar a solicitação na variavel
		
		
		System.out.println("Digite sua idade em dias: ");// solicitação
		int dias = sc.nextInt(); // variavel para 

		int ano = dias / 365; // um ano tem 365 dias, dividir pela solicitação
		dias %= 365; // o resto da divisão de uma forma contraida é o mesmo que dias = dias % 365.
		int mes = dias / 30; // fazer o mesmo
		dias %= 30;
		
		System.out.printf("%d ano(s)\n%d mês(es)\n%d dia(s)",ano,mes,dias);
		sc.close();

	}

}
