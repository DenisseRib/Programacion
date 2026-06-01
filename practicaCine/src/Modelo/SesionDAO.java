package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Utils.ConexionBBDD;

public class SesionDAO {
	  public ArrayList<SesionDTO> listarSesiones() {
	        try {

	            Connection conexion = ConexionBBDD.getConexion();

	            String sql = "SELECT s.id, p.titulo, sa.numero, s.fecha, s.hora, s.precio, s.asientos_disponibles " +
	                         "FROM sesiones s " +
	                         "JOIN peliculas p ON s.id_pelicula = p.id " +
	                         "JOIN salas sa ON s.id_sala = sa.id";
	            PreparedStatement ps = conexion.prepareStatement(sql);
	            ResultSet rs = ps.executeQuery();

	            ArrayList<SesionDTO> lista = new ArrayList<>();
	            while (rs.next()) {
	                int id = rs.getInt("id");
	                String tituloPelicula = rs.getString("titulo");
	                int numeroSala = rs.getInt("numero");
	                String fecha = rs.getString("fecha");
	                String hora = rs.getString("hora");
	                double precio = rs.getDouble("precio");
	                int asientosDisponibles = rs.getInt("asientos_disponibles");

	                SesionDTO sesion = new SesionDTO(id, tituloPelicula, numeroSala, fecha, hora, precio, asientosDisponibles);
	                lista.add(sesion);
	            }

	            conexion.close();
	            return lista;

	        } catch (SQLException e) {
	            System.out.println("Error al listar sesiones: " + e.getMessage());
	            e.printStackTrace();
	            return null;
	        }
	    }

	    public boolean borrarSesion(int id) {
	        try {
	            Connection conexion = ConexionBBDD.getConexion();

	            String sql = "DELETE FROM sesiones WHERE id = ?";
	            PreparedStatement ps = conexion.prepareStatement(sql);
	            ps.setInt(1, id);

	            int numFilas = ps.executeUpdate();
	            conexion.close();

	            return numFilas > 0;

	        } catch (SQLException e) {
	            System.out.println("Error al borrar sesión: " + e.getMessage());
	            e.printStackTrace();
	            return false;
	        }
	    }

	    public boolean programarSesion(int idPelicula, int idSala, String fecha, String hora, double precio) {
	        Connection conexion = null;
	        try {
	            conexion = ConexionBBDD.getConexion();
	            conexion.setAutoCommit(false);

	            String sqlComprobar = "SELECT COUNT(*) FROM sesiones WHERE id_sala = ? AND fecha = ? AND hora = ?";
	            PreparedStatement psComprobar = conexion.prepareStatement(sqlComprobar);
	            psComprobar.setInt(1, idSala);
	            psComprobar.setString(2, fecha);
	            psComprobar.setString(3, hora);
	            ResultSet rs = psComprobar.executeQuery();
	            rs.next();
	            int count = rs.getInt(1);

	            if (count > 0) {
	                conexion.rollback();
	                System.out.println("Error: la sala ya tiene una sesión programada en esa fecha y hora.");
	                return false;
	            }

	            String sqlAforo = "SELECT aforo FROM salas WHERE id = ?";
	            PreparedStatement psAforo = conexion.prepareStatement(sqlAforo);
	            psAforo.setInt(1, idSala);
	            ResultSet rsAforo = psAforo.executeQuery();
	            rsAforo.next();
	            int aforo = rsAforo.getInt("aforo");

	            String sqlInsertar = "INSERT INTO sesiones (id_pelicula, id_sala, fecha, hora, precio, asientos_disponibles) VALUES (?, ?, ?, ?, ?, ?)";
	            PreparedStatement psInsertar = conexion.prepareStatement(sqlInsertar);
	            psInsertar.setInt(1, idPelicula);
	            psInsertar.setInt(2, idSala);
	            psInsertar.setString(3, fecha);
	            psInsertar.setString(4, hora);
	            psInsertar.setDouble(5, precio);
	            psInsertar.setInt(6, aforo);

	            psInsertar.executeUpdate();
	            conexion.commit();
	            return true;

	        } catch (SQLException e) {
	            System.out.println("Error al programar sesión: " + e.getMessage());
	            e.printStackTrace();
	            try {
	                conexion.rollback();
	            } catch (SQLException ex) {
	                ex.printStackTrace();
	            }
	            return false;
	        }
	    }
}
