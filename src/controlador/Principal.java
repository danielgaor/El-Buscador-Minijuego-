package controlador;

import vista.Consola;

public class Principal {

	public final static int filas=4;
	public final static int columnas=4;
	
	public static void main(String[] args) {
		ManejoDeDatos datos = new ManejoDeDatos();
		Consola mostrarAlUsuario = new Consola();
		
		int oportunidades = 4;
		boolean victoria = false;
		String[][] matriz = datos.cargarMatriz(filas, columnas);				
		String posicionAleatoria = datos.generarPosicion(filas, columnas);
		String posicionSolicitada = null;
		
		do {
			mostrarAlUsuario.mostrarMatriz(matriz, filas, columnas);
			posicionSolicitada = mostrarAlUsuario.pidePosicion(filas, columnas);
		
			victoria = mostrarAlUsuario.comprobacionVictoria(posicionAleatoria, posicionSolicitada, oportunidades);
			if(!victoria) {
				oportunidades--;
				datos.actualizarMatriz(matriz, filas, columnas, posicionSolicitada);
			}
		} while(!victoria && oportunidades>=0);
	}

}