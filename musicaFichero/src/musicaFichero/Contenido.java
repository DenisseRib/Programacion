package musicaFichero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Contenido {
protected String titulo;
protected String artista;
protected String genero;
protected int duracion;
public void leerContenido( String [] datos) {
	this.titulo= datos[0];
	this.artista = datos [1];
	this.genero = datos[2];
	this.duracion= Integer.parseInt(datos[3]);
}

public void pedirDatos() throws NumberFormatException, IOException {
BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Título del Podcast: "); this.titulo = leer.readLine();
System.out.print("Artista/Autor: "); this.artista = leer.readLine();
System.out.print("Género: "); this.genero = leer.readLine();
System.out.print("Duración (min): "); this.duracion = Integer.parseInt(leer.readLine());
}


public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public String getArtista() {
	return artista;
}
public void setArtista(String artista) {
	this.artista = artista;
}
public String getGenero() {
	return genero;
}
public void setGenero(String genero) {
	this.genero = genero;
}
public int getDuracion() {
	return duracion;
}
public void setDuracion(int duracion) {
	this.duracion = duracion;
}
}
