package ual.hmis.sesion05.ejercicio3;

public class Ejercicio3 {
	public String enmascarar(String pass) {
		if(pass.length() < 5) return "password demasiado corto";
		if(pass.length() <= 8) return "********";
		if(pass.length() >= 12 && pass.length() < 40) return "************";
		if(pass.length() > 40) return "password demasiado largo";
		//Ya que el rango entre 8 y 12 no está especificado, se devolverá este mensaje
		return "Rango no especificado";
	}
}
