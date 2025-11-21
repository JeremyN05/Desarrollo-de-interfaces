package EjercicioUMLVehículosinteligentes;

public class Main {

	public static void main(String[] args) {

		CocheAutonomo coche1 = new CocheAutonomo(1, "deportivo", true, 99.9, "10-04-2000", 4, 80.7, "32784DSE", 4, "102-Ve");
		CocheAutonomo coche2 = new CocheAutonomo(2, "Familiar", false, 70.4, "09-11-1999", 8, 80.2, "SJKE-2304", 6, "DS-V3");
		
		DroneAereo dron1 = new DroneAereo(1, "Caza", false, 100.0, "20-08-2020", 40.0, 4, 20.0, true, "Technology Enterprise");
		DroneAereo dron2 = new DroneAereo(2, "Comercial", true, 80.8, "18-10-2024", 50.0, 6, 30.0, true, "VTechnology");
		
		RobotRepartidor robot1 = new RobotRepartidor(1, "Restaurante", false, 129.3, "28-02-2015", "Platos", 10.0, "Hostelería", true, 4);
		
		
	}

}
