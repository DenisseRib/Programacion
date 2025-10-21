package ejercicio3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader lector =  new BufferedReader(new InputStreamReader(System.in));
		float numero1 = Float.parseFloat(lector.readLine());
		float numero2 = Float.parseFloat(lector.readLine());
		
		if(numero2 == 0) {
			System.out.println("No puedes dividir entre 0");
		}else {
			float division = numero1/numero2;
			System.out.println(division);
		}
	}

}
