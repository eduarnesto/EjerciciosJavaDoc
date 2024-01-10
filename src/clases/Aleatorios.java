package clases;

import java.util.Random;

/**
 * 
 * @author earnesto
 */
public class Aleatorios {

	/**
	 * 
	 * @param cantidad
	 */
	public static void numerosAletorios(int cantidad) {
		double aleatorio;

		for (int i = 1; i <= cantidad; i++) {
			aleatorio = Math.random();
			System.out.println(aleatorio);
		}
	}

	/**
	 * 
	 * @param cantidad
	 * @param max
	 */
	public static void numerosAleatorios(int cantidad, int max) {
		int aleatorio;

		for (int i = 1; i <= cantidad; i++) {
			aleatorio = (int) Math.random() * max;
			System.out.println(aleatorio);
		}
	}

	/**
	 * 
	 * @param cantidad
	 * @param minimo
	 * @param maximo
	 */
	public static void numerosAleatorios(int cantidad, int minimo, int maximo) {
		int aleatorio;
		Random rand = new Random();
		for(int i=1; i<=cantidad; i++) {
			aleatorio = rand.nextInt(minimo, maximo+1);
			System.out.println(aleatorio);
		}
	}
}
