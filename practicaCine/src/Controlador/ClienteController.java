package Controlador;

import java.util.ArrayList;

import Modelo.ClienteDAO;
import Modelo.ClienteDTO;

public class ClienteController {
	public ArrayList<ClienteDTO> listarClientes() {
        ClienteDAO dao = new ClienteDAO();
        ArrayList<ClienteDTO> lista = dao.listarClientes();
        return lista;
    }


    public boolean añadirCliente(String nombre, String email, String telefono) {
        ClienteDAO dao = new ClienteDAO();
        ClienteDTO cliente = new ClienteDTO(nombre, email, telefono);
        return dao.añadirCliente(cliente);
    }


    public boolean editarCliente(int id, String nombre, String email, String telefono) {
        ClienteDAO dao = new ClienteDAO();
        ClienteDTO cliente = new ClienteDTO(id, nombre, email, telefono);
        return dao.editarCliente(cliente);
    }


    public boolean borrarCliente(int id) {
        ClienteDAO dao = new ClienteDAO();
        return dao.borrarCliente(id);
    }


    public ClienteDTO buscarClientePorId(int id) {
        ClienteDAO dao = new ClienteDAO();
        return dao.buscarClientePorId(id);
    }
}

	
	
	

