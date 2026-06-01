package Modelo;

public class PeliculasDTO {
	 private int id;
	    private String titulo;
	    private String genero;
	    private int duracion;
	    private int año;


	    public PeliculasDTO(int id, String titulo, String genero, int duracion, int año) {
	        super();
	        this.id = id;
	        this.titulo = titulo;
	        this.genero = genero;
	        this.duracion = duracion;
	        this.año = año;
	    }

	    public PeliculasDTO(String titulo, String genero, int duracion, int año) {
	        super();
	        this.titulo = titulo;
	        this.genero = genero;
	        this.duracion = duracion;
	        this.año = año;
	    }


	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getTitulo() {
	        return titulo;
	    }

	    public void setTitulo(String titulo) {
	        this.titulo = titulo;
	    }

	    public String getGenero() {
	        return genero;
	    }

	    public void setGenero(String genero) {
	        this.genero = genero;
	    }

	    public int getDuracion() {
	        return duracion;
	    }

	    public void setDuracion(int duracion) {
	        this.duracion = duracion;
	    }

	    public int getAño() {
	        return año;
	    }

	    public void setAño(int año) {
	        this.año = año;
	    }

}
