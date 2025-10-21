package practica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practica {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Nombre de pelicula");
		String peli= br.readLine();
		System.out.println("Edad usuario");
		int edad= Integer.parseInt(br.readLine());
		if (edad>=18) 
		{System.out.println("Puede ver la pelicula");}
		else if (edad<18)
			{System.out.println("Tiene autorizacion S/N");}
		String autorizacion=br.readLine();
		 if (autorizacion.equalsIgnoreCase("si")) {System.out.println("Puedes verla");}
		else {System.out.println("No puedes verla");}
		
		}
		// TODO Auto-generated method stub

	

}
