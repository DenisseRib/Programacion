package ejercicio13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio13 {

	public static void main(String[] args) throws NumberFormatException, IOException { System.out.println("Edad");
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int edad = Integer.parseInt(br.readLine());
		boolean mayor = (edad>=18);
		boolean menor = (edad<65);
		boolean entre = (edad>=18 && edad<65);
		System.out.println("Es mayor de edad ");
		System.out.println(mayor);
		System.out.println("Es menor de 65 ");
		System.out.println(menor);
		System.out.println(entre);
		// TODO Auto-generated method stub

	}

}
