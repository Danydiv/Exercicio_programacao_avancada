package exercicios_pooa;

import java.util.Scanner;

public class Questao2 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);//instanciar leitura
		
		
		int f; // declarar variaveis
		int horas;
		double salario;
		double hrt;
		
		System.out.println("Digite o n� do funcion�rio: ");// solicita�ao ao usu�rio
		f = sc.nextInt();
		
		System.out.println("Digite a quantidade de horas trabalhadas: ");
		horas = sc.nextInt();
		
		System.out.println("Digite o valor por horas trabalhadas: ");
		hrt = sc.nextDouble();
		
		salario = horas * hrt;
		
		System.out.printf("N�MERO = %d%n", f); //sa�da
		System.out.printf("N�MERO = R$ %.2f", salario);
		
		
		sc.close();

	}

}
