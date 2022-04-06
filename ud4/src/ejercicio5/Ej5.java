package ejercicio5;
/**
 * 
 * @author Jose Antonio Gonz�lez Alc�ntara
 * 
 * Clase de Java de la TA04-Java Basics Ejercicio 5
 */

public class Ej5 {

	public static void main(String[] args) {
		/*Programa java que declare cuatro variables enteras A, B, C y D.
		Asignarle un valor a cada una
		Realizar instrucciones necesarias*/
		
		//Declaración de las variables enteras A, B, C y D
		int a;
		int b;
		int c;
		int d;
		
		//Asignación de valores de las variables enteras A, B, C y D
		a = 23;
		b = 32;
		c = 16;
		d = 61;
		
		//Mostramos el valor de cada variable
		System.out.println("Variable A = " + a);
		System.out.println("Variable B = " + b);
		System.out.println("Variable C = " + c);
		System.out.println("Variable D = " + d);
		
		//Intrucción para que B tome el valor de C
		b = c;
		
		//mostramos el valor de B y C
		System.out.println("B = " + b + " y C = " + c);
		
		//Intrucción para que C tome el valor de A
		c = a;
				
		//mostramos el valor de A y C
		System.out.println("C = " + c + " y A = " + a);

		//Intrucción para que A tome el valor de D
		a = d;

		//mostramos el valor de A y D
		System.out.println("A = " + a + " y D = " + d);

		//Intrucción para que D tome el valor de B
		d = b;

		//mostramos el valor de B y D
		System.out.println("D = " + d + " y B = " + b);
		
		//Mostramos el valor de cada variable modificados
		System.out.println("Variable A = " + a);
		System.out.println("Variable B = " + b);
		System.out.println("Variable C = " + c);
		System.out.println("Variable D = " + d);


	}

}
