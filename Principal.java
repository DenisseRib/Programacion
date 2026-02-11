import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<contenido> contenidos = new ArrayList<contenido>();

		boolean salir = false;
		do {
			System.out.println("\n=== HOSPITAL CALASANZ ===");
			System.out.println("1. Registrar Paciente ");
			System.out.println("2. Añadir tratamiento a paciente urgencias");
			System.out.println("3. Añadir consulta a paciente cita previa");
			System.out.println("4. Mostrar Historial de un Paciente");
			System.out.println("5. Filtrar Urgencias por Gravedad");
			System.out.println("6. salir");
			System.out.print("Introduce una opción: ");

			int opcion = -1;
			boolean datosOK = false;
			while (!datosOK) {
				try {
					opcion = Integer.parseInt(leer.readLine());
					datosOK = true;
				} catch (NumberFormatException | IOException e) {
					System.err.println("Solo puedes introducir números");
				}
			}

			switch (opcion) {
			case 1:
				System.out.println("===  Añadir contenido ===");
				registrarContenido(contenidos);
				break;
			case 2:
				System.out.println("=== Añadir contenido de cancion ===");
				añadirTratamiento(contenidos);
				break;
			case 3:
				System.out.println("=== Añadir consulta a paciente cita previa ===");
				añadirFechaConsulta(pacientes);
				break;
			case 4:
				System.out.println("=== Mostrar Historial de un Paciente ===");
				mostrarHistorial(pacientes);
				break;
			case 5:
				System.out.println("===  Filtrar Urgencias por Gravedad ===");
				filtarGravedad(pacientes);
				break;
			case 6:
				System.out.println("=== Mostrar los datos ===");
				break;
			default:
				System.out.println("Opción no válida");
			}

		} while (!salir);

	}
		// TODO Auto-generated method stub

	private static void registrarContenido(ArrayList<contenido> contenidos) throws IOException {
		
	
			BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
			String tipoContenido = "";
			do {
				try {
					System.out.print("Introduce el tipo de contenido");
					tipoContenido = leer.readLine();

					if (!tipoContenido.equalsIgnoreCase("podcast") && !tipoContenido.equalsIgnoreCase("cancion")) {
						System.out.println("El tipo de paciente no es correcto");
					}

				} catch (IOException e) {
					e.printStackTrace();
				}
			} while (!tipoContenido.equalsIgnoreCase("podcast") && !tipoContenido.equalsIgnoreCase("cancion"));

			int id = 1;
			if (contenidos.size() > 0)
				id = contenidos.getLast().getId() + 1;
			if (tipoContenido.equalsIgnoreCase("podcast")) {
				podcast Podcast = new podcast();
				Podcast.pedirDatos(id);
				contenidos.add(Podcast);
			} else {
				cancion Cancion = new cancion();
				Cancion.pedirDatos(id);
				contenidos.add(Cancion);
			}

		}
		// TODO Auto-generated method stub
		
	

	}


