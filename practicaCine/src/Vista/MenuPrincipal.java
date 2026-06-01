package Vista;

import Utils.Lecturas;

public class MenuPrincipal {
	 public void mostrarMenu() {
	        boolean salir = false;

	        do {
	            System.out.println("\n=== MENÚ PRINCIPAL =>>");
	            System.out.println("1. Gestión de películas");
	            System.out.println("2. Gestión de clientes");
	            System.out.println("3. Gestión de sesiones");
	            System.out.println("9. Salir");
	            int opcion = Lecturas.leerEnteroEnRango("Introduce una opción: ", 1, 9);

	            switch (opcion) {
	                case 1:
	                   VistaPeliculas peliculaVista = new VistaPeliculas();
	                    peliculaVista.menuPeliculas();
	                    break;
	                case 2:
	                    VistaClientes clienteVista = new VistaClientes();
	                    clienteVista.menuClientes();
	                    break;
	                case 3:
	                    VistaSesion sesionVista = new VistaSesion();
	                    sesionVista.menuSesiones();
	                    break;
	                case 9:
	                    salir = true;
	                    System.out.println("Hasta luego.");
	                    break;
	            }

	        } while (!salir);
	    }
}
