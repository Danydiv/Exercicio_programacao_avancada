package exercicios_pooa;

import java.util.Locale;
import java.util.Scanner;

public class Questao6
{

	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double consumo; // declara��o de variavel para calculo
		
		System.out.println("Digite a dist�ncia percorrida: ");
		int distancia = sc.nextInt();
		
		System.out.println("Agora digite o valor gasto de combust�vel: ");
		double combustivel = sc.nextDouble();
		
		consumo = distancia / combustivel; // calculo com as duas variaveis digitadas pelo usu�rio
		
		System.out.printf("%.3f Km/l",consumo); //saida
		
		
		sc.close();

	}

}
