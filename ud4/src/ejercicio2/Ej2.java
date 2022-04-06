package ejercicio2;
/**
 * 
 * @author Jose Antonio Gonz�lez Alc�ntara
 * 
 * Clase de Java de la TA04-Java Basics Ejercicio2
 */

public class Ej2 {

	public static void main(String[] args) {
		//Escribe un programa Java realice lo siguiente:
		
		//Declaramos una variable N, A, C de tipo int
		int n; //Las Escribo en minuscula por convenci�n
		double a;
		char c;
		
		//Les asigno un valor
		n = 16;
		a = 23.16666666666;
		c = 'j';
		
		//Mostramos el valor por pantalla de cada variable
		System.out.println("A continuaci�n mostraremos el valor de las variables");
		System.out.println("Variable N es " + n);
		System.out.println("Variable de A es " + a);
		System.out.println("Variable de C es " + c);
		
		//Mostramos la suma de N + A
		
		//Declaro una valiable de resultado y sumo
		double resultado = 0;
		resultado = n + a;
		
		//Lo muestro por pantalla
		System.out.println(n + " + " + a + " = " + resultado);
		
		//Mostramos la diferencia de N - A
		//Almaceno la diferencia en resultado
		resultado = a - n;
		
		//Lo mostramos por pantalla
		System.out.println(a + " + " + n + " = " + resultado);
		
		//Mostramos el valor númerico correspondiente al carácter que contiene la variable C.
		//Almacenamos el valor del carácter c 
		int valorC = c;
		
		//mostramos por pantalla
		System.out.println("Valor númerico correspondiente del carácter " + c + " = " + valorC);
		
		
		
	}

}
