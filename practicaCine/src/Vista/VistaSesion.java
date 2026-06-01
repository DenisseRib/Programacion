package Vista;


	import java.util.ArrayList;

import Controlador.SesionControlador;
import Modelo.SesionDTO;
import Utils.Lecturas;

	public class VistaSesion {


	    public void menuSesiones() {
	        boolean salir = false;

	        do {
	            System.out.println("\n=== SESIONES =>>");
	            System.out.println("1. Listar sesiones");
	            System.out.println("2. Programar sesión");
	            System.out.println("3. Borrar sesión");
	            System.out.println("9. Salir al menú principal");
	            int opcion = Lecturas.leerEnteroEnRango("Introduce una opción: ", 1, 9);

	            switch (opcion) {
	                case 1:
	                    System.out.println("= LISTAR SESIONES =");
	                    listarSesiones();
	                    break;
	                case 2:
	                    System.out.println("= PROGRAMAR SESIÓN =");
	                    programarSesion();
	                    break;
	                case 3:
	                    System.out.println("= BORRAR SESIÓN =");
	                    borrarSesion();
	                    break;
	                case 9:
	                    salir = true;
	                    break;
	            }

	        } while (!salir);
	    }


	    public void listarSesiones() {
	        SesionControlador controlador = new SesionControlador();
	        ArrayList<SesionDTO> lista = controlador.listarSesiones();

	        if (lista == null || lista.isEmpty()) {
	            System.out.println("No hay sesiones registradas.");
	            return;
	        }

	        for (SesionDTO sesion : lista) {
	            System.out.println(sesion.getId() + " - " + sesion.getTituloPelicula() + " - Sala " +
	                    sesion.getNumeroSala() + " - " + sesion.getFecha() + " - " + sesion.getHora() +
	                    " - " + sesion.getPrecio() + "€ - " + sesion.getAsientosDisponibles() + " asientos");
	        }
	    }


	    public void programarSesion() {
	        int idPelicula = Lecturas.leerEntero("Id de la película: ");
	        int idSala = Lecturas.leerEntero("Id de la sala: ");
	        String fecha = Lecturas.leerString("Fecha (YYYY-MM-DD): ");
	        String hora = Lecturas.leerString("Hora (HH:MM:SS): ");
	        double precio = Lecturas.leerDouble("Precio: ");

	        SesionControlador controlador = new SesionControlador();
	        boolean todoOk = controlador.programarSesion(idPelicula, idSala, fecha, hora, precio);
	        if (todoOk)
	            System.out.println("Sesión programada correctamente.");
	        else
	            System.out.println("No se ha podido programar la sesión.");
	    }


	    public void borrarSesion() {
	        int id = Lecturas.leerEntero("Introduce el id de la sesión a borrar: ");

	        SesionControlador controlador = new SesionControlador();
	        boolean todoOk = controlador.borrarSesion(id);
	        if (todoOk)
	            System.out.println("Sesión borrada correctamente.");
	        else
	            System.out.println("No existe ninguna sesión con ese id.");
	    }

	}

