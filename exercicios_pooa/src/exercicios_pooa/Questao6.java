package exercicios_pooa;

import java.util.Locale;
import java.util.Scanner;

public class Questao6
{

	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double consumo; // declaração de variavel para calculo
		
		System.out.println("Digite a distância percorrida: ");
		int distancia = sc.nextInt();
		
		System.out.println("Agora digite o valor gasto de combustível: ");
		double combustivel = sc.nextDouble();
		
		consumo = distancia / combustivel; // calculo com as duas variaveis digitadas pelo usuário
		
		System.out.printf("%.3f Km/l",consumo); //saida
		
		
		sc.close();

	}

}
