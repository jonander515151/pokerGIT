package models;

public class Estadisticas {
	
	Jugadores jugador;
	private int ganar;
	private int perder;
	private int empate;
	private int descarte;
	private int moneyWin;
	private int moneyLost;
	private int tipoEPT;
	private int tipoWPT;
	private int tipoWSOP;
	private int rondasN;
	
	

	public Estadisticas(Jugadores jugador, int ganar, int perder, int empate, int descarte, int moneyWin, int moneyLost,
			int tipoEPT, int tipoWPT, int tipoWSOP, int rondasN) {
		super();
		this.jugador = jugador;
		this.ganar = ganar;
		this.perder = perder;
		this.empate = empate;
		this.descarte = descarte;
		this.moneyWin = moneyWin;
		this.moneyLost = moneyLost;
		this.tipoEPT = tipoEPT;
		this.tipoWPT = tipoWPT;
		this.tipoWSOP = tipoWSOP;
		this.rondasN = rondasN;
	}

	public Jugadores getJugador() {
		return jugador;
	}

	public void setJugador(Jugadores jugador) {
		this.jugador = jugador;
	}

	public int getGanar() {
		return ganar;
	}

	public void setGanar(int ganar) {
		this.ganar = ganar;
	}
	
	public void addGanar(int ganar) {
		this.ganar += ganar;
	}

	public int getPerder() {
		return perder;
	}

	public void setPerder(int perder) {
		this.perder = perder;
	}
	
	public void addPerder(int perder) {
		this.perder += perder;
	}

	public int getEmpate() {
		return empate;
	}

	public void setEmpate(int empate) {
		this.empate = empate;
	}
	
	public void addEmpate(int empate) {
		this.empate += empate;
	}

	public int getDescarte() {
		return descarte;
	}

	public void setDescarte(int descarte) {
		this.descarte = descarte;
	}
	
	public void addDescarte(int descarte) {
		this.descarte += descarte;
	}

	public int getMoneyWin() {
		return moneyWin;
	}

	public void setMoneyWin(int moneyWin) {
		this.moneyWin = moneyWin;
	}
	
	public void addMoneyWin(int moneyWin) {
		this.moneyWin += moneyWin;
	}

	public int getMoneyLost() {
		return moneyLost;
	}

	public void addMoneyLost(int moneyLost) {
		this.moneyLost += moneyLost;
	}

	public int getTipoEPT() {
		return tipoEPT;
	}

	public void setTipoEPT(int tipoEPT) {
		this.tipoEPT = tipoEPT;
	}
	
	public void addTipoEPT() {
		this.tipoEPT += 1;
	}

	public int getTipoWPT() {
		return tipoWPT;
	}

	public void setTipoWPT(int tipoWPT) {
		this.tipoWPT = tipoWPT;
	}
	
	public void addTipoWPT() {
		this.tipoWPT += 1;
	}

	public int getTipoWSOP() {
		return tipoWSOP;
	}

	public void setTipoWSOP(int tipoWSOP) {
		this.tipoWSOP = tipoWSOP;
	}
	
	public void addTipoWSOP() {
		this.tipoWSOP += 1;
	}

	public int getRondasN() {
		return rondasN;
	}

	public void setRondasN(int rondasN) {
		this.rondasN = rondasN;
	}
	
	public void addRondasN(int rondasN) {
		this.rondasN += rondasN;
	}

	@Override
	public String toString() {
		return "Estadisticas [jugador=" + jugador + ", ganar=" + ganar + ", perder=" + perder + ", empate=" + empate
				+ ", descarte=" + descarte + ", moneyWin=" + moneyWin + ", moneyLost=" + moneyLost + ", tipoEPT="
				+ tipoEPT + ", tipoWPT=" + tipoWPT + ", tipoWSOP=" + tipoWSOP + ", rondasN=" + rondasN + "]";
	}
	
	
	
	
	
	

}
