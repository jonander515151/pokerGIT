package megaCore;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import models.PokerData;
import models.Jugadores;
import models.Marcador;

public class MegaFile {

	
	public static void writeSimple(String dato,
			String fileName) {
		File archivo = new File(fileName);
		
		try {
			
			FileWriter file = new FileWriter(archivo,true);
			file.write(dato);
			file.write("\n");
			file.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	public static void readSimple(String fileName) {
		
		File archivo = new File(fileName);
		
		try {
			int contadorLineas = 0;
			Scanner sc = new Scanner(archivo);
			while(sc.hasNext()) {
				contadorLineas++;
				System.out.println("contador lineas: "+contadorLineas);
				String linea = sc.nextLine();
				System.out.println(linea);
				
			}
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static ArrayList<Marcador> readObjetcs(String fileName) throws FileNotFoundException {
		
		File archivo = new File(fileName);
		ArrayList<Marcador> listaDatos = new ArrayList<>();
		
				
				
			Scanner sc = new Scanner(archivo);
			int contadorLineas = 0;
			int contadorResto = 0;
			//mira si hay lineas sin leer
			while(sc.hasNext()) {
				//el pedido son 7 lineas
				//utilizo el resto para leer del 0 al 6
				//System.out.println("contador lineas: "+contadorLineas);
				//lee la cabecera
				try {
					
						String linea = sc.nextLine();
						String[] datos = linea.split(",");
						//System.out.println(Arrays.toString(datos));
						
						Jugadores j = new Jugadores(datos[0], datos[1], datos[2], Integer.parseInt(datos[3]));
						
						Marcador m = new Marcador(j,
								Integer.parseInt(datos[4]),Integer.parseInt(datos[5]),Integer.parseInt(datos[6]),Integer.parseInt(datos[7]),
								Integer.parseInt(datos[8]),Integer.parseInt(datos[9]),datos[10],Integer.parseInt(datos[11]));
						
						
						listaDatos.add(m);
					
				
				}
				catch (NumberFormatException e) {
					e.printStackTrace();// TODO: handle exception
				}
				catch (IndexOutOfBoundsException e) {
					e.printStackTrace();// TODO: handle exception
				}
				//cuento al final para empezar en 0
				contadorLineas++;
				//System.out.println(contadorLineas);
			}
			
		
		return listaDatos;
		
		
	}
	
	
	
	
}
