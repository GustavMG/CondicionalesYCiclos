package CondicionalesYCiclos;

import java.util.Scanner;

public class CondicionalesYCiclos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Condicionales
		 * 
		 * if
		 * else
		 * else if
		 * switch
		 */
		
		System.out.println("Programa para calcular la hora");
		
//		int hora = 13;
		Scanner valorIngresado = new Scanner(System.in);
		
		System.out.println("Por favor, ingresa una hora en un formato de 24hrs");
		
		int hora = valorIngresado.nextInt();
		
		if(hora>=0 && hora<= 23) {
			System.out.println("Hora ingresada correctamente");
			if(hora>= 7 && hora <=11) {
				System.out.println("Buenos dias solecito");
			} else if(hora>12 && hora<=18) {
				System.out.println("Buenas tardes, que calor hace");
			} else if(hora>=19 && hora <24) {
				System.out.println("Buenas noches, a dormir");
			} else {
				System.out.println("Es de madrugada, NO es bueno desvelarse");
			}
		}
		else {
			System.out.println("Hora mal ingresada");
		}
		
		valorIngresado.close();	//Cierra escaner
		
		/*Condicional swtich*/
		
		int opcion = 1;
		
		switch(opcion) {
		case 1:
			System.out.println("Bienvenido al servicio de reservas");
		break;
		case 2:
			System.out.println("Bienvenido al servicio de reservas");
		break;
		case 3:
			System.out.println("Bienvenido al servicio de reservas");
		break;
		default:
			System.out.println("opcion No valida");
		break;
			
		}
	}

}
