package models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import megaCore.MegaDash;

public class MazoCartas {
	
	private int[] Jugadas;
	private int[] Jugadas114;
	private int[] JugadasA114;
	private int[] JugadasB114;
	private String[] nombresCartas;
	private String[] nombresCartasA;
	private String[] nombresCartasB;
	
	private int contadorA;
	private int contadorB;
	
	public MazoCartas() {
		super();
		Jugadas = new int[40];
		Jugadas114 = new int[40];
		JugadasA114 = new int[10];
		JugadasB114 = new int[10];
		nombresCartas = new String[40];
		nombresCartasA = new String[10];
		nombresCartasB= new String[10];
		contadorA = 0;
		contadorB = 0;
	}

	public int[] getJugadas() {
		return Jugadas;
	}

	public int getContadorA() {
		return contadorA;
	}

	public void setContadorA(int contadorA) {
		this.contadorA = contadorA;
	}

	public int getContadorB() {
		return contadorB;
	}

	public void setContadorB(int contadorB) {
		this.contadorB = contadorB;
	}

	public void setJugadas(int[] jugadas) {
		Jugadas = jugadas;
	}
	
	public String[] getNombresCartas() {
		return nombresCartas;
	}

	public void setNombresCartas(String[] nombresCartas) {
		this.nombresCartas = nombresCartas;
	}

	public int[] getJugadas114() {
		return Jugadas114;
	}

	public void setJugadas114(int[] jugadas114) {
		Jugadas114 = jugadas114;
	}

	public String[] getNombresCartasA() {
		return nombresCartasA;
	}

	public void setNombresCartasA(String[] nombresCartasA) {
		this.nombresCartasA = nombresCartasA;
	}

	public String[] getNombresCartasB() {
		return nombresCartasB;
	}

	public void setNombresCartasB(String[] nombresCartasB) {
		this.nombresCartasB = nombresCartasB;
	}

