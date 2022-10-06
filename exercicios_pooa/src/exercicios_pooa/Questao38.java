package exercicios_pooa;

import java.util.Scanner;

public class Questao38 
{

	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);

        System.out.print("Digite um n�mero para saber se � primo ou n�o: ");
        int numero = sc.nextInt();

            if (ehPrimo(numero)) {
                System.out.println("� primo");
            } else {
                System.out.println("N�o � primo");
            }


        sc.close();
    }

    static boolean ehPrimo(int n)
    {
        // Corner case
        if (n <= 1)
            return false;
  
        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
  
        return true;
    }

}
