package Vista;

import java.util.ArrayList;

import Controlador.ClienteController;
import Modelo.ClienteDTO;
import Utils.Lecturas;

public class VistaClientes {
	public void menuClientes() {
        boolean salir = false;

        do {
            System.out.println("\n=== CLIENTES =>>");
            System.out.println("1. Listar clientes");
            System.out.println("2. Añadir cliente");
            System.out.println("3. Editar cliente");
            System.out.println("4. Borrar cliente");
            System.out.println("9. Salir al menú principal");
            int opcion = Lecturas.leerEnteroEnRango("Introduce una opción: ", 1, 9);

            switch (opcion) {
                case 1:
                    System.out.println("= LISTAR CLIENTES =");
                    listarClientes();
                    break;
                case 2:
                    System.out.println("= AÑADIR CLIENTE =");
                    añadirCliente();
                    break;
                case 3:
                    System.out.println("= EDITAR CLIENTE =");
                    editarCliente();
                    break;
                case 4:
                    System.out.println("= BORRAR CLIENTE =");
                    borrarCliente();
                    break;
                case 9:
                    salir = true;
                    break;
            }

        } while (!salir);
    }


    public void listarClientes() {
        ClienteController controlador = new ClienteController();
        ArrayList<ClienteDTO> lista = controlador.listarClientes();

        if (lista == null || lista.isEmpty()) {
            System.out.println("No hay clientes registrados.");
            return;
        }

        for (ClienteDTO cliente : lista) {
            System.out.println(cliente.getId() + " - " + cliente.getNombre() + " - "
                    + cliente.getEmail() + " - " + cliente.getTelefono());
        }
    }


    public void añadirCliente() {
        String nombre = Lecturas.leerString("Nombre: ");

        String email = Lecturas.leerString("Email: ");
        if (!validarEmail(email)) {
            System.out.println("Error: el email no tiene un formato correcto. No se ha insertado el cliente.");
            return;
        }

        String telefono = Lecturas.leerString("Teléfono: ");
        if (!validarTelefono(telefono)) {
            System.out.println("Error: el teléfono solo puede contener dígitos. No se ha insertado el cliente.");
            return;
        }

        ClienteController controlador = new ClienteController();
        boolean todoOk = controlador.añadirCliente(nombre, email, telefono);
        if (todoOk)
            System.out.println("Cliente añadido correctamente.");
        else
            System.out.println("No se ha podido añadir el cliente.");
    }


    public void editarCliente() {
        int id = Lecturas.leerEntero("Introduce el id del cliente a editar: ");

        ClienteController controlador = new ClienteController();
        ClienteDTO clienteActual = controlador.buscarClientePorId(id);
        if (clienteActual == null) {
            System.out.println("No existe ningún cliente con ese id.");
            return;
        }

        System.out.println("Datos actuales: " + clienteActual.getNombre() + " - "
                + clienteActual.getEmail() + " - " + clienteActual.getTelefono());

        String nombre = Lecturas.leerString("Nuevo nombre: ");

        String email = Lecturas.leerString("Nuevo email: ");
        if (!validarEmail(email)) {
            System.out.println("Error: el email no tiene un formato correcto. No se ha editado el cliente.");
            return;
        }

        String telefono = Lecturas.leerString("Nuevo teléfono: ");
        if (!validarTelefono(telefono)) {
            System.out.println("Error: el teléfono solo puede contener dígitos. No se ha editado el cliente.");
            return;
        }

        boolean todoOk = controlador.editarCliente(id, nombre, email, telefono);
        if (todoOk)
            System.out.println("Cliente editado correctamente.");
        else
            System.out.println("No se ha podido editar el cliente.");
    }


    public void borrarCliente() {
        int id = Lecturas.leerEntero("Introduce el id del cliente a borrar: ");

        ClienteController controlador = new ClienteController();
        boolean todoOk = controlador.borrarCliente(id);
        if (todoOk)
            System.out.println("Cliente borrado correctamente.");
        else
            System.out.println("No existe ningún cliente con ese id.");
    }


    private boolean validarEmail(String email) {
        return email.contains("@") && email.contains(".");
    }
    
    private boolean validarTelefono(String telefono) {
        try {
            Integer.parseInt(telefono);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
