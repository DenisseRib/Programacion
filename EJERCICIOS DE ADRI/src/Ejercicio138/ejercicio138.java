package Ejercicio138;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio138 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
System.out.println("Introduce tus horas");
double horas = Double.parseDouble(br.readLine());
double horaExtra = (horas-40);
if (horas<40) 
	{System.out.println("Tus sueldo es" + horas*1000);}
else if (horas<=40)
	{System.out.println("Tu sueldo son 1000");}
else {System.out.println("Tu sueldo extra es " + horaExtra*1500);}

		// TODO Auto-generated method stub

	}

}
