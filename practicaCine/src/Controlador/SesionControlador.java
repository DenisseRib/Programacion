package Controlador;

import java.util.ArrayList;

import Modelo.SesionDAO;
import Modelo.SesionDTO;

public class SesionControlador {

    public ArrayList<SesionDTO> listarSesiones() {
        SesionDAO dao = new SesionDAO();
        ArrayList<SesionDTO> lista = dao.listarSesiones();
        return lista;
    }


    public boolean borrarSesion(int id) {
        SesionDAO dao = new SesionDAO();
        return dao.borrarSesion(id);
    }


    public boolean programarSesion(int idPelicula, int idSala, String fecha, String hora, double precio) {
        SesionDAO dao = new SesionDAO();
        return dao.programarSesion(idPelicula, idSala, fecha, hora, precio);
    }
 
}
