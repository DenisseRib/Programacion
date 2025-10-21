package Exercise1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduce tu nombre");
		String nombre = br.readLine();
		System.out.println("Hola, " + nombre);
		System.out.println("Introduce tu edad ");
		String Edad = br.readLine();
		int textoEdad = Integer.parseInt(Edad);
		// TODO Auto-generated method stub

	}

}
