/*
 * @(#) CalculadorBasico.java 1.1  03/01/20
 *
 * Sistemas Distribuidos. Dpto. Informatica Aplicada. 
 * Curso 2002/2003
 * Este fichero esta dentro del ejemplo 1 que aparece en el apartado RMI del
 * tema 2 del libro de apuntes de Sistemas Distribuidos.
 */

 /**
  * La clase CalculadorBasico es una implementacion del servicio Calculador
  * 
  * @version	1.1 enero 2003
  * @autor		Isabel Munoz   
  */

public class CalculadorBasico implements Calculador {
    public long div(long a, long b) throws java.rmi.RemoteException {
        return a / b;
    }
}
