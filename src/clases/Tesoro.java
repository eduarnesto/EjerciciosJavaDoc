package clases;

import java.util.Random;

/**
 * Clase donde se guarda toda la informacion relevante con el tesoro
 * 
 * @author earnesto
 */
public class Tesoro {
	/**
	 * Constante para el tamaño del tablero
	 */
	public static final int TAM_TABLERO = 5;

	/**
	 * Variable para la posicion x del tesoro
	 */
	static int xTesoro;

	/**
	 * Variable para la posicion y del tesoro
	 */
	static int yTesoro;

	/**
	 * Variable para la posicion x del jugador
	 */
	int xJugador = 1;

	/**
	 * Variable para la posicion y del jugador
	 */
	int yJugador = 1;

	/**
	 * Esta función asigna valores aleatorios a la posicion del tesoro
	 */
	static void generaPosicionTesoro() {
		Random rand = new Random();
		xTesoro = rand.nextInt(1, TAM_TABLERO + 1);
		yTesoro = rand.nextInt(1, TAM_TABLERO + 1);
	}

	/**
	 * Esta funcion imprime el tablero
	 */
	void pintaTablero() {
		// Imprimimos la primera línea de números
		for (int i = 1; i <= TAM_TABLERO; i++) {
			System.out.print("\t" + i);
		}

		// Salto de línea para comenzar con los números de la izquierda
		System.out.println();

		// Bucle para imprimir las líneas
		for (int i = 1; i <= TAM_TABLERO; i++) {
			// Imprimimos el número de línea
			System.out.print(i);
			// Si la línea coincide con la posición X del jugador
			if (xJugador == i) {
				/// Imprimimos tantos tabuladores como posición Y del jugador
				for (int j = 1; j <= yJugador; j++) {
					System.out.print("\t");
				}
				// Imprimimos la ficha del jugador
				System.out.print("J");
			}
			// Salto de línea para pasar a la siguiente línea
			System.out.println();
		}
	}

	/**
	 * Esta funcion hace que el jugador se mueva
	 * 
	 * @param movimiento Movimiento que debe de realizar el jugador
	 * @return Deevuleve -1 si la acción no se puede hacer, -2 si la acción no es
	 *         una de las cuatro opciones u si es valida cambia la posicion del
	 *         jugador dependiendo del movimiento elegido
	 */
	int mueveJugador(String movimiento) {
		int res = 0;
		String movMinuscula = movimiento.toLowerCase();

		switch (movMinuscula) {
		case "arriba":
			if (xJugador - 1 < 1) {
				res = -1;
			} else {
				xJugador--;
			}
			break;
		case "abajo":
			if (xJugador + 1 > TAM_TABLERO) {
				res = -1;
			} else {
				xJugador++;
			}
			break;
		case "izquierda":
			if (yJugador - 1 < 1) {
				res = -1;
			} else {
				yJugador--;
			}
			break;
		case "derecha":
			if (yJugador + 1 > TAM_TABLERO) {
				res = -1;
			} else {
				yJugador++;
			}
			break;
		default:
			res = -2;
			break;
		}

		return res;
	}

	/**
	 * Comprueba si la posicion del tesoro y del jugador es la misma
	 * 
	 * @return Regresa si se ha encontrado el tesoro o no
	 */
	boolean buscaTesoro() {
		boolean res = false;
		if (xTesoro == xJugador && yTesoro == yJugador) {
			res = true;
		}
		return res;
	}
}
