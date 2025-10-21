import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class while2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Introduce un numero mayor a cero");
		int contador = 0;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n =Integer.parseInt(br.readLine());
		while (n !=0) {
			if (n%3==0 && n%2==0 && n%5==0)
			{contador++;}
			System.out.println("Introduce 0 para terminar");
			n = Integer.parseInt(br.readLine());}
		System.out.println("Hay " + contador + " numeros multiplos de 2, 3 y 5");
		
		// TODO Auto-generated method stub

	}

}
