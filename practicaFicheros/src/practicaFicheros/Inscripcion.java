package practicaFicheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Inscripcion {
	private String nombreParticipante;
	private int edad;
	private long telefono;
	private int idActividad;
	
	public void escribirInscripcion() throws IOException {
		File archivoInscripcion = new File("inscripciones.txt");
		FileWriter fw = new FileWriter(archivoInscripcion, true);
		PrintWriter pw = new PrintWriter(fw);

		pw.println(this.idActividad + "," + this.edad+ "," + this.telefono + "," + this.nombreParticipante +".");

		pw.flush();
		pw.close();
		
	}
	public String getNombreParticipante() {
		return nombreParticipante;
	}
	public void setNombreParticipante(String nombreParticipante) {
		this.nombreParticipante = nombreParticipante;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public long getTelefono() {
		return telefono;
	}
	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
	public int getIdActividad() {
		return idActividad;
	}
	public void setIdActividad(int idActividad) {
		this.idActividad = idActividad;
	}
	
	public void pedirInscripcion() throws IOException{
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduce el id de la actividad: ");
	idActividad = Integer.parseInt(leer.readLine());
	
		System.out.println("Introduce el nombre del praticipante: ");
		nombreParticipante =leer.readLine();

   System.out.println("Introduce la edad del participante");
   edad= Integer.parseInt(leer.readLine());
   System.out.println("Introduce el el telefono");
   telefono = Long.parseLong(leer.readLine());

				
	}

	
}
