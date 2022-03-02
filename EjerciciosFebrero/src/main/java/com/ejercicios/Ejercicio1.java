package com.ejercicios;

import java.util.Scanner;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ejercicio1 {

	//	1.Programa que lea dos numeros por telcado y que evalue si son igulaes o si un numero es mayor que el otro.
	
	@Test
	
	public void compararNum () {
		
		double num1, num2;
		
		Scanner comparacion = new Scanner (System.in);
		
		Reporter.log("Ingresa el primer número: ",true);
		num1 = comparacion.nextDouble();
		
		Reporter.log("Ingresa el segundo número: ",true);
		num2 = comparacion.nextDouble();
	
		if (num1>num2) {
			Reporter.log(num1 +" Es mayor que "+ num2,true);
			
		}else if (num1<num2) { 
			Reporter.log(num1 +" Es menor que " +num2, true);
			
		}else {
			Reporter.log(num1+ " y " +num2 +" son números iguales",true);
		}
		
	}
	
}
