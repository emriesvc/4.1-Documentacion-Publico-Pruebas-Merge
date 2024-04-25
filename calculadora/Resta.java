package calculadora;
/**
 * @author Francisco Javier Arenas Diaz
 * @version 1.0
 * @since 19/04/2024
 * @see calculadora
 * La clase Resta proporciona métodos para realizar operaciones de resta y gestionar un valor acumulado.
 */
public class Resta {
	/** El valor acumulado que se utiliza en algunas operaciones. */
	public float valorAcumulado;

	/**
	 * Obtiene el valor acumulado actual.
	 * @return El valor acumulado actual.
	 */
	public float getValorAcumulado() {
		return valorAcumulado;
	}

	/**
	 * Establece el valor acumulado.
	 * @param valorAcumulado El nuevo valor acumulado a establecer.
	 */
	public void setValorAcumulado(float valorAcumulado) {
		this.valorAcumulado = valorAcumulado;
	}

	/**
	 * Resta dos números reales.
	 * @param a El primer número.
	 * @param b El segundo número.
	 * @return La resta de los dos números.
	 */
	public float dosReales(float a, float b) {
		return a - b;
	}

	/**
	 * Resta dos números enteros.
	 * @param a El primer número.
	 * @param b El segundo número.
	 * @return La resta de los dos números.
	 */
	public int dosEnteros(int a, int b) {
		return a - b;
	}

	/**
	 * Resta tres números reales.
	 * @param a El primer número.
	 * @param b El segundo número.
	 * @param c El tercer número.
	 * @return La resta de los tres números.
	 */
	public float tresReales(float a, float b, float c) {
		return a - b - c;
	}

	/**
	 * Resta un número al valor acumulado.
	 * @param a El número a restar del valor acumulado.
	 * @return El nuevo valor acumulado después de la resta.
	 */
	public float restaAcumulado(float a) {
		valorAcumulado = valorAcumulado - a;
		return valorAcumulado;
	}
}