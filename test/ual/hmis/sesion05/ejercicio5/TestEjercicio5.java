package ual.hmis.sesion05.ejercicio5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class TestEjercicio5 {

	@ParameterizedTest
	@MethodSource("datosDePrueba")
	void testFusionListas(List<Integer> lista1, List<Integer> lista2, List<Integer> esperado) {
		
		Ejercicio5 e5 = new Ejercicio5();
		
		List<Integer> result = e5.fusionarListas(lista1, lista2);
		
		assertEquals(esperado, result);
		
	}
	
	private static Stream<Arguments> datosDePrueba() {
	    List<Integer> lista1 = Arrays.asList(2, 3, 5);
	    List<Integer> lista2 = Arrays.asList(1, 5, 7, 8);
	    List<Integer> lista3 = Arrays.asList(1, 2, 3, 5, 7, 8);
	    
	    List<Integer> lista4 = Arrays.asList(0, 4, 5, 5, 7, 8);
	    List<Integer> lista5 = Arrays.asList(3, 6);
	    List<Integer> lista6 = Arrays.asList(0, 3, 4, 5, 6, 7, 8);
	    
	    List<Integer> lista7 = Arrays.asList(0, 4, 5, 7, 8);
	    List<Integer> lista8 = new ArrayList<>();
	    List<Integer> lista9 = Arrays.asList(0, 4, 5, 7, 8);
	    
	    List<Integer> lista10 = new ArrayList<>();
	    List<Integer> lista11 = Arrays.asList(0, 4, 5, 7, 8);
	    List<Integer> lista12 = Arrays.asList(0, 4, 5, 7, 8);
	    
	    List<Integer> lista13 = new ArrayList<>();
	    List<Integer> lista14 = new ArrayList<>();
	    List<Integer> lista15 = new ArrayList<>();
	    
	    return Stream.of(
	        Arguments.of(lista1, lista2, lista3),
	        Arguments.of(lista4, lista5, lista6),
	        Arguments.of(lista7, lista8, lista9),
	        Arguments.of(lista10, lista11, lista12),
	        Arguments.of(lista13, lista14, lista15)
	    );
	}

}
