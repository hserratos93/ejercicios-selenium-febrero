package com.ejercicios;

import java.util.Scanner;

public class Ejercicio1Main {

	public static void main(String[] args) {
		//1.Programa que lea dos numeros por telcado y que evalue si son igulaes o si un numero es mayor que el otro.	
		
		double var1, var2;
		
		Scanner Evaluar = new Scanner (System.in);
		System.out.println("Ingresa el primer número: ");
		var1 = Evaluar.nextDouble();
		System.out.println("Ingresa el segundo número: ");
		var2 =Evaluar.nextDouble();
		
		if(var1>var2) {
			System.out.println(var1 +" es mayor que: "+var2);
			
		}else if(var2>var1) {
			System.out.println(var1+ " es menor que: " +var2);
			
		}else {
			System.out.println(var1+ " y " +var2 +" son números iguales");
		}
			

	}

}
