import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio10 {
	public static void main(String[] args) throws NumberFormatException, IOException  {
		BufferedReader lector =  new BufferedReader(new InputStreamReader(System.in));
		int num1 = Integer.parseInt(lector.readLine());
		int num2 = Integer.parseInt(lector.readLine());
		int num3 = Integer.parseInt(lector.readLine());
		
		if((num1 >= num2) && (num1 >= num3)) {
			if(num2 > num3) {
				System.out.println("El orden es:" + num1 + num2 + num3);
			}else {
				System.out.println("El orden es:" + num1 + num3 + num2);
			}
		}else if((num2 >= num1) && (num2 >= num3)) {
			if(num1  > num3) {
				System.out.println("El orden es:" + num2 + num1 + num3);
			}else {
				System.out.println("El orden es:" + num2 + num3 + num1);
			}
		
		}else if((num3 >= num1) && (num3 >= num2)) {
			if(num1 > num2) {
				System.out.println("El orden es:" + num3 + num1 + num2);
			}else {
				System.out.println("El orden es:" + num3 + num2 + num1);
			}
		}
	}

}
