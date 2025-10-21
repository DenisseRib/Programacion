package Ejercicio145;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio145 {

	public static void main(String[] args) throws IOException {
		System.out.println("¿De que tipo es la uva?");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tipo = br.readLine();
		System.out.println("¿De qué tamaño es?");
		Double tamaño = Double.parseDouble(br.readLine());
		System.out.println("¿Cuantos kg es?");
		double kg = Double.parseDouble(br.readLine());
		double precioInicial = (kg*2.50);
		if (tipo.equalsIgnoreCase("A") || tipo.equalsIgnoreCase("B"))
		if (tamaño ==1 || tamaño==2)
		if (tipo.equalsIgnoreCase("A") && (tamaño== 1)) {
			System.out.println("El precio es " + (precioInicial+ 0.2*kg));}
			else if (tipo.equalsIgnoreCase("A") && (tamaño== 2 )) 
				{System.out.println("El precio es " + (precioInicial+ 0.3*kg));}
		if (tipo.equalsIgnoreCase("B") && (tamaño== 1)) {
			System.out.println("El precio es " + (precioInicial-0.3*kg));}
		if (tipo.equalsIgnoreCase("B") && (tamaño== 2)) {
			System.out.println("El precio es " + (precioInicial-0.5*kg));}
		
			
			
		
		
			

		// TODO Auto-generated method stub

	}

}
