import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio12 {
	public static void main(String[] args) throws IOException {
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Introduce el mes de nacimineto: ");
		String mes = lector.readLine();
		System.out.println("Introduce el dia de nacimineto: ");
		int dia = Integer.parseInt(lector.readLine());
		
		if(mes.equalsIgnoreCase("Enero")) {
			if(dia < 21)
				System.out.println("Eres capricornio");
			else
				System.out.println("Eres Acuario");
		}else if(mes.equalsIgnoreCase("Febrero")) {
			if(dia < 21)
				System.out.println("Eres Acuario");
			else
				System.out.println("Eres tauro");
		}
	}

}
