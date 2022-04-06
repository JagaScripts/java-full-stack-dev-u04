package ejercicio1;
/**
 * 
 * @author Jose Antonio González Alcántara
 * 
 * Clase de Java de la TA04-Java Basics Ejercicio1
 *
 */
public class Ej1 {

	public static void main(String[] args) {
		/*1-Declara dos valiables numéricas (con el valor que desees), 
		muestra por consola la suma, resta, 
		multiplicación, división y módulo (resto de la división).*/
		
		//declaración de las dos variables
		int varA = 23;
		int varB = 16;
		
		//declaración de las variables que almacenaran los resultados de las operaciones
		int suma;
		int resta;
		int multiplicacion;
		int division;
		int modulo;
		
		//operación suma
		suma = varA + varB;
		
		//imprimimos la suma
		System.out.println("Esta es la suma de varA + varB = " + suma );
		
		//operación resta
		resta = varA - varB;
		
		//imprimimos la suma
		System.out.println("Esta es la resta de varA - varB = " + resta );
		
		//operación multiplicación
		multiplicacion = varA * varB;
		
		//imprimimos la multiplicación
		System.out.println("Esta es la multiplicación de varA x varB = " + multiplicacion );
		
		//operación división
		division = varA / varB;
		
		//imprimimos la divisón
		System.out.println("Esta es la división de varA / varB = " + division );
		
		//operación módulo
		modulo = varA % varB;
		
		//imprimimos la módulo
		System.out.println("Este es el resto de la división de varA % varB = " + modulo );
	}

}
