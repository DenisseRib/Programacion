package ejercicio3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("La medida de un lado de un cuadrado");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int lado= Integer.parseInt(br.readLine());
		int Area= (lado*lado);
		int Perimetro = (4*lado);
		System.out.println("El Area es " + Area + " y el preimetro es " + Perimetro);
		// TODO Auto-generated method stub

	}

}
