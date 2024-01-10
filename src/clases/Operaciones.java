package clases;

/**
 * 
 */
public class Operaciones {
	
	/**
	 * @param num1 Variable para el numero 1
	 */
	double num1;
	
	/**
	 * @param num2 Variable para el numero 2
	 */
	double num2;

	/**
	 * 
	 */
	public Operaciones() {
		
	}

	/**
	 * 
	 * @param num1
	 * @param num2
	 */
	public Operaciones(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	/**
	 * 
	 * @return
	 */
	public double suma() {
		return num1+num2;
	}
	
	/**
	 * 
	 * @return
	 */
	public double resta() {
		return num1-num2;
	}
	
	/**
	 * 
	 * @return
	 */
	public double multiplicacion() {
		return num1*num2;
	}
	
	/**
	 * 
	 * @return
	 */
	public double division() {
		double res = 0;
		
		if(num2 != 0) {
			res = num1/num2;
		} 
		return res;
	}
	
	/**
	 * 
	 * @return
	 */
	public double max() {
		return num1>num2 ? num1 : num2; 
	}
	
	/**
	 * 
	 * @return
	 */
	public double min() {
		return num1<num2 ? num1 : num2; 
	}
}
