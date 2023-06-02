package ual.hmis.sesion05.ejercicio4;

public class Diagonales {
	/**
	 * Obtiene ambas diagonales de una matriz, y crea una matriz con ellas.
	 * @param matriz - int
	 * @return matriz con las diagonales de la matriz del parámetro
	 */
	public static int[][] obtenerDiagonales(int[][] matriz) {
		
		int[][] diagonales = new int[2][matriz.length];
		
		for(int i = 0, j = 0; i < matriz.length; i++, j++) {
			diagonales[0][i] = matriz[i][j];
			diagonales[1][j] = matriz[i][matriz[i].length - j - 1];
		}
		
		return diagonales;
	}
	
	/**
	 * Suma las columnas de una matriz
	 * @param matriz
	 * @return array con la suma de cada columna en su respectivo índice.
	 */
	public static double[] sumarColumnas(double[][] matriz) {
		double[] sumas = new double[matriz.length];
		
		for(int i = 0; i < sumas.length; i++) {
			double sumaTemp = 0;
			for(int j = 0; j < matriz[i].length; j++) {
				sumaTemp += matriz[j][i];
			}
			sumas[i] = sumaTemp;
		}
		
		return sumas;
	}
}
