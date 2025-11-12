package practicaTema2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ejercicioPractica2 {
	public static String lector() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		return br.readLine();
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		boolean salir = false;
		while(!salir) {
			System.out.println("===BIBLIOTECA Calasanz Games===");
			System.out.println("1. Gestión de Usuarios");
			System.out.println("2. Catálogo de Juegos");
			System.out.println("3. Sistema de Valoraciones");
			System.out.println("4. Estadísticas y Reportes");
			System.out.println("5. Calculadora de Descuentos");
			System.out.println("6. Salir");
			System.out.println("Introduce una opcion");
			int opcion = Integer.parseInt(lector());
			switch (opcion){
			case 1: caso1();
				break;
			case 2:
				caso2();
				break;
			case 3: caso3();
				break;
			case 4:  caso4() ;
				break;
			case 5:caso5();
				break;
			case 6: salir=true;
			System.out.println("Saliendo del sistema");
				break;
			default : System.out.println("Opción no válida");
			}
			
		}
		
		
		// TODO Auto-generated method stub

	}
	public static void caso1() throws NumberFormatException, IOException {
		
		boolean salir = false;
		while(!salir) {
			System.out.println("==GESTIÓN DE USUARIOS==");
			System.out.println("1.Crear nuevo usuario");
			System.out.println("2.Calcular edad del usuario");
			System.out.println("3.Volver al menú principal");
			int opcion = Integer.parseInt(lector());
			switch (opcion){
			case 1:
				opcion1de1();
				break;
			case 2: opcion2de1();
				break;
			case 3: salir=true;
				break;
			default 	: System.out.println("Opción errónea");
			
			}
			}
		
	}
	public static void opcion1de1() throws IOException{
		System.out.println("Nombre de nuevo usuario");
		String nombre = lector(); 
		System.out.println("Fecha de nacimiento");
		int año = Integer.parseInt(lector());
		System.out.println("Plataforma favorita (PC, PlayStation, Xbox, Nintendo):");
		String plataformaFav= lector();
		while(!plataformaFav.equalsIgnoreCase("PC")&& !plataformaFav.equalsIgnoreCase("PlayStation")&& !plataformaFav.equalsIgnoreCase("Xbox")&&!plataformaFav.equalsIgnoreCase("Nintendo"))
		{
			System.out.println("Plataforma Incorrecta");
			plataformaFav= lector();
			if(plataformaFav.equalsIgnoreCase("PC")|| plataformaFav.equalsIgnoreCase("PlayStation")|| plataformaFav.equalsIgnoreCase("Xbox")||plataformaFav.equalsIgnoreCase("Nintendo")) {
				System.out.println("Plataforma correcta");
				
			}
			
			
		}
		System.out.println("¿Tiene suscripción premium? (S/N): ");
		String Suscripcion = lector();
		System.out.println("ID USUARIO" + ": "+ nombre.substring(0,3)+ " GAME" + año);
		System.out.println("EDAD:"+ (2025-año));
		System.out.println("Plataforma favorita: " + plataformaFav);
		if(Suscripcion.equalsIgnoreCase("S")) {
		System.out.println("Premium: Si");}
		else {System.out.println("Premium: No");}
		
	}
	public static void opcion2de1() throws NumberFormatException, IOException {
		System.out.println("Introduce el año de nacimiento : ");
		int añoNac= Integer.parseInt(lector());
		while(añoNac<1920 || añoNac>2025){
			System.out.println("Año no válido");
		añoNac = Integer.parseInt(lector());
		if(añoNac>=1920 || añoNac<2025) {
			System.out.println("Edad: " + (2025-añoNac));
		}}
		int edad= 2025-añoNac;
		if(edad>=18) {
			System.out.println("Puede jugar : PEGI 18");
		}
		else if (edad>16) {
			System.out.println("Puede jugar : PEGI 16");
		}
		else if(edad>12) {
			System.out.println("Puede jugar : PEGI 12");
		}
		else if(edad>7) {
			System.out.println("Puede jugar : PEGI 7");
		}
		else if(edad>3) {
			System.out.println("Puede jugar : PEGI 3");
		}
		
		
		
	}
