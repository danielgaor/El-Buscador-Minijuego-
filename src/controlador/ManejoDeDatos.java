package controlador;

import java.util.Random;

public class ManejoDeDatos {

	public String[][] cargarMatriz(int filas, int columnas) {
		String[][] matrizLLena = new String[filas][columnas];
		
		for(int filaActual = 0; filaActual < filas; filaActual++) {
			for(int columnaActual = 0; columnaActual < columnas; columnaActual++) {
				String posicionActual = (filaActual+1) + "-" + (columnaActual+1);
				matrizLLena[filaActual][columnaActual] = posicionActual;
			}
		}
		
		return matrizLLena;
	}

	public String generarPosicion(int filas, int columnas) {
		Random posicion = new Random();
		
		int fila = posicion.nextInt(1,filas+1);
		int columna = posicion.nextInt(1,columnas+1);
		
		return fila + "-" + columna;
	}

	public void actualizarMatriz(String[][] matriz, int filas, int columnas, String posicionSolicitada) {
		for(int filaActual = 0; filaActual < filas; filaActual++) {
			for(int columnaActual = 0; columnaActual < columnas; columnaActual++) {
				String posicionActual = (filaActual+1) + "-" + (columnaActual+1);
				
				if(posicionActual.equals(posicionSolicitada)) {
					matriz[filaActual][columnaActual] = "MAL";
				}
				
			}
		}
	}
}