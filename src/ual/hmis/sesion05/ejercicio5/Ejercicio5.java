package ual.hmis.sesion05.ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio5 {
	
	public List<Integer> fusionarListas(List<Integer> lista1, List<Integer> lista2) {
		List<Integer> listaFusion = new ArrayList<Integer>();
		
		if(lista1.isEmpty() && lista2.isEmpty()) {
			return listaFusion;
		}
		
		if(!lista1.isEmpty() && lista2.isEmpty()) return lista1;
		if(lista1.isEmpty()) return lista2;
		
		for(Integer n : lista1) {
			if(!listaFusion.contains(n))
				listaFusion.add(n);
		}
		for(Integer n : lista2) {
			if(!listaFusion.contains(n))
				listaFusion.add(n);
		}
		listaFusion.sort(null);
		
		return listaFusion;
	}

}
