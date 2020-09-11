/*
 * @(#) Calculador.java 1.1  03/01/20
 *
 * Sistemas Distribuidos. Dpto. Informatica Aplicada.
 * Curso 2002/2003
 * Este fichero esta dentro del ejemplo 1 que aparece en el apartado RMI del
 * tema 2 del libro de apuntes de Sistemas Distribuidos.
 */

 /**
  * El servicio Calculador ofrece la division de dos numeros  
  *
  * @version    1.1 enero 2003
  * @autor	   Isabel Munoz
  */

public interface Calculador extends java.rmi.Remote {
    public long div(long a, long b) throws java.rmi.RemoteException;
}
	
