package ual.hmis.sesion05.ejercicio1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class TestEjercicio1 {

	@ParameterizedTest (name = "{index} => {0}")
	@CsvSource ({" 30, 1 "})
	void testTransformar(int num, int esperado) {
		Ejercicio1 transformador = new Ejercicio1();
		int resultado = transformador.transformar(num);
		assertEquals(resultado, esperado);
	}

}
