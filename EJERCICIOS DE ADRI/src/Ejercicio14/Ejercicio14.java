package Ejercicio14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio14 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Nombre");
		String nombre = br.readLine();
		System.out.println("Nota de 3 examenes");
		int Nota1= Integer.parseInt(br.readLine());
		int Nota2 = Integer.parseInt(br.readLine());
		int Nota3= Integer.parseInt(br.readLine());
		int notaMedia = ((Nota1+Nota2+Nota3)/3);
		System.out.println("Hola " + nombre + ",  tu nota media es " + notaMedia);
		// TODO Auto-generated method stub

	}

}
