package ExamenTema3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class arrayList {
	

	public static void main(String[] args) throws NumberFormatException, IOException {
			boolean salir = false;
			ArrayList<Double> calificaciones = new ArrayList<>();

			do {
				System.out.println("\n--- GESTION DE MUSICA ---");
				System.out.println("1. Añadir canción al final");
				System.out.println("2. Añadir canción al inicio de la playlist");
				System.out.println("3. Mostrar todas las canciones (numeradas desde 1)");
				System.out.println("4. Eliminar canción por posición");
				System.out.println("5. Buscar canción por nombre");
				System.out.println("6. Mover una canción a otra posición");
				System.out.println("7. Mostrar la primera y última canción de la playlist ");
				System.out.println("8. Mostrar total de canciones");
				System.out.println("9. Shuffle");
				System.out.println("10.Eliminar canciones duplicadas");
				System.out.println("11. Salir");
				int opcion = leerInt("Introduce la opcion: ");

				switch (opcion) {
				case 1:
					opcion1(calificaciones);
					break;
				case 2:
					opcion2(calificaciones);
					break;
				case 3:
					opcion3(calificaciones);
					break;
				case 4:
					opcion4(calificaciones);
					break;
				case 5:
					opcion5(calificaciones);
					break;
				case 6:
					opcion6(playlist);
					break;
				case 7:
					opcion7(playlist);
					break;
				case 8:
					opcion8(playlist);
					break;
				case 9:
					opcion9(playlist);
					break;
				case 10:
					opcion10(playlist);
					break;
				case 11:
					System.out.println("Saliendo del programa");
					salir = true;
					break;
				default:
					System.out.println("Opcion no valida");

				}
			} while (!salir);

		}

		// OPCION 1
		public static void opcion1(ArrayList<Double> calificaciones) throws NumberFormatException, IOException {
			System.out.println("--  Añadir calificacion -- ");
		  double calificacion = leerDouble("Introduce calificion: ");
			calificaciones.add(calificacion);
			while(calificacion >0 && calificacion <=10) {
				calificacion = leerDouble("Introduce calificaciones");
			}
			

		}

		// OPCION 2
		
		

		// OPCION 3
		public static void opcion3(ArrayList<Double> calificaciones) {
			System.out.println("--  Mostrar todas las calificaciones -- ");

			for (int i = 0; i < calificaciones.size(); i++) {
				System.out.println("Calificacion " + (i + 1) + " : " + calificaciones.get(i));
			}

		}

		// OPCION 2
		public static void opcion2(ArrayList<Double> calificaciones) throws IOException {
			System.out.println("--  Eliminar calificacion por posicion -- ");

			int pos = -1;
			do {

				pos = leerInt("Introduce una posicion:  ");

			} while (pos < 0 || pos > calificaciones.size());

			calificaciones.remove(pos);

		}

		// OPCION 4
		public static void opcion4(ArrayList<Double> calificaciones) throws IOException {
			double media =0;
			double suma =0;
			for(int i = 0 ; i <calificaciones.size() ; i++) {
				suma = calificaciones.get(i);
				media = calificaciones.get(i)/calificaciones.size();
			}
			System.out.println("La media es " + media);
			
			
		}
		
		public static void opcion5(ArrayList<Double> calificaciones) throws IOException {
			int contador =0 ; 
			
			for(int i = 0 ; i <calificaciones.size() ; i++) {
				if( calificaciones.get(i) >=5 ) {
					contador++;}
					System.out.println("Han aprobado" + contador);}
			
		}
		

		



		// UTILS
		public static String leerString(String mensaje) throws NumberFormatException, IOException {
			BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
			System.out.print(mensaje);
			return leer.readLine();
		}

		public static int leerInt(String mensaje) throws NumberFormatException, IOException {
			BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
			System.out.print(mensaje);
			int num = -1;
			boolean valido = false;
			do {
				try {
					num = Integer.parseInt(leer.readLine());
					valido = true;
				} catch (NumberFormatException e) {
					System.out.println("Tienes que introducir un numero");
				}
			} while (!valido);
			return num;
		}

		public static double leerDouble(String mensaje) throws NumberFormatException, IOException {
			BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
			System.out.print(mensaje);
			double num = -1;
			boolean valido = false;
			do {
				try {
					num = Integer.parseInt(leer.readLine());
					valido = true;
				} catch (NumberFormatException e) {
					System.out.println("Tienes que introducir un numero");
				}
			} while (!valido);
			return num;
		}
		// TODO Auto-generated method stub

	}


