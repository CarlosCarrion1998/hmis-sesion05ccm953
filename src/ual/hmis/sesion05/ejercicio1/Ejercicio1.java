package ual.hmis.sesion05.ejercicio1;

/**
 * @author Carlos
 */
public class Ejercicio1{
	/**
	 * Método que transforma un número de entrada hasta que no sea divisible por 2, 3 y 5.
	 * @param x - Número de entrada
	 * @return Número indivisible por 2, 3, 5
	 */
	public int transformar (int x) {
		int resultado = 0;
		if (x % 2 == 0) // % Resto de una división entre enteros (mod)
			resultado = transformar (x/2);
		else if (x % 3 == 0)
			resultado = transformar (x/3);
		else if (x % 5 == 0)
			resultado = transformar (x/5);
		else return x;
		return resultado;
	}
}
