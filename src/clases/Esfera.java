package clases;

/**
 * Clase donde se guarda toda la información relevante de una esfera
 * 
 * @author earnesto
 */
public class Esfera {

	/**
	 * Radio de la esfera
	 */
	double radio = 1.0;

	public Esfera() {
		super();
	}

	public Esfera(double radio) {
		super();
		this.radio = radio;
	}

	/**
	 * Esta funcion devuelve la superficie de una esfera
	 * 
	 * @return La superficie de una esfera
	 */
	public double superficie() {
		double superficie = 4 * Math.PI * Math.pow(radio, 2);
		return superficie;
	}

	/**
	 * Esta funcion devuelve el volumen de una esfera
	 * 
	 * @return El volumen de una esfera
	 */
	public double volumen() {
		double volumen = (4 * Math.PI / 3) * Math.pow(radio, 3);
		return volumen;
	}
}
