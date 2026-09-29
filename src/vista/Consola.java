package vista;

import java.util.Scanner;

public class Consola {

	public void mostrarMatriz(String[][] matriz, int filas, int columnas) {
		for(int filaActual = 0; filaActual < filas; filaActual++) {
			for(int columnaActual = 0; columnaActual < columnas; columnaActual++) {
				System.out.print(matriz[filaActual][columnaActual] + "  ");
			}
			System.out.println();
		}
	}

	public String pidePosicion(int filas, int columnas) {
		
		Scanner teclado = new Scanner(System.in);
		
		int filaSolicitada = -1;
		int columnaSolicitada = -1;
		
		do {
			System.out.print("\nEscribe la fila: ");
			filaSolicitada = teclado.nextInt();
			System.out.print("Escribe la columna: ");
			columnaSolicitada = teclado.nextInt();
			
			if(filaSolicitada < 1 || filaSolicitada > filas) {
				System.out.println("La fila debe estar entre 1 y " + filas);
			}
			if(columnaSolicitada < 0 || columnaSolicitada > columnas) {
				System.out.println("La columna debe estar entre 1 y " + filas);
			}
			
		}while(filaSolicitada < 1 || filaSolicitada > filas || columnaSolicitada < 0 || columnaSolicitada > columnas);
		
		return filaSolicitada + "-" + columnaSolicitada;
	}

	public boolean comprobacionVictoria(String posicionAleatoria, String posicionSolicitada, int oportunidades) {
		boolean victoria = false;
		if(posicionAleatoria.equals(posicionSolicitada)) {
			System.out.println("HAS GANADO");
			victoria = true;
		}else {
			if(oportunidades > 0) {
				System.out.println("OH, NO! TE QUEDAN " + oportunidades + " OPORTUNIDADES\n");
			}else {
				System.out.println("HAS PERDIDO");
			}
		}
		return victoria;
	}

}
