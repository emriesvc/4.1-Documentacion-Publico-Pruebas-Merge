package calculadora;

/**
 * Clase producto que se utiliza para realizar operaciones aritmétricas de multiplicación
 * @author Rafa
 * @version 1.0
 * @since 1.0
 */
public class Producto {

	/**
	 * Función que recibe como parámetros dos números reales y devuelve su producto
	 * @param a primer producto real
	 * @param b segundo producto real
	 * @return el resultado del producto de los dos números
	 * @version 1.0
	 */
	public float dosReales(float a, float b) {
		return a*b;
	}
	
	public int dosEnteros(int a, int b) {
		return a*b;
	}
	
	public float tresReales(float a, float b, float c) {
		return a*b*c;
	}
	
	public double potencia(double base, double exponente) {
		return Math.pow(base, exponente);
	}
}
