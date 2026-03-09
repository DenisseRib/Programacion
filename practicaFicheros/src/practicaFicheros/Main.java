package practicaFicheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

		boolean salir = false;
		do {
			System.out.println("\n=== CENTRO JUVENIL ===");
			System.out.println("1. Añadir Actividad");
			System.out.println("2. Buscar Actividad");
			System.out.println("3. Realizar inscripcion");
			System.out.println("4.Exportar participante por una actividad");
			System.out.println("5. Salir");
			System.out.print("Introduce una opción: ");

			int opcion = -1;
			boolean datosOK = false;
			while (!datosOK) {
				try {
					opcion = Integer.parseInt(leer.readLine());
					datosOK = true;
				} catch (IOException e) {
					System.err.println("Solo puedes introducir números");
				}
			}

			switch (opcion) {
			case 1:
				System.out.println("=== AÑADIR ACTIVIDAD ===");
				añadirActividad();
				break;
			case 2:
				System.out.println("=== BUSCAR ACTIVIDAD ===");
				buscarActividad();
				break;
			case 3:
				System.out.println("===REALIZAR INSCRIPCION  ===");
				break;
			case 4:
				System.out.println("===EXPORTAR PARTICIPANTE  ===");
				break;
			case 5:
				System.out.println("Salir");
				salir = true;
				break;
			default:
				System.out.println("Opción no válida");
			}

		} while (!salir);

	}

	private static void añadirActividad() {
		
		// TODO Auto-generated method stub
		
	}

	private static void buscarActividad() throws NumberFormatException, IOException {
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
	File archivoInscripcion = new File("actividades.txt");

	if (archivoInscripcion.exists()) {

		// Pedimos datos de venta
		Inscripcion inscripciones = new	Inscripcion();
		inscripciones.pedirInscripcion();

		// Abrimos el archivo temporal para escritura
		File archivoTemporal = new File("actividades_tmp.txt");
		FileWriter fw = new FileWriter(archivoTemporal, false);
		PrintWriter pw = new PrintWriter(fw);

		// Abrimos fichero original de lectura
		FileReader fr = new FileReader(archivoInscripcion);
		BufferedReader br = new BufferedReader(fr);

		boolean actividadEnc = false;
		String lineaAct = br.readLine();
		int idBuscar;

		// Leemos el archivo linea a linea
		while (lineaAct != null) {
			Actividad actividades= new Actividad();
			actividades.leerActividad(lineaAct);
			// Leemos la linea, que corresponde a la pelicula
			do{System.out.println("Introduce el id a buscar");
			idBuscar = Integer.parseInt(leer.readLine());
			}
			while(actividades.getIdActividad() != idBuscar);
			
			; //Este metodo dividira cada linea en su dato, y rellenara el
													// objeto peliculas

			if (actividades.getIdActividad() == idBuscar) {
				actividadEnc = true;
				// Comprobamos si hay entradas
				
			}
			else {
				System.out.println("No se ha encontrado la actividad");
			}
			double precioTotal = actividades.getNumPlazas()*actividades.getPrecioActividad();
			// Escribimos en el fichero temporal.
			// Si no es la pelicula a realizar la venta se escribira igual
			// Sino modificado
			pw.println(actividades.getIdActividad() + "," + actividades.getNombreActividad() + "," + actividades.getNumPlazas() + ","
					+ precioTotal);

			lineaAct= br.readLine();
		}
		br.close();
		fr.close();
		pw.flush();
		pw.close();
		fw.close();
		
		// TODO Auto-generated method stub

	}

}}
