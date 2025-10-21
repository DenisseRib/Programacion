import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio11 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Introduce lado1: ");
		double lado1 = Double.parseDouble(lector.readLine()); 
		System.out.println("Introduce lado2: ");
		double lado2 = Double.parseDouble(lector.readLine());
		System.out.println("Introduce lado3: ");
		double lado3 = Double.parseDouble(lector.readLine());
		
		if((lado1 == lado2 && lado2 == lado3)) {
			System.out.println("Es equilatero");
		}else if((lado1 == lado2 && lado1 != lado3) || (lado1 == lado3 && lado1 != lado2)
				||  (lado2 == lado3 && lado2 != lado1)) {
			System.out.println("Es Isosceles");
		}else if((lado1 != lado2 && lado2 != lado3 && lado1 != lado3)) {
			System.out.println("Es escaleno");
		}

	}

}
