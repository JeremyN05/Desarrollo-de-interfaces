package Biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Libros> libro = new ArrayList<Libros>();
		
		Scanner entrada = new Scanner(System.in);
		int opcion = 0;

		Libros li01 = new Libros(01, "Veintemil leguas de viaje", "20-03-1990", false);
		libro.add(li01);
		
		Revistas re01 = new Revistas(02, "Hola", "24-09-2025", 100);
		
		do {
			
		System.out.println("------Menú------");
		System.out.println("1. Mostrar todos los articulos de la biblioteca");
		System.out.println("2. Prestar libro a usuario");
		System.out.println("3. Devolver libro de usuario");
		System.out.println("4. Estado del Libro");
		System.out.println("5. Salir");
		
		opcion = entrada.nextInt();
		
		}while(opcion < 4);
		
		entrada.close();
	}

}
