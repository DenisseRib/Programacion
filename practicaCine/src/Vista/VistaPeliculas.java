package Vista;
	import java.util.ArrayList;
	import Controlador.PeliculaContralador;
	import Modelo.PeliculasDTO;
	import Utils.Lecturas;
public class VistaPeliculas{
  public void menuPeliculas() {
	        boolean salir = false;

	        do {
	            System.out.println("\n=== PELÍCULAS =>>");
	            System.out.println("1. Listar películas");
	            System.out.println("2. Añadir película");
	            System.out.println("3. Editar película");
	            System.out.println("4. Borrar película");
	            System.out.println("9. Salir al menú principal");
	            int opcion = Lecturas.leerEnteroEnRango("Introduce una opción: ", 1, 9);

	            switch (opcion) {
	                case 1:
	                    System.out.println("= LISTAR PELÍCULAS =");
	                    listarPeliculas();
	                    break;
	                case 2:
	                    System.out.println("= AÑADIR PELÍCULA =");
	                    añadirPelicula();
	                    break;
	                case 3:
	                    System.out.println("= EDITAR PELÍCULA =");
	                    editarPelicula();
	                    break;
	                case 4:
	                    System.out.println("= BORRAR PELÍCULA =");
	                    borrarPelicula();
	                    break;
	                case 9:
	                    salir = true;
	                    break;
	            }

	        } while (!salir);
	    }


	    public void listarPeliculas() {
	        PeliculaContralador controlador = new PeliculaContralador();
	        ArrayList<PeliculasDTO> lista = controlador.listarPeliculas();

	        if (lista == null || lista.isEmpty()) {
	            System.out.println("No hay películas registradas.");
	            return;
	        }

	        for (PeliculasDTO pelicula : lista) {
	            System.out.println(pelicula.getId() + " - " + pelicula.getTitulo() + " - "
	                    + pelicula.getGenero() + " - " + pelicula.getDuracion() + " min - "
	                    + pelicula.getAño());
	        }
	    }


	    public void añadirPelicula() {
	        String titulo = Lecturas.leerString("Título: ");
	        String genero = Lecturas.leerString("Género: ");
	        int duracion = Lecturas.leerEnteroMayorQue("Duración (minutos): ", 0);
	        int año = Lecturas.leerEnteroMayorQue("Año: ", 0);

	        PeliculaContralador controlador = new PeliculaContralador();
	        boolean todoOk = controlador.añadirPelicula(titulo, genero, duracion, año);
	        if (todoOk)
	            System.out.println("Película añadida correctamente.");
	        else
	            System.out.println("No se ha podido añadir la película.");
	    }


	    public void editarPelicula() {
	        int id = Lecturas.leerEntero("Introduce el id de la película a editar: ");

	        PeliculaContralador controlador = new PeliculaContralador();
	        PeliculasDTO peliculaActual = controlador.buscarPeliculaPorId(id);
	        if (peliculaActual == null) {
	            System.out.println("No existe ninguna película con ese id.");
	            return;
	            
	            
	        }

	        System.out.println("Datos actuales: " + peliculaActual.getTitulo() + " - "
	                + peliculaActual.getGenero() + " - " + peliculaActual.getDuracion()
	                + " min - " + peliculaActual.getAño());

	        String titulo = Lecturas.leerString("Nuevo título: ");
	        String genero = Lecturas.leerString("Nuevo género: ");
	        int duracion = Lecturas.leerEnteroMayorQue("Nueva duración (minutos): ", 0);
	        int año = Lecturas.leerEnteroMayorQue("Nuevo año: ", 0);

	        boolean todoOk = controlador.editarPelicula(id, titulo, genero, duracion, año);
	        if (todoOk)
	            System.out.println("Película editada correctamente.");
	        else
	            System.out.println("No se ha podido editar la película.");
	    }


	    public void borrarPelicula() {
	        int id = Lecturas.leerEntero("Introduce el id de la película a borrar: ");

	        PeliculaContralador controlador = new PeliculaContralador();
	        boolean todoOk = controlador.borrarPelicula(id);
	        if (todoOk)
	            System.out.println("Película borrada correctamente.");
	        else
	            System.out.println("No existe ninguna película con ese id.");
	    }

}
