package exercicios_pooa;

public class Questao28 
{

	public static void main(String[] args) 
	{
		int j = 60, i = 1; //declarar dois valores iniciando em 60 e 1
		
		System.out.println("I: " + i + " J: " + j);// printar os dois valores iniciais antes do looping
		
		while(true) //enquanto o looping for verdadeiro
		{
			i += 3;// somar 3 valores ao i
			j -= 5;// diminuir 5 valores ao j
			
			System.out.println("I: " + i + " J: " + j); // printar 
			
			if(j == 0) //condicao para parar o looping quando o j chegar a zero
			{
				break;// break para parar
			}

		}
	}

}
