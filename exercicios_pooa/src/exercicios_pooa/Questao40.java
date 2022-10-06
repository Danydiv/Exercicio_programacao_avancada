package exercicios_pooa;

import java.util.Scanner;

public class Questao40 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);

        System.out.println("Digite o 1� lado do tri�ngulo: ");
        int l1 = sc.nextInt();
        System.out.println("Digite o 2� lado do tri�ngulo: ");
        int l2 = sc.nextInt();
        System.out.println("Digite o 3� lado do tri�ngulo: ");
        int l3 = sc.nextInt();

        if ((l1 < l2 + l3) && (l2 < l1 + l3) && (l3 < l2 + l1)) {
            if ((l1 == l2) && (l1 == l3)) {
                System.out.println("Tri�ngulo Equil�tero");
            }
            if (((l1 == l2) && (l1 != l3)) || ((l1 == l3) && (l1 != l2)) || ((l2 == l3) && (l2 != l1))) {
                System.out.println("Tri�ngulo Is�sceles");
            }
            if ((l1 != l2) && (l1 != l3) && (l2 != l3)) {
                System.out.println("Tri�ngulo Escaleno");
            }
        } else {
            System.out.println("Os valores n�o formam um tri�ngulo");
        }

        sc.close();
	}

}
