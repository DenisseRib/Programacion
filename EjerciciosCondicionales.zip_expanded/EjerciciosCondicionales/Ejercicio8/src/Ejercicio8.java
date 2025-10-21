import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio8 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader lector =  new BufferedReader(new InputStreamReader(System.in));
		int año = Integer.parseInt(lector.readLine());
		
		if((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
			System.out.println("Año bisiesto");
		}else {
			System.out.println("No lo es");
		}
	}

}
