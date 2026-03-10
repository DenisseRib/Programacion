package musicaFichero;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Canciones extends Contenido{
private String album;

public String getAlbum() {
	return album;
}
public void pedirDatos() throws NumberFormatException, IOException {
	BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

	super.pedirDatos();
	System.out.println("Nombre del Álbum");
	this.album = leer.readLine();
	
}
public void leerCancion (String []datos) {
	super.leerContenido(datos);
	this.album = datos[4];
}
public void escribir() throws IOException {
    try (PrintWriter pw = new PrintWriter(new FileWriter("catalogo.txt", true))) {

        pw.println("CANCIONES;" + titulo + ";" + artista + ";" + genero + ";" + duracion + ";" + album );
    }
}
public void setAlbum(String album) {
	this.album = album;
}

}
