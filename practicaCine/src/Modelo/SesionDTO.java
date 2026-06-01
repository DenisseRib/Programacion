package Modelo;

public class SesionDTO {
	 private int id;
	    private String tituloPelicula;
	    private int numeroSala;
	    private String fecha;
	    private String hora;
	    private double precio;
	    private int asientosDisponibles;


	    public SesionDTO(int id, String tituloPelicula, int numeroSala, String fecha, String hora, double precio, int asientosDisponibles) {
	        super();
	        this.id = id;
	        this.tituloPelicula = tituloPelicula;
	        this.numeroSala = numeroSala;
	        this.fecha = fecha;
	        this.hora = hora;
	        this.precio = precio;
	        this.asientosDisponibles = asientosDisponibles;
	    }


	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getTituloPelicula() {
	        return tituloPelicula;
	    }

	    public void setTituloPelicula(String tituloPelicula) {
	        this.tituloPelicula = tituloPelicula;
	    }

	    public int getNumeroSala() {
	        return numeroSala;
	    }

	    public void setNumeroSala(int numeroSala) {
	        this.numeroSala = numeroSala;
	    }

	    public String getFecha() {
	        return fecha;
	    }

	    public void setFecha(String fecha) {
	        this.fecha = fecha;
	    }

	    public String getHora() {
	        return hora;
	    }

	    public void setHora(String hora) {
	        this.hora = hora;
	    }

	    public double getPrecio() {
	        return precio;
	    }

	    public void setPrecio(double precio) {
	        this.precio = precio;
	    }

	    public int getAsientosDisponibles() {
	        return asientosDisponibles;
	    }

	    public void setAsientosDisponibles(int asientosDisponibles) {
	        this.asientosDisponibles = asientosDisponibles;
	    }
}
