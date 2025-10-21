package ejercicio6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio6 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.print("Dime tu peso y tu altura");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		float peso = Float.parseFloat(br.readLine());
		float altura = Float.parseFloat(br.readLine());
		float IMC = (float) (peso/Math.pow(altura, 2));
		System.out.println(" Tu IMC es " + IMC);
		// TODO Auto-generated method stub

	}

}
