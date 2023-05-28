package ual.hmis.sesion05.ejercicio3;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TestEjercicio3 {

	@ParameterizedTest
	@CsvSource({"pepe", "pepito", "nueveomas"})
	void testEnmascararMenosDeDoce(String pass) {
		Ejercicio3 e3 = new Ejercicio3();
		String enmascarado = e3.enmascarar(pass);
		if(pass.length() < 5) assertEquals(enmascarado, "password demasiado corto");
		else if(pass.length() <= 8) assertEquals(enmascarado, "********");
		else assertEquals(enmascarado, "Rango no especificado");
	}
	
	@ParameterizedTest
	@CsvSource({"menosdoce", "calabazadulce", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"})
	void testEnmascararMasDeDoce(String pass) {
		Ejercicio3 e3 = new Ejercicio3();
		String enmascarado = e3.enmascarar(pass);
		if(pass.length() >= 12 && pass.length() < 40) assertEquals(enmascarado, "************");
		else if (pass.length() > 40)assertEquals(enmascarado, "password demasiado largo");
		else assertEquals(enmascarado, "Rango no especificado");
	}

}
