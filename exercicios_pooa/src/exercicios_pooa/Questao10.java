package exercicios_pooa;

import java.util.Scanner;

public class Questao10 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); // inst�nciar o scanner para ler e armazenar a solicita��o na variavel
		
		
		System.out.println("Digite sua idade em dias: ");// solicita��o
		int dias = sc.nextInt(); // variavel para 

		int ano = dias / 365; // um ano tem 365 dias, dividir pela solicita��o
		dias %= 365; // o resto da divis�o de uma forma contraida � o mesmo que dias = dias % 365.
		int mes = dias / 30; // fazer o mesmo
		dias %= 30;
		
		System.out.printf("%d ano(s)\n%d m�s(es)\n%d dia(s)",ano,mes,dias);
		sc.close();

	}

}
