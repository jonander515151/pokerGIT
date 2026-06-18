package models;

public class Torneo {

	private String nombre;
	private String tipo;
	private int initialPoints;
	private int priceMoney;
	private int entryCost;

	public Torneo(String nombre, String tipo, int initialPoints, int priceMoney, int entryCost) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.initialPoints = initialPoints;
		this.priceMoney = priceMoney;
		this.entryCost = entryCost;
	}

	public int getInitialPoints() {
		return initialPoints;
	}

	public void setInitialPoints(int initialPoints) {
		this.initialPoints = initialPoints;
	}

	public int getPriceMoney() {
		return priceMoney;
	}

	public void setPriceMoney(int priceMoney) {
		this.priceMoney = priceMoney;
	}

	public int getEntryCost() {
		return entryCost;
	}

	public void setEntryCost(int entryCost) {
		this.entryCost = entryCost;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Torneo [nombre=" + nombre + ", tipo=" + tipo + ", initialPoints=" + initialPoints/1000 + " K "  + ", priceMoney="
				+ priceMoney/1000 + " K "  + ", entryCost=" + entryCost + "]";
	}


}
