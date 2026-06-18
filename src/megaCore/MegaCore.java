package megaCore;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import models.Estadisticas;
import models.Marcador;
import models.MatchData;
import models.PlayerInfo;


public class MegaCore {

	// 9 Record historico
		public static void numberRafaNadal(ArrayList<MatchData> listaMD) {

			int contadorRondas = 0;
			
			for (MatchData md : listaMD) {
				if(md.getPlayerA().getName().equals("Rafa Nadal")) {
					contadorRondas++;
				}
				else if(md.getPlayerB().getName().equals("Rafa Nadal")) {
					contadorRondas++;
				}
			}
			
			System.out.println("Número de partidos de Rafa Nadal: ");
			System.out.println(contadorRondas);
			
		}
	
		public static MatchData longestPoint(ArrayList<MatchData> listaMD) {

			MatchData longestMD = new MatchData(null, null, null, null);
			
			int contadorLP = 0;
			
			for (MatchData md : listaMD) {
				if(md.getEstatistics().getLongestPoint()>contadorLP) {
					contadorLP=md.getEstatistics().getLongestPoint();
					longestMD=md;
			}
			
		}
			System.out.println("Longest point "+contadorLP);
			
			System.out.println("Partido con el longest point ");
			System.out.println(longestMD.toString());
			
			return longestMD;
		}
	
		public static void davisCupCourts(ArrayList<MatchData> listaMD) {

			int contadorRondas = 0;
			ArrayList<String> listaVenues = new ArrayList<String>();

			for (MatchData md : listaMD) {
				if(md.getEstadium().getChampionship().equals("Davis Cup")) {
					listaVenues.add(md.getEstadium().getCourt());
				}
				
			}
			
			System.out.println("Sedes de la Davis Cup: ");
			for (String court : listaVenues) {
				System.out.println(court);
			}
			
		}
		
		public static void listaEstadistica(ArrayList<Estadisticas> listaE) {

			
			for (Estadisticas e : listaE) {
				System.out.println(e.getJugador());
				System.out.println(e.toData());
				MegaDash.mostrarGuions();
			}
			
		}
		
		public static ArrayList<Estadisticas>  estadisticasListV2(ArrayList<Marcador> listaMarc) {
			
			
			int contadorRondas = 0;
			//ArrayList<PlayerInfo> PlayerIL = new ArrayList<>();
			ArrayList<Estadisticas> estadisticasPlayer = new ArrayList<>();
			
			String nombreSR = "";
			String nombreMarcador = "";
			
			int valorRepetido = 0;//10 es que repite
			int contadorJugadores = 0;

			//A
			for (Marcador marc : listaMarc) {
				valorRepetido=0;
				nombreMarcador = marc.getJugador().getNombre();
				//nombreMDB = md.getPlayerB().getName();
				//recorro la lista para ver si está
				for (Estadisticas e : estadisticasPlayer) {
					nombreSR = e.getJugador().getNombre();
					if(nombreSR.equals(nombreMarcador)) {
						valorRepetido=10;
						break;
					}
				}	
				//si no está lo añado
				if(valorRepetido==0) {
					Estadisticas est = new Estadisticas(marc.getJugador(), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
					estadisticasPlayer.add(est);
				}
			}
			
			System.out.println("número de jugadores: "+contadorJugadores);

			return estadisticasPlayer;	
			
		}

		
		public static void  calcularEstadisticas(ArrayList<Marcador> listaMarc, ArrayList<Estadisticas> estadisticasL) {
			//hay que crear una clase nueva, con atleta y el numero de partidos jugados
			//lista de toString
			
			//
			int contadorVictorias = 0;
			int contadorPartidos = 0;

			//recorremos los listaMD para ver los puntos de cada partido
			//anoto victoria en la lista de PlayerInfo, al mismo jugador todas las veces que se repita
			//anotamos tambien los puntos
			for (Marcador m : listaMarc) {
			
				//si han jugado alguna vez tengo que anotar que han jugado
				//tambien añado el tiempo
				for (Estadisticas e : estadisticasL) {
					
					if(m.getJugador().getNombre().equals(e.getJugador().getNombre())) {//coincide el nombre anoto que ha jugado
						
						e.addDescarte(m.getDescarte());
						e.addEmpate(m.getEmpate());
						e.addGanar(m.getGanar());
						e.addMoneyLost(m.getMoneyLost());
						e.addMoneyWin(m.getMoneyWin());
						e.addPerder(m.getPerder());
						e.addRondasN(m.getRondasN());
						
						if(m.getTipoTorneo().equals("EPT") && m.getMoneyWin()>0) {
							
							e.addTipoEPT();
							
						}
						else if(m.getTipoTorneo().equals("WPT") && m.getMoneyWin()>0) {
							
							e.addTipoWPT();
							
						}
						else if(m.getTipoTorneo().equals("WSOP") && m.getMoneyWin()>0) {
							
							e.addTipoWSOP();
							
						}
					
					}
					
					contadorPartidos++;
				}
			}
			
			Collections.sort(estadisticasL);
			Collections.reverse(estadisticasL);
			
			System.out.println("partidos: "+contadorPartidos);

			
		}
		
}
