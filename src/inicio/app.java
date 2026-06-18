package inicio;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import megaCore.MegaCore;
import megaCore.MegaDash;
import megaCore.MegaFile;
import models.Estadisticas;
import models.Jugadores;
import models.Marcador;
import models.MazoCartas;
import models.PokerData;
import models.Torneo;
//commit primero y luego push

public class app {

	public static void main(String[] args) throws FileNotFoundException {

		// Crear jugadores
		Jugadores AM = new Jugadores("Adrián Mateos", "España", "Hombre", 32);
		Jugadores JP  = new Jugadores("Juan Pastor",  "España", "Hombre", 52);
		Jugadores RM  = new Jugadores("Raúl Martínez",  "España", "Hombre", 44);
		Jugadores JM  = new Jugadores("Juan Maceiras",  "España", "Hombre", 37);
		//
		Jugadores VS  = new Jugadores("Vanessa Selbst",  "USA", "Mujer", 41);
		Jugadores AnaM  = new Jugadores("Ana Márquez",  "España", "Mujer", 35);
		Jugadores LM  = new Jugadores("Leo Margets",  "España", "Mujer", 35);
		Jugadores LB  = new Jugadores("Liv Boeree",  "UK", "Mujer", 35);
		Jugadores MH  = new Jugadores("Maria Ho",  "Taiwan", "Mujer", 41);
		
		ArrayList<Jugadores> playersList = new ArrayList<Jugadores>();
		playersList.add(AM);
		playersList.add(JP);
		playersList.add(RM);
		playersList.add(JM);
		playersList.add(VS);
		playersList.add(AnaM);
		playersList.add(LM);
		playersList.add(LB);
		playersList.add(MH);
		
		// Crear torneo
		Torneo Torneo1 = new Torneo("Gran Final de Mónaco","EPT",50000,250000,10000);//50k fichas, 250k ganador, 10 k entry
		
		Torneo Torneo2 = new Torneo("Main Event WSOP","WSOP",100000,1000000,10000);//100k fichas, 1 millones ganador, 10 k entry

		Torneo Torneo3 = new Torneo("High Roller World Poker Tour","WPT",100000,10000000,500000);//100k fichas, 10 millones ganador, 500 k entry
		
		Torneo Torneo4 = new Torneo("EPT de Barcelona","EPT",30000,250000,5000);//30k fichas, 250k ganador, 5 k entry
		
		Torneo Torneo5 = new Torneo("EPT de Londres","EPT",30000,250000,5000);//30k fichas, 250k ganador, 5 k entry
		
		Torneo Torneo6 = new Torneo("WPT Hollywood Poker Open","WPT",50000,500000,20000);//50k fichas, 500k ganador, 20 k entry

		Torneo Torneo7 = new Torneo("WPT Macao Poker Open","WPT",50000,500000,20000);//50k fichas, 500k ganador, 20 k entry

		Torneo Torneo8 = new Torneo("WSOP H.O.R.S.E. $10.000 Championship:","WSOP",50000,1000000,10000);//50k fichas, 1M ganador, 10 k entry

		
		
		ArrayList<Torneo> torneoList = new ArrayList<Torneo>();
		
		torneoList.add(Torneo1);
		torneoList.add(Torneo2);
		torneoList.add(Torneo3);
		torneoList.add(Torneo4);
		torneoList.add(Torneo5);
		torneoList.add(Torneo6);
		torneoList.add(Torneo7);
		torneoList.add(Torneo8);
		
		

		// Crear marcadores vacíos para cada jugador
		Marcador M1 = new Marcador(AM, 0, 0, 0, 0, 0, 0,null,0);
		Marcador M2 = new Marcador(JP, 0, 0, 0, 0, 0, 0,null,0);
		Marcador M3 = new Marcador(RM, 0, 0, 0, 0, 0, 0,null,0);
		Marcador M4 = new Marcador(JM, 0, 0, 0, 0, 0, 0,null,0);
		Marcador M5 = new Marcador(VS, 0, 0, 0, 0, 0, 0,null,0);
		Marcador M6 = new Marcador(AnaM, 0, 0, 0, 0, 0, 0,null,0);
		Marcador M7 = new Marcador(LM, 0, 0, 0, 0, 0, 0,null,0);
		Marcador M8 = new Marcador(LB, 0, 0, 0, 0, 0, 0,null,0);
		Marcador M9 = new Marcador(MH, 0, 0, 0, 0, 0, 0,null,0);
		
		
		
		ArrayList<Marcador> playersListFile = new ArrayList<Marcador>();
		ArrayList<Estadisticas> estadisticasLista = new ArrayList<Estadisticas>();
		
		MazoCartas BarajaEPT = new MazoCartas();
		
		PokerData GFEPT = new PokerData( Torneo1, M1, M2, BarajaEPT);
		
		PokerData WSOP = new PokerData( Torneo2, M1, M3, BarajaEPT);

		PokerData WPT = new PokerData( Torneo3, M1, M4, BarajaEPT);
		
		PokerData BCNEPT = new PokerData( Torneo4, M1, M5, BarajaEPT);
		
		PokerData HollywoodWPT = new PokerData( Torneo6, M1, M6, BarajaEPT);
		
		PokerData LONDONEPT = new PokerData( Torneo5, M7, M8, BarajaEPT);

		PokerData MacaoWPT = new PokerData( Torneo7, M1, M9, BarajaEPT);
		
		PokerData HorseWPT = new PokerData( Torneo8, M3, M4, BarajaEPT);

		//
		int opcionWhile = 0;
		int opcioPrograma = 0;
		Scanner s = new Scanner(System.in);
		//
		while(opcionWhile==0) {
			MegaDash.mostrarGuions();
			System.out.println("opció 0 fi del programa");
			System.out.println("opció 1 EPT de Montecarlo");
			System.out.println("opció 2 WSOP Main Event");
			System.out.println("opció 3 WPT High Roller");
			System.out.println("opció 4 EPT de Barcelona");
			System.out.println("opció 5 WPT Hollywood");
			System.out.println("opció 6 EPT de Londres");
			System.out.println("opció 7 WPT de Macao");
			System.out.println("opció 8 WSOP H.O.R.S.E. Event ");
			System.out.println("opció 9 Calcular estadísticas");
			System.out.println("opció 10 Lista de jugadores");
			System.out.println("opció 11 Lista de torneos");

			opcioPrograma = Integer.parseInt(s.nextLine());
			switch (opcioPrograma) {

				case 1: {
					System.out.println("Program 1");
					System.out.println("");
					
					GFEPT.AllInFestival();
					
					
					break;
				}
				case 2: {
					System.out.println("Program 2");
					System.out.println("");
					
					WSOP.AllInFestival();
					
					
					break;
				}
				case 3: {
					System.out.println("Program 3");
					System.out.println("");
					
					WPT.AllInFestival();
					
					
					break;
				}
				case 4: {
					System.out.println("Program 6");
					System.out.println("");
					
					BCNEPT.AllInFestival();
				
					
					break;
				}
				case 5: {
					System.out.println("Program 7");
					System.out.println("");
					
					HollywoodWPT.AllInFestival();
					
					
					break;
				}
				case 6: {
					System.out.println("Program 7");
					System.out.println("");
					
					LONDONEPT.AllInFestival();
					
					
					break;
				}
				case 7: {
					System.out.println("Program 7");
					System.out.println("");
					
					MacaoWPT.AllInFestival();
					
					
					break;
				}
				case 8: {
					System.out.println("Program 8");
					System.out.println("");
					
					HorseWPT.AllInFestival();
					
					
					break;
				}
				case 9: {
					System.out.println("Program 9");
					System.out.println("Estadísticas de jugadores");
					
					playersListFile=MegaFile.readObjetcs("pokerData.txt");
					
					estadisticasLista=MegaCore.estadisticasListV2(playersListFile);
					
					MegaCore.calcularEstadisticas(playersListFile,estadisticasLista);
					
					MegaCore.listaEstadistica(estadisticasLista);
					
					break;
				}
				case 10: {
					System.out.println("Program 10");
					System.out.println("Players List");
					
					for (Jugadores j : playersList) {
						System.out.println(j.toString());
					}
					break;}
				case 11: {
					System.out.println("Program 11");
					System.out.println("Tournament List");
					
					for (Torneo t : torneoList) {
						System.out.println(t.toString());
					}
					break;}
			
			}
	
		}
	}
}
	