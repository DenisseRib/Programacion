package Ejercicio11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio11 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Agrega tres lados de un triangulo");// TODO Auto-generated method stub
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		double lado1= Double.parseDouble(br.readLine());
		double lado2= Double.parseDouble(br.readLine());
		double lado3= Double.parseDouble(br.readLine());
		if ((lado1 == lado2 && lado2==lado3))
		{System.out.println("Es equilatero");}
		else if  ((lado1 == lado2 && lado1!=lado3) || (lado1==lado3 && lado1!=lado2) || (lado2==lado3 && lado2!=lado1))
		{System.out.println("Es isosceles");}
		else if ((lado1!= lado2 && lado2!=lado3&&lado1!=lado3))
		{System.out.println("Es escaleno");}
	}

}
