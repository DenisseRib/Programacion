package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Utils.ConexionBBDD;

public class PeliculasDAO {

	public ArrayList<PeliculasDTO> listarPeliculas() {
        try {

            Connection conexion = ConexionBBDD.getConexion();

            String sql = "SELECT id, titulo, genero, duracion, anio FROM peliculas";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            ArrayList<PeliculasDTO> lista = new ArrayList<>();
            while (rs.next()) {
                int id = rs.getInt("id");
                String titulo = rs.getString("titulo");
                String genero = rs.getString("genero");
                int duracion = rs.getInt("duracion");
                int año = rs.getInt("anio");

                PeliculasDTO pelicula = new PeliculasDTO(id, titulo, genero, duracion, año);
                lista.add(pelicula);
            }

            conexion.close();
            return lista;

        } catch (SQLException e) {
            System.out.println("Error al listar películas: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    public boolean añadirPelicula(PeliculasDTO pelicula) {
        try {
            Connection conexion = ConexionBBDD.getConexion();

            String sql = "INSERT INTO peliculas (titulo, genero, duracion, anio) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, pelicula.getTitulo());
            ps.setString(2, pelicula.getGenero());
            ps.setInt(3, pelicula.getDuracion());
            ps.setInt(4, pelicula.getAño());

            int numFilas = ps.executeUpdate();
            conexion.close();

            return numFilas > 0;

        } catch (SQLException e) {
            System.out.println("Error al añadir película: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    public boolean editarPelicula(PeliculasDTO pelicula) {
        try {
            Connection conexion = ConexionBBDD.getConexion();

            String sql = "UPDATE peliculas SET titulo = ?, genero = ?, duracion = ?, anio = ? WHERE id = ?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, pelicula.getTitulo());
            ps.setString(2, pelicula.getGenero());
            ps.setInt(3, pelicula.getDuracion());
            ps.setInt(4, pelicula.getAño());
            ps.setInt(5, pelicula.getId());

            int numFilas = ps.executeUpdate();
            conexion.close();

            return numFilas > 0;

        } catch (SQLException e) {
            System.out.println("Error al editar película: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    public boolean borrarPelicula(int id) {
        try {
            Connection conexion = ConexionBBDD.getConexion();

            String sql = "DELETE FROM peliculas WHERE id = ?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, id);

            int numFilas = ps.executeUpdate();
            conexion.close();

            return numFilas > 0;

        } catch (SQLException e) {
            System.out.println("Error al borrar película: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    public PeliculasDTO buscarPeliculaPorId(int id) {
        try {
            Connection conexion = ConexionBBDD.getConexion();

            String sql = "SELECT id, titulo, genero, duracion, anio FROM peliculas WHERE id = ?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            PeliculasDTO pelicula = null;
            if (rs.next()) {
                String titulo = rs.getString("titulo");
                String genero = rs.getString("genero");
                int duracion = rs.getInt("duracion");
                int año = rs.getInt("anio");

                pelicula = new PeliculasDTO(id, titulo, genero, duracion, año);
            }

            conexion.close();
            return pelicula;

        } catch (SQLException e) {
            System.out.println("Error al buscar película: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }}