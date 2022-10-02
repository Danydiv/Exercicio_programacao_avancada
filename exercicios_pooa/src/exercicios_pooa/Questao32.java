package exercicios_pooa;

import java.util.Scanner;

public class Questao32 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Digite a quantidade de clientes: ");
		int qtd = sc.nextInt();
		
		float somaAlcool=0,somagasosa=0,somaDiesel=0, litroA=0, litroG=0,litroD=0;
		int tipoA= 0,tipoG=0, tipoD=0;
		
		for (int i = 0; i < qtd; i++) 
		{
			
            System.out.println("Digite o tipo de combustível: ");
            System.out.println("1 - Álcool"
            		+ "2 - Gasolina"
            		+"3 - Diesel: ");
            int combust = sc.nextInt();
            
		 if(combust == 1)
		 {
			 tipoA = tipoA + 1;
             System.out.println("Digite a quantidade em litros abastecido: ");
             litroA = sc.nextFloat();                    
             somaAlcool = somaAlcool + litroA;
         }
		 if(combust == 2)
		 {
			 tipoG = tipoG + 1;
             System.out.println("Digite a quantidade em litros abastecido: ");
             litroG = sc.nextFloat();                    
             somagasosa = somagasosa + litroG;
         }
		 if(combust == 3)
		 {
			 tipoD = tipoD + 1;
             System.out.println("Digite a quantidade em litros abastecido: ");
             litroD = sc.nextFloat();                    
             somaDiesel = somaDiesel + litroD;
         }
		
		 
	     }System.out.println("Álcool: " + tipoA + " - Qtd Litros: " + somaAlcool);
	     System.out.println("Gasolina: " + tipoG + " - Qtd Litros: " + somagasosa);
	     System.out.println("Diesel: " + tipoD + " - Qtd Litros: " + somaDiesel);
		sc.close();

	}

}
