package exercicios_pooa;

import java.time.Duration;
import java.util.Scanner;

public class Questao9
{

	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in); // instânciar o scanner para ler e armazenar a solicitação na variavel
		
		
		System.out.println("Digite a duração do evento em segundos: ");// solicitação
		int segundos = sc.nextInt(); // variavel para armazenar
		
		
		//int HH = segundos / 3600;  // variavel para as horas, uma hora tem 3600 segundos, então dividimos.
		//segundos = segundos % 3600; // deixando armazenado apenas o resto da divisão
		//int MM = segundos / 60;  // variavel para minutos, um minuto tem 60 segundos, então dividimos.
		//segundos = segundos % 60; // deixando armazenado apenas o resto da divisão
		
		
		// podemos utilizar os métodos built-in 
		Duration dr = Duration.ofSeconds(segundos); // instanciar a classe 
		int horas = dr.toHoursPart(); // variavel para hora, com toHoursPart()
		int minutos = dr.toMinutesPart();// variavel para hora, com toMinutesPart()
		int segundos1 = dr.toSecondsPart();// variavel para hora, com toSecondsPart()
		
		System.out.printf("HH:MM:SS = %02d:%02d:%02d",horas,minutos,segundos1); // para exibir dois numeros colocamos o 02 entre o %d.
		
		
		
		sc.close();

	}

}
