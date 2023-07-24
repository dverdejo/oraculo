package destiny;

import java.util.Scanner;

public class Destiny {

	public static void main(String[] args) {
		
		int random;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("¿Cual es tu nombre? ");
		String nombre = entrada.nextLine();

		System.out.println("¿Cual es tu pregunta? ");
		String pregunta = entrada.nextLine();
			
		System.out.println("Bienvenid@ " + nombre + ". Veamos que dice el Oraculo!");
		
		random = (int)(Math.random()*9) + 1;
		
		if (random == 1) {
			System.out.println("Confía en el tiempo. Suele dar dulces salidas a amargas dificultades.");
		} else if (random == 2) {
			System.out.println("El fracaso más grande es nunca haberlo intentado.");
		} else if (random == 3) {
			System.out.println("Si buscas resultados distintos, no hagas siempre lo mismo.");
		} else if (random == 4) {
			System.out.println("No puedes dirigir el viento, pero si ajustar las velas.");
		} else if (random == 5) {
			System.out.println("Si el plan no funciona, cambia el plan. No la meta.");
		} else if (random == 6) {
			System.out.println("La mejor forma de predecir el futuro es crearlo.");
		} else if (random == 7) {
			System.out.println("Nada es una perdida de tiempo si aprendiste algo de eso.");
		} else if (random == 8) {
			System.out.println("Si quieres ver el arcoiris tienes que primero tolerar la lluvia.");
		} else {
			System.out.println("Las dificultades preparan a personas comunes para destinos extraordinarios.");
		} 
		
	}

}
