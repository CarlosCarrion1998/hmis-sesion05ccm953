package ual.hmis.sesion05.ejercicio4;

public class Diagonales {
	public static int[][] obtenerDiagonales(int[][] matriz) {
		
		int[][] diagonales = new int[2][matriz.length];
		
		for(int i = 0, j = 0; i < matriz.length; i++, j++) {
			diagonales[0][i] = matriz[i][j];
			diagonales[1][j] = matriz[i][matriz[i].length - j - 1];
		}
		
		return diagonales;
	}
	
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
