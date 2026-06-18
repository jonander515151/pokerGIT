package models;

import java.util.Random;
import java.util.Scanner;


import megaCore.MegaDash;
import megaCore.MegaFile;

public class PokerData {


	private Torneo torneo;
	private Marcador marcadorA;
	private Marcador marcadorB;
	private MazoCartas mazo;


	public PokerData( Torneo torneo, Marcador marcadorA, Marcador marcadorB, MazoCartas mazo) {
		super();
		
		this.torneo = torneo;
		this.marcadorA = marcadorA;
		this.marcadorB = marcadorB;
		this.mazo = mazo;
	}

	@Override
	public String toString() {
		return "PokerData [ torneo=" + torneo + ", marcadorA=" + marcadorA + ", marcadorB="
				+ marcadorB + ", mazo=" + mazo + "]";
	}

	public Torneo getTorneo() {
		return torneo;
	}

	public void setTorneo(Torneo torneo) {
		this.torneo = torneo;
	}

	public Marcador getMarcadorA() {
		return marcadorA;
	}

	public void setMarcadorA(Marcador marcadorA) {
		this.marcadorA = marcadorA;
	}

	public Marcador getMarcadorB() {
		return marcadorB;
	}


	public void setMarcadorB(Marcador marcadorB) {
		this.marcadorB = marcadorB;
	}


	public MazoCartas getMazo() {
		return mazo;
	}


	public void setMazo(MazoCartas mazo) {
		this.mazo = mazo;
	}

	private void menuFestival() {
		
		MegaDash.mostrarBarres();
		System.out.println("opció 1 ALLIN");
		System.out.println("opció 2 apuesta 5000");
		System.out.println("opció 3 apuesta 10000");
		System.out.println("opció 4 apuesta 20000");
		System.out.println("opció 5 pasa");
		System.out.println("opció 6 descarta");
	}
	
	private void eraseScores() {
		
		marcadorA.setDescarte(0);
		marcadorA.setEmpate(0);
		marcadorA.setGanar(0);
		marcadorA.setPerder(0);
		marcadorA.setMoneyLost(0);
		marcadorA.setMoneyWin(0);
		marcadorA.setRondasN(0);
		
		marcadorB.setDescarte(0);
		marcadorB.setEmpate(0);
		marcadorB.setGanar(0);
		marcadorB.setPerder(0);
		marcadorB.setMoneyLost(0);
		marcadorB.setMoneyWin(0);
		marcadorB.setRondasN(0);
	}

