import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class podcast extends contenido {
private String  Presentador;
private int  numEpisodio;
private boolean transcripcion;
public String getPresentador() {
	return Presentador;
}
public void setPresentador(String presentador) {
	Presentador = presentador;
}
public int getNumEpisodio() {
	return numEpisodio;
}
public void setNumEpisodio(int numEpisodio) {
	this.numEpisodio = numEpisodio;
}
public boolean isTranscripcion() {
	return transcripcion;
}
public void setTranscripcion(boolean transcripcion) {
	this.transcripcion = transcripcion;
}
public void pedirDatos(int id) {
	BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
	super.pedirDatos(id);
	String respTranscripcion ;
	boolean datosOk = false;

	do {

		try {
			System.out.print("Introduce el nombre del presentador "  + ":");
			this.Presentador = leer.readLine();

			System.out.print("Introduce el numero de episodio  : ");
			this.numEpisodio = Integer.parseInt(leer.readLine());
			do{System.out.println("¿Tiene transcripción disponible? (S/N):");
			 respTranscripcion = leer.readLine();
			if(respTranscripcion.equalsIgnoreCase("S") || respTranscripcion.equalsIgnoreCase("N")) {
				System.out.println("Introduce una respuesta correcta");
			}
			}while(respTranscripcion.equalsIgnoreCase("S") || respTranscripcion.equalsIgnoreCase("N") );
			datosOk = true;
		} catch (NumberFormatException | IOException e) {
			System.err.println("Ha habido un error con los datos" + e.getStackTrace());
		}
	} while (!datosOk);}}

