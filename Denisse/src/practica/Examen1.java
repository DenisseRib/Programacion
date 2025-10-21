package practica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Examen1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Nombre concursante");
		String nombre = br.readLine();
		System.out.println("¿Favorito de la semana? S/N");
		String favorito = br.readLine();
		System.out.println("Porcentaje votos de 0-100");
		double votos = Double.parseDouble(br.readLine());
		System.out.println("¿Ha cantado en duo?si/no");
		String duo = br.readLine();
		if (votos>=80 || favorito.equalsIgnoreCase("S"))
			{System.out.println("Canta en Solitario");}
		else if(votos<=60 || duo.equalsIgnoreCase("N"))
			{System.out.println("Canta en dúo");}
		else {System.out.println("Canta en dúo");}
		
		// TODO Auto-generated method stub

	}

}