	public void barajar() {
		
		Random r = new Random();
		ArrayList<Integer> listaR = new ArrayList();
		int valorCarta = 0;
		int controlCarta = 0;
		//baraja 20 cartas sin repetir
		for (int i = 0; i < 20; i++) {
			controlCarta = 0;
			while (controlCarta==0) {
				
				if(controlCarta==0) 
					valorCarta = r.nextInt(52);
					if (!listaR.contains(valorCarta)) {
						Jugadas[i]=valorCarta;
						listaR.add(valorCarta);
						controlCarta=10;
					}
			}
		}
		
//		System.out.println("jugadas ");
//		for (int i = 0; i < 10; i++) {
//			
//			System.out.println(Jugadas[i]+" ");
//			
//		}
		
	}


	
	public void nombresCartas() {
		
		
		for (int i = 0; i < 20; i++) {
			//cambiamos los numeros 0-51 a 2-14
			if (Jugadas[i]<13) {
				nombresCartas[i] = Jugadas[i]+2+"";
				Jugadas114[i] = Jugadas[i]+2;
			}
			else if (Jugadas[i]>12 && Jugadas[i]<26) {
				nombresCartas[i] = Jugadas[i]-13+2 +"";
				Jugadas114[i] = Jugadas[i]-13+2;
			}
			else if (Jugadas[i]>25 && Jugadas[i]<39) {
				nombresCartas[i] = Jugadas[i]-26+2 + "";
				Jugadas114[i] = Jugadas[i]-26+2;
			}
			else if (Jugadas[i]>38 && Jugadas[i]<52) {
				nombresCartas[i] = Jugadas[i]-39+2 +"";
				Jugadas114[i] = Jugadas[i]-39+2;
			}
			
			if(nombresCartas[i].length()<2) {
				nombresCartas[i]="0"+nombresCartas[i];
			}
			
		}
		
		for (int i = 0; i < 20; i++) {
			//ponemos los 4 nombres
			if (Jugadas[i]<13) {
				nombresCartas[i] = nombresCartas[i] + " de corazones";
			}
			else if (Jugadas[i]>12 && Jugadas[i]<26) {
				nombresCartas[i] = nombresCartas[i] + " de picas";
			}
			else if (Jugadas[i]>25 && Jugadas[i]<39) {
				nombresCartas[i] = nombresCartas[i] + " de diamantes";
			}
			else if (Jugadas[i]>38 && Jugadas[i]<52) {
				nombresCartas[i] = nombresCartas[i]+ " de tréboles";
			}
			
		}
		
		
//		System.out.println("nombres de cartas ");
//		for (int i = 0; i < 20; i++) {
//			
//			System.out.println(nombresCartas[i]);
//			
//		}
		
		//MegaDash.mostrarBarres();
		
		for (int i = 0; i < 10; i=i+1) {
			//reparte 1 de cada
			nombresCartasA[i]=nombresCartas[i*2];
			nombresCartasB[i]=nombresCartas[i*2+1];
			
			JugadasA114[i]=Jugadas114[i*2];
			JugadasB114[i]=Jugadas114[i*2+1];
			
		}
		
		
		
		Arrays.sort(nombresCartasA);
		Arrays.sort(nombresCartasB);
		
		Arrays.sort(JugadasA114);
		Arrays.sort(JugadasB114);
		
		cambioAsRey();
		
		contarGanador();
		
//		System.out.println("jugadas numéricas A ");
//		for (int i = 0; i < 10; i++) {
//			
//			System.out.println(Jugadas114[i]);
//			
//		}
//		
//		
//		System.out.println("nombres de cartas A ");
//		for (int i = 0; i < 10; i++) {
//			
//			System.out.println(nombresCartasA[i]);
//			
//		}
//		
//		MegaDash.mostrarBarres();
//		
//		System.out.println("nombres de cartas B ");
//		for (int i = 0; i < 10; i++) {
//			
//			System.out.println(nombresCartasB[i]);
//			
//		}
		
		
	}
	
	
	public void cambioAsRey() {
		
		
		for (int i = 0; i < nombresCartasA.length; i++) {
			
			
			if(nombresCartasA[i].equals("11 de picas")) {
				nombresCartasA[i]="J de picas";
			}
			else if(nombresCartasA[i].equals("12 de picas")) {
				nombresCartasA[i]="Reina de picas";
			}
			else if(nombresCartasA[i].equals("13 de picas")) {
				nombresCartasA[i]="Rey de picas";
			}
			else if(nombresCartasA[i].equals("14 de picas")) {
				nombresCartasA[i]="As de picas";
			}
			else if(nombresCartasA[i].equals("11 de corazones")) {
				nombresCartasA[i]="J de corazones";
			}
			else if(nombresCartasA[i].equals("12 de corazones")) {
				nombresCartasA[i]="Reina de corazones";
			}
			else if(nombresCartasA[i].equals("13 de corazones")) {
				nombresCartasA[i]="Rey de corazones";
			}
			else if(nombresCartasA[i].equals("14 de corazones")) {
				nombresCartasA[i]="As de corazones";
			}
			else if(nombresCartasA[i].equals("11 de tréboles")) {
				nombresCartasA[i]="J de tréboles";
			}
			else if(nombresCartasA[i].equals("12 de tréboles")) {
				nombresCartasA[i]="Reina de tréboles";
			}
			else if(nombresCartasA[i].equals("13 de tréboles")) {
				nombresCartasA[i]="Rey de tréboles";
			}
			else if(nombresCartasA[i].equals("14 de tréboles")) {
				nombresCartasA[i]="As de tréboles";
			}
			else if(nombresCartasA[i].equals("11 de diamantes")) {
				nombresCartasA[i]="J de diamantes";
			}
			else if(nombresCartasA[i].equals("12 de diamantes")) {
				nombresCartasA[i]="Reina de diamantes";
			}
			else if(nombresCartasA[i].equals("13 de diamantes")) {
				nombresCartasA[i]="Rey de diamantes";
			}
			else if(nombresCartasA[i].equals("14 de diamantes")) {
				nombresCartasA[i]="As de diamantes";
			}
			
			
			
		}
		
		for (int i = 0; i < nombresCartasB.length; i++) {
			
			
			if(nombresCartasB[i].equals("11 de picas")) {
				nombresCartasB[i]="J de picas";
			}
			else if(nombresCartasB[i].equals("12 de picas")) {
				nombresCartasB[i]="Reina de picas";
			}
			else if(nombresCartasB[i].equals("13 de picas")) {
				nombresCartasB[i]="Rey de picas";
			}
			else if(nombresCartasB[i].equals("14 de picas")) {
				nombresCartasB[i]="As de picas";
			}
			else if(nombresCartasB[i].equals("11 de corazones")) {
				nombresCartasB[i]="J de corazones";
			}
			else if(nombresCartasB[i].equals("12 de corazones")) {
				nombresCartasB[i]="Reina de corazones";
			}
			else if(nombresCartasB[i].equals("13 de corazones")) {
				nombresCartasB[i]="Rey de corazones";
			}
			else if(nombresCartasB[i].equals("14 de corazones")) {
				nombresCartasB[i]="As de corazones";
			}
			else if(nombresCartasB[i].equals("11 de tréboles")) {
				nombresCartasB[i]="J de tréboles";
			}
			else if(nombresCartasB[i].equals("12 de tréboles")) {
				nombresCartasB[i]="Reina de tréboles";
			}
			else if(nombresCartasB[i].equals("13 de tréboles")) {
				nombresCartasB[i]="Rey de tréboles";
			}
			else if(nombresCartasB[i].equals("14 de tréboles")) {
				nombresCartasB[i]="As de tréboles";
			}
			else if(nombresCartasB[i].equals("11 de diamantes")) {
				nombresCartasB[i]="J de diamantes";
			}
			else if(nombresCartasB[i].equals("12 de diamantes")) {
				nombresCartasB[i]="Reina de diamantes";
			}
			else if(nombresCartasB[i].equals("13 de diamantes")) {
				nombresCartasB[i]="Rey de diamantes";
			}
			else if(nombresCartasB[i].equals("14 de diamantes")) {
				nombresCartasB[i]="As de diamantes";
			}
		}
			
	}
	
	public void contarGanador() {
		
		contadorA=0;
		contadorB=0;
		
		for (int i = 0; i < 5; i++) {
			
			contadorA+=JugadasA114[5+i];
			//System.out.println("JugadasA114 : "+JugadasA114[5+i]);
			
			contadorB+=JugadasB114[5+i];
			//System.out.println("JugadasB114 : "+JugadasB114[5+i]);
		}
		
		
		//System.out.println("puntos A: "+contadorA);
		
		//System.out.println("puntos B: "+contadorB);
		
	}
	
	

}
