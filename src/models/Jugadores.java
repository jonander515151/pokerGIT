package models;

public class Jugadores {

	private String nombre;
	private String pais;
	private String genero;
	private int edad;

	public Jugadores(String nombre, String pais, String genero, int edad) {
		super();
		this.nombre = nombre;
		this.pais = pais;
		this.genero = genero;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Jugadores [nombre=" + nombre + ", pais=" + pais + ", genero=" + genero + ", edad=" + edad + "]";
	}

	public String toCSV() {
		return  nombre + "," + pais + "," + genero + "," + edad;
	}
	
}
