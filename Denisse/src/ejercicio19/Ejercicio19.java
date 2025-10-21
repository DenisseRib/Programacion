package ejercicio19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio19 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduce nombre videojuego");
		String nombre = br.readLine();
		System.out.println("Introducir nota numero 1");
		int num1 = Integer.parseInt(br.readLine());
		System.out.println("Introducir nota numero 2");
		int num2 = Integer.parseInt(br.readLine());
		System.out.println("Valor aleatorio nota numero 3");
		double num3 = (( Math.random()*10)+1);
		System.out.println(num3);
		if (num1>=1 && num1<=10 ||num2>=1 && num2<=10 ||num3>=1 && num3<=10)
		{System.out.println("Nota media de  "+ nombre.substring(0,3)+" " + ((num1+num2+num3)/3));}
		
		// TODO Auto-generated method stub

	}

}
