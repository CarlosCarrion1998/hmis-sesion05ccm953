package ual.hmis.sesion05.ejercicio2;


import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class TestEjercicio2 {

	@ParameterizedTest
	@CsvSource({"user, pass"})
	void testLoginCorrecto(String user, String password) {
		Ejercicio2 loger = new Ejercicio2();
		Assert.assertTrue(loger.login(user, password));
	}
	
	@ParameterizedTest
	@CsvSource({"user, ''", "'' , pass", "'' , ''",
		"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa, password" , 
		"user, aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"})
	void testValoresVaciosYLongitud(String user, String password) {
		Ejercicio2 vacios = new Ejercicio2();
		Assert.assertFalse(vacios.login(user, password));
	}
	
	@ParameterizedTest
	@CsvSource({"user, passInvalida", "userInvalido, pass"})
	void testCredencialesIncorrectas(String user, String password) {
		Ejercicio2 loger = new Ejercicio2();
		Assert.assertFalse(loger.login(user, password));
	}
	

}
