package ual.hmis.sesion05.ejercicio2;

/**
 * 
 * @author Carlos
 *
 */
public class Ejercicio2 {
	/**
	 * Método que simula un login con unas características concretas
	 * @param username
	 * @param password
	 * @return compruebaLoginEnBD
	 */
	public boolean login (String username, String password){
		// comprobar que sean distintos de vacio
		if(username.isEmpty() || password.isEmpty()) return false;

		// comprobar que la longitud sea < 30
		if(username.length() >= 30 || password.length() >= 30) return false;

		// llamar al método de la bbdd
		return compruebaLoginEnBD(username, password);
	}
	/**
	 * Método que comprueba que el username y el password son correctos
	 * @param username
	 * @param password
	 * @return true si los parámetros son correctos, sino falso
	 */
	public boolean compruebaLoginEnBD
	(String username, String password){
		// método mock (simulado)
		 
		if (username.equals("user") && password.equals("pass"))
			return true;
		else
			return false;
	}

}
