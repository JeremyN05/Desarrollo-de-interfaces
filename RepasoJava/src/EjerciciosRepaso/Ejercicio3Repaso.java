package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio3Repaso {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int contador = 0;
		
		int [][] matriz = { {2,5,4},
						  	{9,22,3},
						    {99,6,1}
						  			};
		
		for(int i = 0; i < matriz.length; i++) {
			
			for(int j = 0; j < matriz[i].length; j++) {
				
				contador += matriz[i][j]; 
				
			}
			
		}
		
		System.out.println("La suma de todos los números es: " + contador);
		
		entrada.close();

	}

}
