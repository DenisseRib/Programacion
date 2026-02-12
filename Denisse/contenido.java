import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class contenido {
private int id;
private String Título;
private  int duracionMinutos ;
private String Categoría ;
private int  reproduccionesTotales ;
private boolean playlist;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTítulo() {
	return Título;
}
public void setTítulo(String título) {
	Título = título;
}
public int getDuracionMinutos() {
	return duracionMinutos;
}
public void setDuracionMinutos(int duracionMinutos) {
	this.duracionMinutos = duracionMinutos;
}
public String getCategoría() {
	return Categoría;
}
public void setCategoría(String categoría) {
	Categoría = categoría;
}
public int getReproduccionesTotales() {
	return reproduccionesTotales;
}
public void setReproduccionesTotales(int reproduccionesTotales) {
	this.reproduccionesTotales = reproduccionesTotales;
}
public boolean isPlaylist() {
	return playlist;
}
public void setPlaylist(boolean playlist) {
	this.playlist = playlist;
}	
public void pedirDatos(int id) {
	BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
	this.id = id;
	boolean datosOk = false;

	do {

		try {
			System.out.print("Introduceel titulo del contenido " + this.id + ":");
			this.Título = leer.readLine();

			System.out.print("Introduce la duración en minutos (1-180) : ");
			this.duracionMinutos = Integer.parseInt(leer.readLine());

			do{System.out.print("Introduce la categoria  (música-podcast-audiolibro-meditación) ");
			this.Categoría =leer.readLine();
			if(!this.Categoría.equalsIgnoreCase("música") ||!this.Categoría.equalsIgnoreCase("podcast")|| !this.Categoría.equalsIgnoreCase("audiolibro")|| !this.Categoría.equalsIgnoreCase("meditación") );{
				System.out.println("Introduce una categoria válida");
			}
			}while( !this.Categoría.equalsIgnoreCase("música") ||!this.Categoría.equalsIgnoreCase("podcast")|| !this.Categoría.equalsIgnoreCase("audiolibro")|| !this.Categoría.equalsIgnoreCase("meditación") );

			System.out.println("Introduce el número de reproducciones totales");
			this.reproduccionesTotales= Integer.parseInt(leer.readLine());
			
			datosOk = true;
		} catch (NumberFormatException | IOException e) {
			System.err.println("Ha habido un error con los datos" + e.getStackTrace());
		}
	} while (!datosOk);

}	


}
