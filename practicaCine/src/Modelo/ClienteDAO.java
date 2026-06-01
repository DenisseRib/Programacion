package Modelo;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Utils.ConexionBBDD;

public class ClienteDAO {

    public ArrayList<ClienteDTO> listarClientes() {
        try {
        	
            Connection conexion = ConexionBBDD.getConexion();

            String sql = "SELECT id, nombre, email, telefono FROM clientes";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            ArrayList<ClienteDTO> lista = new ArrayList<>();
            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String email = rs.getString("email");
                String telefono = rs.getString("telefono");

                ClienteDTO cliente = new ClienteDTO(id, nombre, email, telefono);
                lista.add(cliente);
            }

            conexion.close();
            return lista;

        } catch (SQLException e) {
            System.out.println("Error al listar clientes: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    public boolean añadirCliente(ClienteDTO cliente) {
        try {
            Connection conexion = ConexionBBDD.getConexion();

            String sql = "INSERT INTO clientes (nombre, email, telefono) VALUES (?, ?, ?)";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getEmail());
            ps.setString(3, cliente.getTelefono());

            int numFilas = ps.executeUpdate();
            conexion.close();

            return numFilas > 0;

        } catch (SQLException e) {
            System.out.println("Error al añadir cliente: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    public boolean editarCliente(ClienteDTO cliente) {
        try {
            Connection conexion = ConexionBBDD.getConexion();

            String sql = "UPDATE clientes SET nombre = ?, email = ?, telefono = ? WHERE id = ?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getEmail());
            ps.setString(3, cliente.getTelefono());
            ps.setInt(4, cliente.getId());

            int numFilas = ps.executeUpdate();
            conexion.close();

            return numFilas > 0;

        } catch (SQLException e) {
            System.out.println("Error al editar cliente: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    public boolean borrarCliente(int id) {
        try {
            Connection conexion = ConexionBBDD.getConexion();

            String sql = "DELETE FROM clientes WHERE id = ?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, id);

            int numFilas = ps.executeUpdate();
            conexion.close();

            return numFilas > 0;

        } catch (SQLException e) {
            System.out.println("Error al borrar cliente: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    public ClienteDTO buscarClientePorId(int id) {
        try {
            Connection conexion = ConexionBBDD.getConexion();

            String sql = "SELECT id, nombre, email, telefono FROM clientes WHERE id = ?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            ClienteDTO cliente = null;
            if (rs.next()) {
                String nombre = rs.getString("nombre");
                String email = rs.getString("email");
                String telefono = rs.getString("telefono");

                cliente = new ClienteDTO(id, nombre, email, telefono);
            }

            conexion.close();
            return cliente;

        } catch (SQLException e) {
            System.out.println("Error al buscar cliente: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
}