package calculadora;

/**
 * Esta clase proporciona métodos para realizar operaciones de suma.
 * @author Alejandro Galán Herrera
 * @version 0.1
 * @since 19/04/2024
 */
public class Suma {
	
	/**
	 * El valor acumulado de la suma.
	 */
	public float valorAcumulado;
	
	/**
	 * Obtiene el valor acumulado de la suma.
	 * @return el valor acumulado de la suma.
	 */
	public float getValorAcumulado() {
		return valorAcumulado;
	}

	/**
	 * Establece el valor acumulado de la suma.
	 * @param valorAcumulado el nuevo valor acumulado de la suma.
	 */
	public void setValorAcumulado(float valorAcumulado) {
		this.valorAcumulado = valorAcumulado;
	}
	
	/**
	 * Realiza la suma de dos números reales.
	 * @param a el primer número.
	 * @param b el segundo número.
	 * @return la suma de los dos números.
	 */
	public float dosReales(float a, float b) {
		return a + b;
	}
	
	/**
	 * Realiza la suma de dos números enteros.
	 * @param a el primer número.
	 * @param b el segundo número.
	 * @return la suma de los dos números.
	 */
	public int dosEnteros(int a, int b) {
		return a + b;
	}
	
	/**
	 * Realiza la suma de tres números reales.
	 * @param a el primer número.
	 * @param b el segundo número.
	 * @param c el tercer número.
	 * @return la suma de los tres números.
	 */
	public float tresReales(float a, float b, float c) {
		return a + b + c;
	}
	
	/**
	 * Realiza la suma de un número real con el valor acumulado.
	 * @param a el número a sumar al valor acumulado.
	 * @return el nuevo valor acumulado.
	 */
	public float sumaAcumulado(float a) {
		valorAcumulado = a + valorAcumulado;
		return valorAcumulado;
	}
}



