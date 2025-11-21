package EjercicioRepaso4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int opcion;
		String dni;
		
		int salario;
		
		modulo[] arrayModulos = new modulo[2];
		
		Profesor profe01 = new Profesor("67239145F", "Juan", "Perez", 2000, 4, true);
		Profesor profe02 = new Profesor("93471245K", "Marta", "Suarez", 5000, 2, false);
		
		Administracion Ad01 = new Administracion("83491652D", "Blanca", "Marquez", 8000, "Universidad", 3);
		Administracion Ad02 = new Administracion("78290820J", "Luis", "Navarro", 2500, "Universidad", 2);
		
		Directivo Direc01 = new Directivo("612041038O", "David", "Martinez", 6000, false, Turno.MAÑANA);
		Directivo Direc02 = new Directivo("12389736T", "Susana", "Torres", 2000, true, Turno.TARDE);
		
		arrayModulos[0] = new modulo("Programación", 6, profe01, false);
		arrayModulos[1] = new modulo("Intinerario", 2, profe02, true);
		
		alumno al01 = new alumno("23981732J", "Pepito", "Torres", "10/08/2000", Sexo.MASCULINO, false, arrayModulos);
		alumno al02 = new alumno("29309832O", "Juana", "Suarez", "20/11/2000", Sexo.FEMENINO, false, arrayModulos);
		
		ArrayList <personas> persona = new ArrayList<>();
		
		persona.add(profe01);
		persona.add(profe02);
		persona.add(Direc01);
		persona.add(Direc02);
		persona.add(Ad01);
		persona.add(Ad02);
		
		persona.sort(null);
		
		System.out.println("La persona que más cobra es: " + persona.get(persona.size()-1));
		
		System.out.println(profe01.toString());
		System.out.println(profe02.toString());
		
		System.out.println(Ad01.toString());
		System.out.println(Ad02.toString());
		
		System.out.println(Direc01.toString());
		System.out.println(Direc02.toString());
		
		System.out.println(al01.toString());
		System.out.println(al02.toString());
		
		System.out.println("Menú");
		System.out.println("1. Añadir profesor");
		System.out.println("2. Añadir una administración");
		System.out.println("3. Añadir un directivo");
		System.out.println("4. Añadir un alumno");
		System.out.println("5. Salir");
		
		opcion = entrada.nextInt();
		
		switch (opcion) {
		case 1:
			
			entrada.nextLine();
			
			System.out.println("Introduzca el DNI del profesor: ");
			dni = entrada.nextLine();
			System.out.println("Introduzca el nombre del profesor: ");
			String nombreProf = entrada.nextLine();
			System.out.println("Introduzca el apellido del profesor: ");
			String apellidoProf = entrada.nextLine();
			System.out.println("Introduzca el salario del profesor: ");
			salario = entrada.nextInt();
			System.out.println("Introduzca el número de asignaturas del profesor: ");
			int nAsignaturas = entrada.nextInt();
			entrada.nextLine();
			System.out.println("El profesor es tutor: ");
			String tutor = entrada.nextLine();
			
			boolean esTutor = false;
			
			if(tutor.equalsIgnoreCase("si")) {
				
				esTutor = true;
				
			}else if(tutor.equalsIgnoreCase("no")) {
				
				esTutor = false;
				
			}else {
				
				System.out.println("Error");
				
			}
			
			Profesor profe03 = new Profesor(dni, nombreProf, apellidoProf, salario, nAsignaturas, esTutor);
			
			System.out.println(profe03.toString());
			
			break;
			
		case 2:
			
			entrada.nextLine();
			
			System.out.println("Intrdouzca el DNI del Adminitrador/a: ");
			dni = entrada.nextLine();
			System.out.println("Introduzca el nombre del administrador/a: ");
			String nombreAD = entrada.nextLine();
			System.out.println("Introduzca el apellido del administrador/a: ");
			String apellidoAD = entrada.nextLine();
			System.out.println("Introduzca el salario del administrador/a: ");
			salario = entrada.nextInt();
			entrada.nextLine();
			System.out.println("Introduzca los estudios del administrador/a: ");
			String estudios = entrada.nextLine();
			System.out.println("Introduzca los años de antiguedad del administrador/a: ");
			int antiguedad = entrada.nextInt();
			
			Administracion Ad03 = new Administracion(dni, nombreAD, apellidoAD, salario, estudios, antiguedad);
			
			System.out.println(Ad03.toString());
			
			break;

		default:
			
			System.out.println("Número introducido no valido");
			break;
		}
		
		entrada.close();
	}

}
