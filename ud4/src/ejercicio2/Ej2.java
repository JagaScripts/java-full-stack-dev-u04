package ejercicio2;
/**
 * 
 * @author Jose Antonio González Alcántara
 * 
 * Clase de Java de la TA04-Java Basics Ejercicio2
 */

public class Ej2 {

	public static void main(String[] args) {
		//Escribe un programa Java realice lo siguiente:
		
		//Declaramos una variable N, A, C de tipo int
		int n; //Las Escribo en minuscula por convención
		int a;
		int c;
		
		//Les asigno un valor
		n = 0;
		a = 16;
		c = 23;
		
		//Mostramos el valor por pantalla de cada variable
		System.out.println("A continuación mostraremos el valor de las variables");
		System.out.println("El valor de N es " + n);
		System.out.println("El valor de N es " + a);
		System.out.println("El valor de N es " + c);
		
		//Mostramos la suma de N + A
		
		//Declaro una valiable de resultado y sumo
		int resultado = 0;
		resultado = n + a;
		
		//Lo muestro por pantalla
		System.out.println("La suma de N + A es " + resultado);
		
		//Mostramos la diferencia de N - A
		//Almaceno la diferencia en resultado
		resultado = a - n;
		

	}

}
