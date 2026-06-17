package models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Marcador {

	Jugadores jugador;
	private int ganar;
	private int perder;
	private int empate;
	private int descarte;
	private int moneyWin;
	private int moneyLost;
	private String tipoTorneo;
	private int rondasN;
	



	public Marcador(Jugadores jugador, int ganar, int perder, int empate, int descarte, int moneyWin, int moneyLost,
			String tipoTorneo, int rondasN) {
		super();
		this.jugador = jugador;
		this.ganar = ganar;
		this.perder = perder;
		this.empate = empate;
		this.descarte = descarte;
		this.moneyWin = moneyWin;
		this.moneyLost = moneyLost;
		this.tipoTorneo = tipoTorneo;
		this.rondasN = rondasN;
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

	public String getTipoTorneo() {
		return tipoTorneo;
	}

	public void setTipoTorneo(String tipoTorneo) {
		this.tipoTorneo = tipoTorneo;
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
	
	public void subMoneyWin(int moneyWin) {
		this.moneyWin -= moneyWin;
	}

	public void addMoneyLost(int moneyLost) {
		this.moneyLost += moneyLost;
	}
	public void subMoneyLost(int moneyLost) {
		this.moneyLost -= moneyLost;
	}
	
	public int getMoneyLost() {
		return moneyLost;
	}

	public void setMoneyLost(int moneyLost) {
		this.moneyLost = moneyLost;
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
	
	public void addGanar() {
		this.ganar += 1;
	}

	public int getPerder() {
		return perder;
	}

	public void setPerder(int perder) {
		this.perder = perder;
	}
	
	public void addPerder() {
		this.perder += 1;
	}

	public int getEmpate() {
		return empate;
	}

	public void setEmpate(int empate) {
		this.empate = empate;
	}
	
	public void addEmpate() {
		this.empate += 1;
	}
	

	public int getDescarte() {
		return descarte;
	}

	public void setDescarte(int descarte) {
		this.descarte = descarte;
	}
	
	public void addDescarte() {
		this.descarte += 1;
	}

	

	@Override
	public String toString() {
		return "Marcador [jugador=" + jugador + ", ganar=" + ganar + ", perder=" + perder + ", empate=" + empate
				+ ", descarte=" + descarte + ", moneyWin=" + moneyWin + ", moneyLost=" + moneyLost + ", tipoTorneo="
				+ tipoTorneo + ", rondasN=" + rondasN + "]";
	}

	public String toCSV() {
		return  jugador.toCSV() + "," + ganar + "," + perder + "," + empate
				+ "," + descarte + "," + moneyWin + "," + moneyLost+ ","+ tipoTorneo+ ","+ rondasN;
	}


	
	
	
	
	

}
