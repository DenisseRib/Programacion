package Ejercicio12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio12 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Mes de nacimiento");
		String mes= br.readLine();
		Double dia = Double.parseDouble(br.readLine());
		if (mes.equalsIgnoreCase("Enero")){
			if (dia<21)
		System.out.println("Eres Capricornio");
		else 
			System.out.println("Eres Acuario");
		}
		else if (mes.equalsIgnoreCase("Febrero")) {
			if (dia<21)
				System.out.println("Eres Acuario ");
			else System.out.println("Eres Tauro");}
		// TODO Auto-generated method stub

	}

}
