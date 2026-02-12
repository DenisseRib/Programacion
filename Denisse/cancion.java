import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class cancion extends contenido{
	private String Artista ;
	private  int numeroStreams;
	private int añoLanzamiento;
	public String getArtista() {
		return Artista;
	}
	public void setArtista(String artista) {
		Artista = artista;
	}
	public int getNumeroStreams() {
		return numeroStreams;
	}
	public void setNumeroStreams(int numeroStreams) {
		this.numeroStreams = numeroStreams;
	}
	public int getAñoLanzamiento() {
		return añoLanzamiento;
	}
	public void setAñoLanzamiento(int añoLanzamiento) {
		this.añoLanzamiento = añoLanzamiento;
	}
	public void pedirDatos(int id) {
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		super.pedirDatos(id);
		boolean datosOk = false;

		do {

			try {
				System.out.print("Introduce el nombre del artista "  + ":");
				this.Artista = leer.readLine();

				System.out.print("Introduce el numero de streams  : ");
				this.numeroStreams = Integer.parseInt(leer.readLine());

				do{System.out.print("Introduce el año de lanzamiento: ");
				this.añoLanzamiento = Integer.parseInt(leer.readLine());
				if(añoLanzamiento <1950 || añoLanzamiento >2025){
					System.out.println("Introduce un año válido");
				}
				}while( añoLanzamiento <1950 || añoLanzamiento >2025);
				datosOk = true;
			} catch (NumberFormatException | IOException e) {
				System.err.println("Ha habido un error con los datos" + e.getStackTrace());
			}
		} while (!datosOk);}}

