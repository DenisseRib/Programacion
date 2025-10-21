package practica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class swicth1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Introduce un dia de la semana");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String Dia = br.readLine();
	    int numero =  Integer.parseInt(Dia);
	    switch (numero)
	    { case 1:System.out.println("Es lunes");
	    break;
	    case 2:System.out.println("Es martes");
	    break;
	    case 3:System.out.println("Es miercoles");
	    break;
	    case 4:System.out.println("Es jueves");
	    break;
	    case 5:System.out.println("Es viernes");
	    break;
	    case 6:System.out.println("Es sabado");
	    break;
	    case 7:System.out.println("Es domingo");
	    break;
	    default:System.out.println("ERROR");
	    break;
	    }
		// TODO Auto-generated method stub

	}

}
