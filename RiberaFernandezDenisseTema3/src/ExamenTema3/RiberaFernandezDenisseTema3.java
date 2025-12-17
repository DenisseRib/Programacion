package ExamenTema3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RiberaFernandezDenisseTema3 {

	public static void main(String[] args) throws IOException {
		String[] parejas = new String [6];
		String[] tentadores = new String [6];
		int [][] tentacion = new int [6][6];
		boolean salir = false ; 

			do {
				System.out.println("ISLA DE JAVA");
				System.out.println("Opción 1: Llegada a la villa");
				System.out.println("Opción 2: Registrar una tentación!!");
				System.out.println("Opción 3: Mostrar tabla tentacion");
				System.out.println("Opción 4: la luz de la tentación.");
				int opcion = leerInt("Introduce una opcion: ");
				
				switch(opcion) {
				case 1:
					opcion1(tentadores, parejas);
					break;
				case 2:
					opcion2(tentadores, parejas, tentacion);
					break;
				case 3:
					opcion3(tentadores, parejas, tentacion);
					break;
				case 4:
					opcion4(tentadores, parejas, tentacion);
					break;
				case 5 : System.out.println("Montoya, porfavor");
				salir=true;
				default:
					System.out.println("Opcion no valida");
				}
				
			}while(!salir);

		
			
			
			
		}
		

	public static void opcion1(String[] tentadores, String[] parejas) throws IOException {
		int nombrePareja = 0;
		int nombreTentador =0;
		System.out.println("==LLEGADA A LA VILLA");
		for (int i = 0 ; i <parejas.length ; i++) {
			do {
				 parejas[i] = leerString("Introduce el nombre de la pareja a tentar " +(i+1) + ": ");
				 nombrePareja = i;
				 if(parejas[i].isEmpty())
				System.out.println("El nombre no puede quedar vacio");
			}while(parejas[i].isEmpty());
			
		}
		for (int i = 0 ; i <tentadores.length ; i++) {
			do {
				 tentadores[i] = leerString("Introduce el nombre del tentador " +(i+1) + ": ");
				 nombreTentador = i;
				 if(tentadores[i].isEmpty())
				System.out.println("El nombre no puede quedar vacio");
			}while(tentadores[i].isEmpty());
			
		}
		
		if(nombrePareja!= -1 && nombreTentador!=-1) {
			System.out.println("Todos los participantes se han registrado correctamente!");
		}
	
	}
public static void opcion2(String [] tentadores, String[] parejas , int[][] tentacion) throws IOException {
	System.out.println("HAY IMÁGENES!!");
	for (int i = 0 ; i<parejas.length ; i++) {
		System.out.println("PARTICIPANES" + i + " " + parejas[i]  );
		for (int c =0 ; c<tentadores.length ; c++) {
			System.out.println("TENTADORES: "+ c + " "+ tentadores[c]  );
		}
	}
	int indiceParticipante = -1;
	String nombreParticipante = leerString("Introduce el nombre del participante (0-5)");
	
	for(int i =0 ; i<parejas.length ; i++) {
		if(nombreParticipante.equalsIgnoreCase(parejas[i])) 
		indiceParticipante = i;}
	
		if(indiceParticipante>0 && indiceParticipante >=10) 
			System.out.println("No se ha encontrado el participante en el índice");
		
		
		int indiceTentador = -1;
		String nombreTentador= leerString("Introduce el nombre del tentador (0-5)");
		for(int i =0 ; i<tentadores.length ; i++) {
			if(nombreTentador.equalsIgnoreCase(tentadores[i])) 
			indiceTentador = i;}
			if(indiceTentador ==-1)
				System.out.println("No se ha encontrado el tentador en el índice");
			
			
			
			if(indiceParticipante != -1 && indiceTentador != -1) {
				tentacion[indiceParticipante][indiceTentador] = leerInt("Introduce el porcentaje de tentacion de " + parejas[indiceParticipante] + " con "+ tentadores[indiceTentador]);
				System.out.println("Tentacion registrada correctamente " + parejas[indiceParticipante] + " y " + tentadores[indiceTentador] + "tienen " + tentacion[indiceParticipante][indiceTentador]);
				
			}else {
				System.out.println("No se ha podido registrar la tentación porque no se ha encontrado las indicaciones ");
			}
	}
	
	public static void opcion3(String [] tentadores, String[] parejas , int[][] tentacion) {
		System.out.println("-- MOSTRAR TABLA -- ");
		
		System.out.print("\t\t");
		for(int i=0; i<tentadores.length; i++) {
			System.out.print(tentadores[i] + "\t\t");
		}
		System.out.println("");
		
		for(int f=0; f<tentacion.length; f++) {
			System.out.print(parejas[f] + "\t\t");
			for(int c=0; c<tentacion[f].length; c++) {
				System.out.print(tentacion[f][c] + "\t\t" );
			}
			System.out.println();
		}
		
		int posMasInfiel = -1;
		int infielMayor = -1;
		for(int f=0; f<tentacion.length; f++) {
			int sumaTentacion = 0;
			for(int c=0; c<tentacion[f].length; c++) {
				sumaTentacion += tentacion[f][c];
				if(sumaTentacion > infielMayor) {
					posMasInfiel = f;
					infielMayor = sumaTentacion;
				}
			}
		}
		
		System.out.println("PARTICIPANTE MAS INFIEL es: " + parejas[posMasInfiel] + " con " 
		                            + infielMayor);
		
		int conexionMayor = -1;
		int posConconexion= -1;
		for(int c=0; c<tentacion[0].length; c++) {
			int sumaConexion = 0;
			for(int f=0; f<tentacion.length; f++) {
				sumaConexion += tentacion[f][c];
				if(sumaConexion > conexionMayor) {
					posConconexion = f;
					conexionMayor = sumaConexion;
				}
			}
		}
		
		System.out.println("La pareja que más conexion tiene es " + tentacion[posConconexion] + " con " 
                + conexionMayor);
		
		
	
	}

public static void opcion4(String[] tentadores, String[] parejas,int[][] tentacion ) throws IOException {
	System.out.println("==LA LUZ DE LA TENTACION");
	boolean alarma = false;
	int umbralAlarma = leerInt("Introduce el umbral de alarma (1-100)");
	System.out.println("Buscando conexiones peligrosas...");
	for (int i = 0 ; i<tentacion.length ; i++ ) {
		for (int c= 0 ; c<tentacion[i].length; c++) {
			
			if(tentacion [i][c] >= umbralAlarma) {
				System.out.println("ALARMA!! " + parejas[i]  +" y " + tentadores[c] + " tienen un nivel de tentacion de " + tentacion[i][c]);
			alarma =true;}
		}
	}
	if(alarma==false)
		System.out.println("Noche tranquila. La isla duerme. Por ahora");
}

	//Metodos leer
	public static int leerInt(String mensaje) throws IOException  {
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		boolean valido = false;
		int num = -1;
		do {
			try {
				System.out.print(mensaje);
				num = Integer.parseInt(leer.readLine());
				if(num >1 && num <=100 );
				valido = true;
			}catch(NumberFormatException e) {
				System.out.println("Introduce un numero valido entre 1 y 5");
			}
		}while(!valido);
		return num;
	}
	
	public static String leerString(String mensaje) throws IOException {
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(mensaje);
		return leer.readLine();
	}


}
