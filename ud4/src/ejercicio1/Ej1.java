package ejercicio1;
/**
 * 
 * @author Jose Antonio Gonz�lez Alc�ntara
 * 
 * Clase de Java de la TA04-Java Basics Ejercicio1
 *
 */
public class Ej1 {

	public static void main(String[] args) {
		/*1-Declara dos valiables num�ricas (con el valor que desees), 
		muestra por consola la suma, resta, 
		multiplicaci�n, divisi�n y m�dulo (resto de la divisi�n).*/
		
		//declaraci�n de las dos variables
		int varA = 23;
		int varB = 16;
		
		//declaraci�n de las variables que almacenaran los resultados de las operaciones
		int suma;
		int resta;
		int multiplicacion;
		int division;
		int modulo;
		
		//operaci�n suma
		suma = varA + varB;
		
		//imprimimos la suma
		System.out.println("Esta es la suma de varA + varB = " + suma );
		
		//operaci�n resta
		resta = varA - varB;
		
		//imprimimos la suma
		System.out.println("Esta es la resta de varA - varB = " + resta );
		
		//operaci�n multiplicaci�n
		multiplicacion = varA * varB;
		
		//imprimimos la multiplicaci�n
		System.out.println("Esta es la multiplicaci�n de varA x varB = " + multiplicacion );
		
		//operaci�n divisi�n
		division = varA / varB;
		
		//imprimimos la divis�n
		System.out.println("Esta es la divisi�n de varA / varB = " + division );
		
		//operaci�n m�dulo
		modulo = varA % varB;
		
		//imprimimos la m�dulo
		System.out.println("Este es el resto de la divisi�n de varA % varB = " + modulo );
	}

}
