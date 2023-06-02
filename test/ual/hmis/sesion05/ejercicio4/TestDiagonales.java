package ual.hmis.sesion05.ejercicio4;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TestDiagonales {

	@ParameterizedTest(name = "{index} => Matriz {0}, resultado {1}")
	@CsvSource(value = {"4, 9, 3; 6, 5, 4; 3, 0, 9 | 4, 5, 9; 3, 5, 3"}, delimiter = '|')
	void testDiagonales(String matriz, String esperado) {
		int[][] matrizInt = convertirArrayInt(matriz);
		int[][] esperadoInt = convertirArrayInt(esperado);
		
		int[][] resultado = Diagonales.obtenerDiagonales(matrizInt);
		Assertions.assertArrayEquals(esperadoInt, resultado);
	}
	
	@ParameterizedTest(name = "{index} => Matriz {0}, resultado {1}")
	@CsvSource(value = {"4.3, 9.0, 3.3; 6.5, 5.1, 4.9; 3.2, 0.1, 9.9 | 14.0, 14.2, 18.1"}, delimiter = '|')
	void testSumaColumnas(String matriz, String esperado) {
		double[][] matrizDouble = convertirArrayDouble(matriz);
		
		double[] esperadoDouble = convertirArrayUni(esperado);
		
		double[] resultado = Diagonales.sumarColumnas(matrizDouble);
		
		Assertions.assertArrayEquals(esperadoDouble, resultado);
	}
	
	@Test
	void testInicializar() {
		Diagonales d = new Diagonales();
		assertNotNull(d);
	}
	
	private int[][] convertirArrayInt(String input) {
		String[] filas = input.trim().split(";");
		int[][] matriz = new int[filas.length][];
		for(int i = 0; i < filas.length; i++) {
			String[] valores = filas[i].trim().split(",");
			matriz[i] = new int[valores.length];
			for(int j = 0; j < valores.length; j++) {
				matriz[i][j] = Integer.parseInt(valores[j].trim());
			}
		}
		return matriz;
		
	}
	
	private double[][] convertirArrayDouble(String input) {
		String[] filas = input.trim().split(";");
		double[][] matriz = new double[filas.length][];
		
		for(int i = 0; i < filas.length; i++) {
			String[] valores = filas[i].trim().split(",");
			matriz[i] = new double[valores.length];
			for(int j = 0; j < valores.length; j++) {
				matriz[i][j] = Double.parseDouble(valores[j].trim());
			}
		}
		return matriz;
	}
	
	private double[] convertirArrayUni(String input) {
		String[] valores = input.trim().split(",");
		double[] sumas = new double[valores.length];
		for(int i = 0; i < valores.length; i++) {
			sumas[i] = Double.parseDouble(valores[i]);
		}
		return sumas;
	}

}
