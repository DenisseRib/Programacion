package ejercicio17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio17 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Minutos de llamada");
		int min = Integer.parseInt(br.readLine());
		System.out.println("Dia");
		String dia = br.readLine();
		System.out.println("Turno de llamada, ¿fue de mañana o de tarde?");
		String turno = br.readLine();
		double tarifa = 0;
		//primeros 5 minutos
		if (min <=5)
			{System.out.println("Tarifa a pagar" +(tarifa= 5*1));}
		//siguientes tres
		else if (min <=8)
			{System.out.println("Tarifa a pagar " +(tarifa = (5*1)+ (3*0.8)));}
		
		else if (min <=10)
			{System.out.println("Tarifa a pagar " + (tarifa = (5*1)+ (3*0.8)+ (2*0.7)));}
		
		else if (min>10)
			{System.out.println("Tarifa a pagar " + (tarifa = (5*1)+ (3*0.8)+ (2*0.7)+ ((min-10)*0.50)));}
		else 
		{System.out.println("tarifa base" + tarifa + "euros");}
	double impuesto = 0 ;
	 if (dia.equalsIgnoreCase("Domingo"))
			 {System.out.println(" Tarifa adicional" + (impuesto=0.03));}
	 else { if (turno.equalsIgnoreCase("mañana"))
	        {System.out.println("Tarifa de mañana" + (impuesto=0.15));}
	 else if (turno.equalsIgnoreCase("tarde"))
	       {System.out.println("Tarifa de tarde" + ( impuesto=0.1));}
	 double total = tarifa + (tarifa*impuesto) ;
	 System.out.println("Total a pagar" + total);
		 
	 }
		
		
		// TODO Auto-generated method stub

	}

}
