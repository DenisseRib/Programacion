import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio18 {

	public static void main(String[] args) throws IOException {
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduce el nombre del alumno/a:");
		String nombre = lector.readLine();
		
		System.out.println("Introduce el año de nacimiento:");
		int añoNacimiento = Integer.parseInt(lector.readLine());
		
		int edad = 2025-añoNacimiento;
		boolean puedeSalir = false;
		
		if(edad >= 15 && edad<18) {
			System.out.println("¿Autorizacion firmada por los padres? S/N");
			char autorizacionFirmada = lector.readLine().charAt(0);
			if(autorizacionFirmada == 'S' || autorizacionFirmada == 's') {
				puedeSalir = true;
			}	
		}else if(edad >= 18) {
			puedeSalir = true;
		}
		
		System.out.println(nombre + " , " + edad 
				+ " años, ¿Puede salir fuera en los recreos?:" + puedeSalir);
		
	}

}
