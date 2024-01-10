package clases;

import java.util.Random;

/**
 * En la clase Aleatorios generamos numeros aleatorios
 * 
 * @author earnesto
 */
public class Aleatorios {

	/**
	 * Generamos la cantidad de numeros aleatorios especificada por el parametro de
	 * entrada
	 * 
	 * @param cantidad  Cantidad, introducida por parámetros, de numeros aleatorios
	 *                  que debe de devolver
	 * @param aleatorio Variable donde se guarda el número aleatorio generado
	 */
	public static void numerosAletorios(int cantidad) {
		double aleatorio;

		for (int i = 1; i <= cantidad; i++) {
			aleatorio = Math.random();
			System.out.println(aleatorio);
		}
	}

	/**
	 * Crea una cantidad de números aleatorios especificada por un parámetro de
	 * entrada
	 * 
	 * @param cantidad  Cantidad, introducida por parametros, de numeros aleatorios
	 *                  que debe de devolver
	 * @param max       Valor maximo introducido por parametros que debe de alcanzar
	 *                  un número aleatorio
	 * @param aleatorio Variable donde se guarda el número aleatorio generado
	 */
	public static void numerosAleatorios(int cantidad, int max) {
		int aleatorio;

		for (int i = 1; i <= cantidad; i++) {
			aleatorio = (int) Math.random() * max;
			System.out.println(aleatorio);
		}
	}

	/**
	 * Crea una cantidad de números aleatorios especificada por un parámetro de
	 * entrada
	 * 
	 * @param cantidad  Cantidad, introducida por parametros, de numeros aleatorios
	 *                  que debe de devolver
	 * @param maximo    Valor maximo introducido por parametros que debe de alcanzar
	 *                  un número aleatorio
	 * @param minimo    Valor minimo introducido por parametros que debe de alcanzar
	 *                  un número aleatorio
	 * @param aleatorio Variable donde se guarda el número aleatorio generado
	 */
	public static void numerosAleatorios(int cantidad, int minimo, int maximo) {
		int aleatorio;
		Random rand = new Random();
		for (int i = 1; i <= cantidad; i++) {
			aleatorio = rand.nextInt(minimo, maximo + 1);
			System.out.println(aleatorio);
		}
	}
}
