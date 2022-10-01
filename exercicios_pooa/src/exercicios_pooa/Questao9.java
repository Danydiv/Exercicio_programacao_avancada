package exercicios_pooa;

import java.time.Duration;
import java.util.Scanner;

public class Questao9
{

	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in); // inst�nciar o scanner para ler e armazenar a solicita��o na variavel
		
		
		System.out.println("Digite a dura��o do evento em segundos: ");// solicita��o
		int segundos = sc.nextInt(); // variavel para armazenar
		
		
		//int HH = segundos / 3600;  // variavel para as horas, uma hora tem 3600 segundos, ent�o dividimos.
		//segundos = segundos % 3600; // deixando armazenado apenas o resto da divis�o
		//int MM = segundos / 60;  // variavel para minutos, um minuto tem 60 segundos, ent�o dividimos.
		//segundos = segundos % 60; // deixando armazenado apenas o resto da divis�o
		
		
		// podemos utilizar os m�todos built-in 
		Duration dr = Duration.ofSeconds(segundos); // instanciar a classe 
		int horas = dr.toHoursPart(); // variavel para hora, com toHoursPart()
		int minutos = dr.toMinutesPart();// variavel para hora, com toMinutesPart()
		int segundos1 = dr.toSecondsPart();// variavel para hora, com toSecondsPart()
		
		System.out.printf("HH:MM:SS = %02d:%02d:%02d",horas,minutos,segundos1); // para exibir dois numeros colocamos o 02 entre o %d.
		
		
		
		sc.close();

	}

}
