package ejercicio3;
/**
 * 
 * @author Jose Antonio Gonz�lez Alc�ntara
 * 
 * Clase de Java de la TA04-Java Basics Ejercicio 3
 */

public class Ej3 {

	public static void main(String[] args) {
		//Escribe un programa Java realice lo siguiente:
		
		//Declaramos dos variables X e Y de tipo int
		int x; //Las escribo en minuscula el nombre de las variables por convención
		int y;
		
		//Asignamos a cada una un valor
		x = 16;
		y = 23;
		
		//Declaramos dos variables N y M de tipo double
		double n;
		double m;
		
		//Asignamos a cada una un valor
		n = 16.2333;
		m = 23.166666;
		
		//A continuación mostramos por pantalla:
		
		//El valor de cada variable
		System.out.println("Variable X = " + x);
		System.out.println("Variable Y = " + y);
		System.out.println("Variable N = " + n);
		System.out.println("Variable M = " + m);
		
		//La suma de X + Y
		int resultadoI = x + y;
		System.out.println(x + " + " + y +  " = " + resultadoI);
		
		//La diferencia de X - Y
		resultadoI = x - y;
		System.out.println(x + " - " + y +  " = " + resultadoI);
		
		//El producto de X * Y
		resultadoI = x * y;
		System.out.println(x + " * " + y +  " = " + resultadoI);
		
		//La cociente de X / Y
		resultadoI = x / y;
		System.out.println(x + " / " + y +  " = " + resultadoI);
		
		//El resto de X % Y
		resultadoI = x % y;
		System.out.println(x + " % " + y +  " = " + resultadoI);
		
		//La suma de N + M
		double resultadoD = n + m;
		System.out.println(n + " + " + m +  " = " + resultadoD);
				
		//La diferencia de N - M
		resultadoD = n - m;
		System.out.println(n + " - " + m +  " = " + resultadoD);
				
		//El producto de N * M
		resultadoD = n * m;
		System.out.println(n + " * " + m +  " = " + resultadoD);
				
		//La cociente de N / M
		resultadoD = n / m;
		System.out.println(n + " / " + m +  " = " + resultadoD);
				
		//El resto de N % M
		resultadoD = n % m;
		System.out.println(n + " % " + m +  " = " + resultadoD);
		
		//El valor de cada variable
		//Defino una constante para multiplicadora
		final int MULTI = 2; 
		System.out.println("El doble de X es " + (x * MULTI));
		System.out.println("El doble de Y es " + (y * MULTI));
		System.out.println("El doble de N es " + (n * MULTI));
		System.out.println("El doble de M es " + (m * MULTI));
		
		//La suma de todas las variables
		System.out.println(x + " + " + y + " + " + n + " + " + m + " = " + (x + y + n + m));
		
		//El producto de todas las variables
		System.out.println(x + " x " + y + " x " + n + " x " + m + " = " + (x * y * n * m));
		
		

	}

}
