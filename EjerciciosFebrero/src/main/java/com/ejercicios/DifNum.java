package com.ejercicios;

import java.util.Scanner;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DifNum {
	//Crea un programa donde te pida un número y muestra si es positivo o negativo y si es par o impar 
	
	@Test
	public void diferenciarNum () {
		
		int i;
		
		Scanner leerNum = new Scanner (System.in);
		
		Reporter.log("Ingresa cualqueir número: ", true);
		i = leerNum.nextInt();
		
		if(i<0 && i%2!=0) {
			Reporter.log("El número es negativo e impar", true);
			
		}else if (i>0 && i%2==0) {
			Reporter.log("El número es positivo y par", true);
			
		}else if (i<0 && i%2==0) {
			Reporter.log("El número es negativo y par", true);
			
		}else {
			Reporter.log("El número es positivo e impar", true);
		}
		
	}
	
	
	}


