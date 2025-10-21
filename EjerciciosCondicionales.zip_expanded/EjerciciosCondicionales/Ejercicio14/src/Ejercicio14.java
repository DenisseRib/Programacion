import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio14 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Precio inicial por kilo: ");
		double precioInicial = Double.parseDouble(lector.readLine()); 
		
		System.out.println("Tipo de uva (A/B): ");
		//Devuelve primera letra introducida por el usuario en formato char
		char tipo = lector.readLine().charAt(0); 
		
		System.out.println("Tamaño(1/2); ");
		int tamaño = Integer.parseInt(lector.readLine());
		
		System.out.println("Kilos por uva: ");
		double kilos = Double.parseDouble(lector.readLine());
		
		double precioFinal = 0;
		if(tipo == 'A') { //tipo.equalsIgnoreCase('A') para String
			if(tamaño == 1) {
				precioFinal = precioInicial + 0.20;
				System.out.println("Tipo A, tamaño 1, +0.20");
			}else if(tamaño == 2) {
				precioFinal = precioInicial + 0.30;
				System.out.println("Tipo A, tamaño 2, +0.30");
			}
		} else if(tipo == 'B') { 
			if(tamaño == 1) {
				precioFinal = precioInicial - 0.30;
				System.out.println("Tipo B, tamaño 1, -0.30");
			}else if(tamaño == 2) {
				precioFinal = precioInicial - 0.50;
				System.out.println("Tipo B, tamaño 1, -0.50");
			}
		}
		
		double ganancia = precioFinal * kilos;
		System.out.println("Precio final = " + precioFinal);
		System.out.println("Ganancia final: " + ganancia + "€");
		
		
		
		
	}

}
