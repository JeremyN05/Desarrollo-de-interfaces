package EjerciciosRepaso3;

public class Main {

	public static void main(String[] args) {
		
		Profesor profe01 = new Profesor("67239145F", "Juan", "Perez", 2000, 4, true);
		Profesor profe02 = new Profesor("93471245K", "Marta", "Suarez", 2000, 2, false);
		
		Administracion Ad01 = new Administracion("83491652D", "Blanca", "Marquez", 3000, "Universidad", 3);
		Administracion Ad02 = new Administracion("78290820J", "Luis", "Navarro", 2500, "Universidad", 2);
		
		Directivo Direc01 = new Directivo("612041038O", "David", "Martinez", 2000, false, Turno.MAÑANA);
		Directivo Direc02 = new Directivo("12389736T", "Susana", "Torres", 2000, true, Turno.TARDE);
		
		System.out.println(profe01.toString());
		System.out.println(profe02.toString());
		
		System.out.println(Ad01.toString());
		System.out.println(Ad02.toString());
		
		System.out.println(Direc01.toString());
		System.out.println(Direc02.toString());
	}

}
