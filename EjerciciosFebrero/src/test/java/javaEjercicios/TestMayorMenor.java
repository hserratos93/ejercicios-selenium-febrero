package javaEjercicios;

import org.testng.annotations.Test;

import com.ejercicios.MayorMenorCurso;

public class TestMayorMenor {
	
	
	@Test
	public void probarMayorMenor() {
		
		
		MayorMenorCurso obj = new MayorMenorCurso(100,200);
		
		MayorMenorCurso obj2 = new MayorMenorCurso();
		
	
		
		obj2.pedirNumerosIguales();
		
		
//		System.out.println(obj.getNum1());
//		System.out.println(obj.getNum2());
//		
//		obj.calcularNumeroMayorMenor(100,200);
//		obj.calcularNumeroMayorMenor(700,500);
//		obj.calcularNumeroMayorMenor(400,400);
//		
//		obj.pedirNumerosIguales();
		
	}


}
