package clases;

/**
 * @author earnesto
 */
public class Esfera {
	
	/**
	 * @param radio Radio de la esfera
	 */
	double radio = 1.0;
	
	/**
	 * 
	 */
	public Esfera() {
		super();
	}

	/**
	 * 
	 * @param radio
	 */
	public Esfera(double radio) {
		super();
		this.radio = radio;
	}
	
	/**
	 * 
	 * @return
	 */
	public double superficie() {
		double superficie = 4*Math.PI*Math.pow(radio, 2);		
		return superficie;
	}
	
	/**
	 * 
	 * @return
	 */
	public double volumen() {
		double volumen = (4*Math.PI/3) * Math.pow(radio, 3);
		return volumen;
	}
}
