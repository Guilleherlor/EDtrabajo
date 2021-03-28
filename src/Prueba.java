import java.util.Scanner;



public class Prueba {

	public static void main(String[] args) {
		System.out.println("Introduza un numero");
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		
		while (n != -1)
		{
			boolean esPrimo = true;
			int divisor = 2;
			while (esPrimo && divisor < n)
			{
				if (n%divisor != 0)
				{
					divisor++;
				}
				else
				{
					esPrimo = false;
				}
			}
			
			if (esPrimo)
				System.out.println("El número "+n+" es primo");
			else
				System.out.println("El número "+n+" no es primo");
			
			System.out.println("Escribe un número");
			n = sc.nextInt();
		}
	}

}
