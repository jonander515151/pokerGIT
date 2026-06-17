package megaCore;

import java.util.ArrayList;

public class MegaDash {

	public static void showMenuOptions() {
		
		System.out.println("option 1 - execute Kona ");
		System.out.println("option 2 - execute European Champ ");
		System.out.println("option 3 - execute Gold Coast");
		System.out.println("option 4 - execute Orihuela 90.0");
		System.out.println("option 5 - execute Pontevedra");
		System.out.println("option 6 - execute Valencia 2024 ");
		System.out.println("option 7 - execute Valencia 2025  ");
		System.out.println("option 8 - execute all Championships ");
		
		System.out.println("option 9 -  ");
		System.out.println("option 10 -  show all List ");
		System.out.println("option 11 -   ");
		System.out.println("option 12 -  show winners List ");
		System.out.println("option 13 -  order list by distance ");
		System.out.println("option 14 -  champs at least 1 championship ");
		System.out.println("option 15 -  show results by name, distance and time ");
		System.out.println("option 16 -  clasificacion mundial por puntos all time ");
		
	}
	
	public static void mostrarGuions() {
		String guion = "-";
		String guionRepeat =guion.repeat(70);
		System.out.println(guionRepeat);
	}
	
	public static void mostrarBarres() {
		String guion = "/";
		String guionRepeat =guion.repeat(70);
		System.out.println(guionRepeat);
	}
	
	public static void mostrarAsteric() {
		String guion = "*";
		String guionRepeat =guion.repeat(70);
		System.out.println(guionRepeat);
	}
	
	public static <T> void mostrarLista(ArrayList<T> lista) {
	    for (T elemento : lista) {
	        System.out.println(elemento.toString());
	    }
	    mostrarGuions();
	}
	
	
	
	public static void retrasar1seg() {
		//Retraso de 1 segundo entre golpe y golpe
		try {
		Thread.sleep(1000);
		} catch (InterruptedException e) {
		e.printStackTrace();
		}
	}
	

	public static void retrasar5seg() {
		//Retraso de 1 segundo entre golpe y golpe
		try {
		Thread.sleep(3000);
		} catch (InterruptedException e) {
		e.printStackTrace();
		}
	}
	
}
