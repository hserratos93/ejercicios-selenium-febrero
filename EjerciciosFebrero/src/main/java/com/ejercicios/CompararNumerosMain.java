package com.ejercicios;

import java.util.Scanner;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CompararNumerosMain {

	public static void main(String[] args) {
		//Ejercicio que permita ingresar dos calificaciones, sí el promedio de estas es reprobatorio o aprobatorio, que lo indique, 
		//tomar en cuenta que no se permitan ingresar calificaciones menores a cero o mayores a 100
		
		
		double i, y;
		

			Scanner reader = new Scanner(System.in);
			
			do {
			Reporter.log("Ingresa la calificacion 1",true);
			i=reader.nextDouble();
			
			}while (i <0 || i >100); 
			
			do {
			Reporter.log("Ingresa la calificacion 2",true);
			y=reader.nextDouble();
			}while(y <0 || y >100);
		
			
			double promedio= (i+y)/2;
			Reporter.log("El promedio de las calificaciones es: " + promedio,true);
			
			if (promedio<60 && promedio>0) {
				Reporter.log("EstÃ s reporbado con " +promedio, true);
				
			}else if (promedio >=60 && promedio <=100) {
				
				Reporter.log("Felicidades, estÃ s aprobado con: " +promedio, true);
			}


		
		//ejercicio2
		//hacer un programa que lea dos numeros por teclado pero se debe repetir hasta que los números sean iguales, utilizar ciclo do while
		
		
			
			double num1, num2;
			
			Scanner compara = new Scanner(System.in);
			
			do {
				System.out.println("Ingresa el primer número a comparar: ");
				num1=compara.nextDouble();
				
				System.out.println("Ingresa el primer número a comparar: ");
				num2=compara.nextDouble();
				
				}while (num1 != num2); 
			
			System.out.println("Los numeros coinciden " +num1 +" y "+num2);
			
			
		}
		

	}


