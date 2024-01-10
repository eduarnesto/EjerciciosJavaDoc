package clases;

/**
 * Clase donde se guarda toda la informacion relevante de las operaciones
 * 
 * @author earnesto
 */
public class Operaciones {

	/**
	 * Variable para el numero 1
	 */
	double num1;

	/**
	 * Variable para el numero 2
	 */
	double num2;

	public Operaciones() {

	}

	public Operaciones(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	/**
	 * Esta funcion devuelve la suma de los dos números
	 * 
	 * @return Suma de los dos números
	 */
	public double suma() {
		return num1 + num2;
	}

	/**
	 * Esta funcion devuelve la resta de los dos números
	 * 
	 * @return Resta de los dos números
	 */
	public double resta() {
		return num1 - num2;
	}

	/**
	 * Esta funcion devuelve la multiplicacion de los dos números
	 * 
	 * @return Multiplicacion de los dos números
	 */
	public double multiplicacion() {
		return num1 * num2;
	}

	/**
	 * Esta funcion devuelve la division de los dos números
	 * 
	 * @return Division de los dos números
	 */
	public double division() {
		double res = 0;

		if (num2 != 0) {
			res = num1 / num2;
		}
		return res;
	}

	/**
	 * Esta funcion devuelve el maximo de los dos números
	 * 
	 * @return Maximo de los dos numeros
	 */
	public double max() {
		return num1 > num2 ? num1 : num2;
	}

	/**
	 * Esta funcion devuelve el minmo de los dos números
	 * 
	 * @return Minimo de los dos números
	 */
	public double min() {
		return num1 < num2 ? num1 : num2;
	}
}
