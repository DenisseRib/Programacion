package ejercicio5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Grados  centigrados");
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int C= Integer.parseInt(br.readLine());
		int F = ((9/5 * C) + 32);
		System.out.println("Son " + F);
		// TODO Auto-generated method stub

	}

}
