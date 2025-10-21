package Ejercicio18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio18 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Introduce el nombre del alumno");
		String nombre= br.readLine();
		
		System.out.println("Introduce el año de nacimiento");
		int año = Integer.parseInt(br.readLine());
		System.out.println("¿Tiene autorizacion de padres? S/N");
		String autorizacion= br.readLine();
		int edad = 2025-año;
		System.out.println( nombre + "," + edad + " ¿Puede salir?");
		if (edad<15)
		 {System.out.println("No puede salir");}
		else if (edad>=15 && edad<18 && autorizacion.equalsIgnoreCase("s") ||autorizacion.equalsIgnoreCase("S"))
			{System.out.println("Puede salir");}
		else  if (edad>=15 && edad<18 && autorizacion.equalsIgnoreCase("n") ||autorizacion.equalsIgnoreCase("N"))
		    {System.out.println("No puede salir");}
		else {System.out.println("Puede salir.");}
		
	
		// TODO Auto-generated method stub

	}

}