	public void AllInFestival() {
		//
		int opcioPrograma = 0;
		int fichasA = torneo.getInitialPoints();
		int fichasB = torneo.getInitialPoints();
		int pozoTotal = 0;
		int rondasN = 0;
		int ciegaGrande=0;
		eraseScores();
		marcadorA.subMoneyLost(torneo.getEntryCost());
		marcadorB.subMoneyLost(torneo.getEntryCost());
		marcadorA.setTipoTorneo(torneo.getTipo());
		marcadorB.setTipoTorneo(torneo.getTipo());
		
		int controlPoker = 0;
		System.out.println("Fichas iniciales "+fichasA);
		;
		Scanner s = new Scanner(System.in);
		//
		MegaDash.mostrarBarres();
		System.out.println("Bienbenidos a la "+torneo.getNombre());
		System.out.println("Este torneo forma parte de "+torneo.getTipo());
		System.out.println("Empezamos el ALL IN FESTIVAL");
		System.out.println("El jugador " + marcadorA.getJugador().getNombre() + " VS " + marcadorB.getJugador().getNombre());
		
		while(fichasA>0 && fichasB>0) {
			mazo.barajar();
			mazo.nombresCartas();
			//
			rondasN++;
			//
			pozoTotal=0;
			controlPoker=0;
			ciegaGrande=1000;
			pozoTotal=2*ciegaGrande;
			fichasA-=ciegaGrande;
			fichasB-=ciegaGrande;
			//
			MegaDash.mostrarBarres();
			System.out.println("Ronda 1 - Pozo: "+pozoTotal);
			System.out.println("Cartas para "+ marcadorA.getJugador().getNombre());

			String [] cartasA= mazo.getNombresCartasA();
			String [] cartasB= mazo.getNombresCartasB();
			
			//
			for (int i = 0; i < 5; i++) {
				System.out.println("carta " + i + " " +cartasA[i]);
			}

			//
			menuFestival();
			opcioPrograma = Integer.parseInt(s.nextLine());
			switch (opcioPrograma) {

			case 1: {
				System.out.println("Program 1 - ALL IN");
				if(fichasA>fichasB) {
					
					pozoTotal+=fichasB+fichasB;
					fichasA=fichasA-fichasB;
					fichasB=0;
				}
				else if(fichasA<fichasB) {
					
					pozoTotal+=fichasA+fichasA;
					fichasB=fichasB-fichasA;
					fichasA=0;
				}
				else if(fichasA==fichasB) {
					
					pozoTotal+=fichasA+fichasB;
					fichasA=0;
					fichasB=0;
					controlPoker=10;
				}
				
				controlPoker=10;


				break;
			}
			case 2: {
				System.out.println("Program 2 - apuesta 5000");
				pozoTotal+=10000;
				fichasA-=5000;
				fichasB-=5000;	


				break;
			}
			case 3: {
				System.out.println("Program 3 - apuesta 10000");
				pozoTotal+=20000;
				fichasA-=10000;
				fichasB-=10000;	


				break;
			}
			case 4: {
				System.out.println("Program 4 - apuesta 20000");
				pozoTotal+=40000;
				fichasA-=20000;
				fichasB-=20000;	


				break;
			}
			
			case 5: {
				System.out.println("Program 5 - pasa");



				break;
			}
			case 6: {
				System.out.println("Program 6 - pasa");
				



				break;
			}	

			}
			//
			MegaDash.mostrarBarres();
			System.out.println("Ronda 2 - Pozo: "+pozoTotal);
			System.out.println("Cartas para "+ marcadorA.getJugador().getNombre());
			for (int i = 2; i < 7; i++) {
				System.out.println("carta " + i + " " +cartasA[i]);
			}

			//
			if(controlPoker==0) {
				menuFestival();
				opcioPrograma = Integer.parseInt(s.nextLine());
				switch (opcioPrograma) {

				case 1: {
					System.out.println("Program 1 - ALL IN");
					if(fichasA>fichasB) {
						
						pozoTotal+=fichasB+fichasB;
						fichasA=fichasA-fichasB;
						fichasB=0;
					}
					else if(fichasA<fichasB) {
						
						pozoTotal+=fichasA+fichasA;
						fichasB=fichasB-fichasA;
						fichasA=0;
					}
					else if(fichasA==fichasB) {
						
						pozoTotal+=fichasA+fichasB;
						fichasA=0;
						fichasB=0;
						controlPoker=10;
					}
					
					controlPoker=10;


					break;
				}
				case 2: {
					System.out.println("Program 2 - apuesta 5000");
					pozoTotal+=10000;
					fichasA-=5000;
					fichasB-=5000;


					break;
				}
				case 3: {
					System.out.println("Program 3 - apuesta 10000");
					pozoTotal+=20000;
					fichasA-=10000;
					fichasB-=10000;	


					break;
				}
				case 4: {
					System.out.println("Program 4 - apuesta 20000");
					pozoTotal+=40000;
					fichasA-=20000;
					fichasB-=20000;	


					break;
				}
				
				case 5: {
					System.out.println("Program 5 - pasa");



					break;
				}
				case 6: {
					System.out.println("Program 6 - pasa");
					



					break;
				}

				}
			}
			//
			MegaDash.mostrarBarres();
			System.out.println("Ronda 3 - Pozo: "+pozoTotal);
			System.out.println("Cartas para "+ marcadorA.getJugador().getNombre());
			for (int i = 5; i < 10; i++) {
				System.out.println("carta " + i + " " +cartasA[i]);
			}
			//
			if(controlPoker==0) {
				menuFestival();
				opcioPrograma = Integer.parseInt(s.nextLine());
				switch (opcioPrograma) {

				case 1: {
					System.out.println("Program 1 - ALL IN");
					if(fichasA>fichasB) {
						
						pozoTotal+=fichasB+fichasB;
						fichasA=fichasA-fichasB;
						fichasB=0;
					}
					else if(fichasA<fichasB) {
						
						pozoTotal+=fichasA+fichasA;
						fichasB=fichasB-fichasA;
						fichasA=0;
					}
					else if(fichasA==fichasB) {
						
						pozoTotal+=fichasA+fichasB;
						fichasA=0;
						fichasB=0;
						controlPoker=10;
					}
					
					controlPoker=10;


					break;
				}
				case 2: {
					System.out.println("Program 2 - apuesta 5000");
					pozoTotal+=10000;
					fichasA-=5000;
					fichasB-=5000;


					break;
				}
				case 3: {
					System.out.println("Program 3 - apuesta 10000");
					pozoTotal+=20000;
					fichasA-=10000;
					fichasB-=10000;	


					break;
				}
				case 4: {
					System.out.println("Program 4 - apuesta 20000");
					pozoTotal+=40000;
					fichasA-=20000;
					fichasB-=20000;	


					break;
				}
				
				case 5: {
					System.out.println("Program 5 - pasa");



					break;
				}
				case 6: {
					System.out.println("Program 6 - pasa");



					break;
				}

				}
			}
			//
			
			MegaDash.mostrarBarres();
			System.out.println("Enseñando Cartas ");
			MegaDash.mostrarBarres();
			System.out.println("Cartas para "+ marcadorA.getJugador().getNombre());
			for (int i = 5; i < 10; i++) {
				System.out.println("carta " + i + " " +cartasA[i]);
			}
			System.out.println("Puntos para "+ marcadorA.getJugador().getNombre()+ " " + mazo.getContadorA());
			MegaDash.mostrarBarres();
			System.out.println("Cartas para "+ marcadorB.getJugador().getNombre());
			for (int i = 5; i < 10; i++) {
				System.out.println("carta " + i + " " +cartasB[i]);
			}
			System.out.println("Puntos para "+ marcadorB.getJugador().getNombre()+ " " + mazo.getContadorB());
			System.out.println("\033[31m");
			MegaDash.mostrarGuions();
			if(mazo.getContadorA()>mazo.getContadorB()) {
				System.out.println("gana la mano "+ marcadorA.getJugador().getNombre());
				fichasA+=pozoTotal;
				marcadorA.addGanar();
				marcadorB.addPerder();
			}
			else if(mazo.getContadorB()>mazo.getContadorA()) {
				System.out.println("gana la mano "+ marcadorB.getJugador().getNombre());
				fichasB+=pozoTotal;
				marcadorB.addGanar();
				marcadorA.addPerder();
			}
			else if(mazo.getContadorA()==mazo.getContadorB()) {
				System.out.println("empate técnico en la mano");
				fichasA+=pozoTotal/2;
				fichasB+=pozoTotal/2;
				marcadorA.addEmpate();
				marcadorB.addEmpate();
			}
			MegaDash.mostrarGuions();
			System.out.println("conteo de fichas");
			System.out.println("fichas "+ marcadorA.getJugador().getNombre()+ " " + fichasA);
			System.out.println("fichas "+ marcadorB.getJugador().getNombre()+ " " + fichasB);
			System.out.println("\033[0m");
		}
		//acaba bucle 
		System.out.println("\033[32m");
		if(fichasA>fichasB) {
			System.out.println("gana el torneo " + torneo.getNombre() + " "+ marcadorA.getJugador().getNombre());
			marcadorA.addMoneyWin(torneo.getPriceMoney());
			
			
		}
		else if(fichasA<fichasB) {
			System.out.println("gana el torneo " + torneo.getNombre() + " " + marcadorB.getJugador().getNombre());
			marcadorB.addMoneyWin(torneo.getPriceMoney());

		}
		System.out.println("\033[0m");
		marcadorA.addRondasN(rondasN);
		marcadorB.addRondasN(rondasN);
		
		MegaFile.writeSimple(marcadorA.toCSV(), "pokerData.txt");
		MegaFile.writeSimple(marcadorB.toCSV(), "pokerData.txt");
		
		MegaDash.retrasar5seg();
		
	}

	

}
