package practicaFicheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Actividad {

	private int idActividad;
	private String nombreActividad;
	private String nombreSeccion;
	private int numPlazas;
	private Double precioActividad;
	
	
	public void escribirActividad() throws IOException {
		File archivoActividades = new File("actividades.txt");
		FileWriter fw = new FileWriter(archivoActividades, true);
		PrintWriter pw = new PrintWriter(fw);

		pw.println(this.idActividad + "," + this.nombreSeccion + "," + this.precioActividad);

		pw.flush();
		pw.close();
		
	}

	public void leerActividad(String linea) throws IOException {
	
		String[] datos = linea.split(",");

		this.idActividad = Integer.parseInt(datos[0]);
		this.nombreSeccion =  datos[1];
		this.numPlazas = Integer.parseInt(datos[2]);
		this.precioActividad = Double.parseDouble(datos[3]);
	
	}
	public void pedirActividad() throws IOException{
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduce el id de la pelicula: ");
	idActividad = Integer.parseInt(leer.readLine());
	
	do{
		System.out.println("Introduce el nombre de la seccion: ");
nombreSeccion =leer.readLine();

if(!nombreSeccion.equalsIgnoreCase("chiqui")&& !nombreSeccion.equalsIgnoreCase("preas") && !nombreSeccion.equalsIgnoreCase("centro")) {
	System.out.println("Introduce una seccion correcta");
}
}while(!nombreSeccion.equalsIgnoreCase("chiqui")&& !nombreSeccion.equalsIgnoreCase("preas") && !nombreSeccion.equalsIgnoreCase("centro"));

System.out.println("Introduce el numero de plazas disponibles");
numPlazas= Integer.parseInt(leer.readLine());
System.out.println("Introduce el precio de la actividad");
precioActividad = Double.parseDouble(leer.readLine());
				
	}

	
	public int getIdActividad() {
		return idActividad;
	}
	public void setIdActividad(int idActividad) {
		this.idActividad = idActividad;
	}
	public String getNombreActividad() {
		return nombreActividad;
	}
	public void setNombreActividad(String nombreActividad) {
		this.nombreActividad = nombreActividad;
	}
	public String getNombreSeccion() {
		return nombreSeccion;
	}
	public void setNombreSeccion(String nombreSeccion) {
		this.nombreSeccion = nombreSeccion;
	}
	public int getNumPlazas() {
		return numPlazas;
	}
	public void setNumPlazas(int numPlazas) {
		this.numPlazas = numPlazas;
	}
	public Double getPrecioActividad() {
		return precioActividad;
	}
	public void setPrecioActividad(Double precioActividad) {
		this.precioActividad = precioActividad;
	}

	
	
	
	
}
