package Familia512;

import java.util.Scanner;

public class PrimeiraListaTresJava {

	/*Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos e mostre-o expresso em horas, minutos e segundos.
	 */
	public static void main(String[] args) {
		
		int duracaoEvento, horas, minutos, segundos, res;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nQuantos segundos o evento teve no total? ");
		duracaoEvento = leia.nextInt();
		
		horas = duracaoEvento / 3600; //divisão para obter as horas;
		res = duracaoEvento % 3600; //função resto para obter o resto das horas (ainda em segundos);
		minutos = res / 60; //divisão para saber quantos minutos equivale o resto das horas;
		segundos = res % 60; //função resto para ''guardar'' o resto da divisão dos minutos, sendo esse resto = os próprios segundos (a entrada de dados foi em segundos)
		System.out.println("\nO evento durou "+horas+ " horas, " + minutos + " minutos, " + segundos + " segundos!");
		

	
	}

}
