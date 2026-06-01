package Controlador;

import java.util.ArrayList;

import Modelo.PeliculasDAO;
import Modelo.PeliculasDTO;

public class PeliculaContralador {
	
	 public ArrayList<PeliculasDTO> listarPeliculas() {
	        PeliculasDAO dao = new PeliculasDAO();
	        ArrayList<PeliculasDTO> lista = dao.listarPeliculas();
	        return lista;
	    }

	    public boolean añadirPelicula(String titulo, String genero, int duracion, int año) {
	        PeliculasDAO dao = new PeliculasDAO();
	        PeliculasDTO pelicula = new PeliculasDTO(titulo, genero, duracion, año);
	        return dao.añadirPelicula(pelicula);
	    }

	    public boolean editarPelicula(int id, String titulo, String genero, int duracion, int año) {
	        PeliculasDAO dao = new PeliculasDAO();
	        PeliculasDTO pelicula = new PeliculasDTO(id, titulo, genero, duracion, año);
	        return dao.editarPelicula(pelicula);
	    }

	    public boolean borrarPelicula(int id) {
	        PeliculasDAO dao = new PeliculasDAO();
	        return dao.borrarPelicula(id);
	    }

	    public PeliculasDTO buscarPeliculaPorId(int id) {
	        PeliculasDAO dao = new PeliculasDAO();
	        return dao.buscarPeliculaPorId(id);
	    }
}
