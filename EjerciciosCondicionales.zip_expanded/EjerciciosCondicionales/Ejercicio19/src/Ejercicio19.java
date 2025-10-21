import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio19 {

	public static void main(String[] args) throws IOException {
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduce el nombre del juego:");
		String nombre = lector.readLine();
		
		System.out.println("Introduce Nota 1:");
		double nota1 = Double.parseDouble(lector.readLine());
		
		System.out.println("Introduce Nota 2:");
		double nota2 = Double.parseDouble(lector.readLine());
		
		double nota3 = (Math.random() * 10) + 1;
		System.out.println("Nota tester 3 aleatoria f" + nota3);
		
		double notaMedia = (nota1+nota2+nota3)/3.0;

		
		String nombreAbreviado = nombre.substring(0,3).toUpperCase();
		System.out.println("La nota media de " 
		+ nombreAbreviado +  " es: " + notaMedia);
		
		
		

	}

}