public static void caso2() throws NumberFormatException, IOException {
	boolean salir = false;
	
	while(!salir){
		System.out.println("--- CATÁLOGO DE JUEGOS --");
		System.out.println("1. Añadir juegos a la biblioteca");
		System.out.println("2. Calcular espacio total ocupado");
		System.out.println("3. Volver al menú principal");
		System.out.println("Elige una opción");
		int opcion = Integer.parseInt(lector());
		switch(opcion) {
		case 1: opcion1de2();
			
			break;
		
		case 2: opcion2de2();
			
			break;
		case 3: salir = true;
			break;
		default : System.out.println("Opción errónea");
		}
	}
}
public static void opcion1de2() throws IOException{
	int totalGastado =0;
	int precio = 0;
	int total=0;

	System.out.println("1.Añadir juegos a la biblioteca");
	System.out.println("¿Cuántos juegos quieres añadir a la biblioteca?");
	int numJuegos = Integer.parseInt(lector());
	for(int juegos=0 ; juegos<numJuegos ; juegos++) {
		System.out.println("Introduce el nombre del juego " + (juegos+1));
		String nombreJuego= lector();
		System.out.println("Tamaño en GB: " + nombreJuego);
		int tamañoGb = Integer.parseInt(lector());
		System.out.println("Precio de " + nombreJuego);
		precio = Integer.parseInt(lector());
		totalGastado+=precio;
		total=totalGastado;
		total++;
	}
	
	System.out.println("Total de juegos: "+ numJuegos);
	System.out.println("Total gastado: " + totalGastado);
	
	
	
}
public static void opcion2de2() throws NumberFormatException, IOException {
	int totalOcup=0;
	int espacioTotal =0;
	System.out.println("Memoria disponible en GB");
	int memoriaDisp= Integer.parseInt(lector());
	System.out.println("¿Cuantos juegos vas a instalar?");
	int nJuegos= Integer.parseInt(lector());
	
	for(int juegos=0 ; juegos<nJuegos && espacioTotal<=memoriaDisp ; juegos++) {
		System.out.println("Tamaño juego de : " + (juegos+1));
		int tamañoJuego= Integer.parseInt(lector());
		espacioTotal+= tamañoJuego;
		
		if(tamañoJuego>memoriaDisp) {System.out.println("¡Memoria superada! No puedes instalar más juegos.");}
	}
	
	System.out.println("Espacio total ocupado " + (espacioTotal) );
	
	
}
public static void caso3() throws IOException {
	double notaTotal=0;
	double nota =0;
	
	System.out.println("Sistema de valoraciones");
	System.out.println("Introduce el nombre del juego a valorar");
	String nombreJuego = lector();
	System.out.println("¿Cuantos usuarios va a volarlo?");
	double numUsuarios= Double.parseDouble(lector());
	for(int valoraJuego=0 ; valoraJuego<numUsuarios && nota>=0 && nota<=10; valoraJuego++) {
		System.out.println("Introduce valoracion de usuario " + (valoraJuego+1)+ "(0-10)");
		 nota = Double.parseDouble(lector());
		if(nota<0 || nota>10) {
			System.out.println("Nota invalida");
		}
		notaTotal+= nota;	
	}
	double notaMedia = notaTotal/numUsuarios;
	System.out.println("Nota media " + (notaMedia));
	if(notaMedia>0 && notaMedia<=4.9) {
		System.out.println("Resumen: Decepcionante");
	}
	else if(notaMedia>5 && notaMedia<=6.9) {
		System.out.println("Resumen: Aceptable");
	}
	else if(notaMedia>7&& notaMedia<=8.4) {
		System.out.println("Resumen: Bueno");
	}
	else if(notaMedia>8.5 && notaMedia<=9.4) {
		System.out.println("Resumen: Excelente");
	}
	else if(notaMedia>9.5 && notaMedia<=10) {
		System.out.println("Resumen: Obra Maestra");
	}
	
}
public static void caso4() throws NumberFormatException, IOException {
	
	boolean salir = false;
	while(!salir) {
		System.out.println("==ESTADÍSTICAS Y REPORTES==");
		System.out.println("1. Contador de juegos completados");
		System.out.println("2. Calcular horas totales de juego");
		System.out.println("3.Volver al menú principal");
		int opcion = Integer.parseInt(lector());
		switch (opcion){
		case 1:
			opcion1de4();
			break;
		case 2: opcion2de4();
			break;
		case 3: salir=true;
			break;
		default 	: System.out.println("Opción errónea");
		
		}
		}
	
}
public static void opcion1de4() throws NumberFormatException, IOException {
	System.out.println("Numeros de juegos completados este año");
	int numeroJuego = Integer.parseInt(lector());
	while(numeroJuego>=500) {
		System.out.println("Numero Juego es muy grande");
		numeroJuego = Integer.parseInt(lector());
	}
	
	cuentaAtras(numeroJuego);
}
public static void cuentaAtras(int numeroJuego) {
	if (numeroJuego==0) {
		System.out.println("Has completado el numero de juego: " + numeroJuego);
	}
	else {
		System.out.println("Has completado el numero de juego: " + numeroJuego);
		cuentaAtras(numeroJuego-1);
	}
	
}
public static void opcion2de4() throws IOException {
	int horas=0;
	int minutos = 0;
	System.out.println("¿Quieres introducir solo horas (H) o horas y minutos (HM)?:");
	String respuesta = lector();
	if(respuesta.equalsIgnoreCase("H")) {
		calcularHorasTotales(horas);
	}
	else if (respuesta.equalsIgnoreCase("HM")) {
		calcularHorasTotales( horas, minutos);
		
	}
	
}
public static void calcularHorasTotales(int horas) throws NumberFormatException, IOException {
	System.out.println("Introduce las horas");
	 horas = Integer.parseInt(lector());
	System.out.println("Horas totales jugadas: " + horas );
	
}
public static void calcularHorasTotales(int horas, int minutos) throws NumberFormatException, IOException {
	System.out.println("Introduce las horas jugadas");
	horas = Integer.parseInt(lector());
	System.out.println("Introduce los minutos");
	 minutos = Integer.parseInt(lector());
	double minutosHora= minutos/60;
	double totalMinutos= minutos%60;
	System.out.println("Horas jugadas" + (horas + minutosHora) +"h" + totalMinutos + "min");
}
public static void caso5() throws NumberFormatException, IOException {
	System.out.println("==Calculadora de Descuentos==");
	System.out.println("Introduce el precio del juego");
	double precioJuego= Integer.parseInt(lector());
	System.out.println("Introduce el procentaje de descuento (0-100)");
	double porcentajeDesc = Integer.parseInt(lector());
		descuentoFinal(porcentajeDesc, precioJuego);
	

}
public static void descuentoFinal(double precioJuego , double porcentajeDesc) {
	double totalDesc = porcentajeDesc/100.0;
	double totalPrecio= precioJuego*totalDesc;
		if(totalPrecio>15) {
			descuentoFinal(totalPrecio, 5 );
		}
		else {
			System.out.println("Descuento final: " + totalPrecio );
		}
		System.out.println("Ahorro total " + totalPrecio);
}

}

