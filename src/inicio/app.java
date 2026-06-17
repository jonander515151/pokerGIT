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

public class app {

	public static void main(String[] args) throws FileNotFoundException {

		// Crear jugadores
		Jugadores AM = new Jugadores("Adrián Mateos", "España", "Hombre", 32);
		Jugadores JP  = new Jugadores("Juan Pastor",  "España", "Hombre", 52);
		Jugadores RM  = new Jugadores("Raúl Martínez",  "España", "Hombre", 44);
		Jugadores JM  = new Jugadores("Juan Maceiras",  "España", "Hombre", 37);
		
		// Crear torneo
		Torneo Torneo1 = new Torneo("Gran Final de Mónaco","EPT",50000,250000,5000);
		
		Torneo Torneo2 = new Torneo("Main Event WSOP","WSOP",100000,1000000,10000);

		Torneo Torneo3 = new Torneo("High Roller World Poker Tour","WPT",100000,10000000,500000);
		
		// Crear marcadores vacíos para cada jugador
		Marcador M1 = new Marcador(AM, 0, 0, 0, 0, 0, 0,null,0);
		Marcador M2 = new Marcador(JP, 0, 0, 0, 0, 0, 0,null,0);
		Marcador M3 = new Marcador(RM, 0, 0, 0, 0, 0, 0,null,0);
		Marcador M4 = new Marcador(JM, 0, 0, 0, 0, 0, 0,null,0);
		
		ArrayList<Marcador> playersList = new ArrayList<Marcador>();
		playersList.add(M1);
		playersList.add(M2);
		playersList.add(M3);
		playersList.add(M4);
		
		ArrayList<Marcador> playersListFile = new ArrayList<Marcador>();
		ArrayList<Estadisticas> estadisticasLista = new ArrayList<Estadisticas>();
		
		MazoCartas BarajaEPT = new MazoCartas();
		
		PokerData GFMon = new PokerData( Torneo1, M1, M2, BarajaEPT);
		
		PokerData WSOP = new PokerData( Torneo2, M1, M3, BarajaEPT);

		PokerData WPT = new PokerData( Torneo3, M1, M4, BarajaEPT);
		//
		int opcionWhile = 0;
		int opcioPrograma = 0;
		Scanner s = new Scanner(System.in);
		//
		while(opcionWhile==0) {
			MegaDash.mostrarGuions();
			System.out.println("opció 0 fi del programa");
			System.out.println("opció 1 EPT de montecarlo");
			System.out.println("opció 2 WSOP Main Event");
			System.out.println("opció 3 WPT High Roller");
			System.out.println("opció 4 Lista de jugadores");
			System.out.println("opció 5 Leer archivo");
			System.out.println("opció 6 Calcular jugadores");
			System.out.println("opció 7 Calcular estadísticas");
			opcioPrograma = Integer.parseInt(s.nextLine());
			switch (opcioPrograma) {

				case 1: {
					System.out.println("Program 1");
					System.out.println("");
					
					GFMon.AllInFestival();
					
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
					System.out.println("Program 4");
					System.out.println("Players List");
					
					for (Marcador j : playersList) {
						System.out.println(j.toString());
					}}
				case 5: {
					System.out.println("Program 5");
					System.out.println("Reading File");
					
					playersListFile=MegaFile.readObjetcs("pokerData.txt");
					
					for (Marcador m : playersListFile) {
						System.out.println(m.toString());
					}
					
					
					break;
				}
				case 6: {
					System.out.println("Program 6");
					System.out.println("Reading File");
					
					estadisticasLista=MegaCore.estadisticasListV2(playersListFile);
					
					for (Estadisticas e : estadisticasLista) {
						System.out.println(e.toString());
					}
					
					
					break;
				}
				case 7: {
					System.out.println("Program 7");
					System.out.println("Estadísticas");
					
					MegaCore.calcularEstadisticas(playersListFile,estadisticasLista);
					
					for (Estadisticas e : estadisticasLista) {
						System.out.println(e.toString());
					}
					
					
					break;
				}
			}
	
		}
	}
}
	