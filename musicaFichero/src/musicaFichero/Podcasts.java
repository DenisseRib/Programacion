package musicaFichero;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Podcasts extends Contenido{
	
private int numEpisodios;

public int getNumEpisodios() {
	return numEpisodios;
}
public void pedirDatos() throws NumberFormatException, IOException {
	BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

	super.pedirDatos();
	System.out.println("Numero de episodios");
	this.numEpisodios = Integer.parseInt(leer.readLine());

}
public void leerPodcasts(String []datos) {
	super.leerContenido(datos);
	this.numEpisodios = Integer.parseInt(datos[4]);
	
}
public void escribirPodcasts() throws IOException {
	 try (PrintWriter pw = new PrintWriter(new FileWriter("catalogo.txt", true))) {
         pw.println("PODCAST;" + this.numEpisodios + ";" + titulo + ";" + artista + ";" + genero);
     }
}
public void setNumEpisodios(int numEpisodios) {
	this.numEpisodios = numEpisodios;
}



}
