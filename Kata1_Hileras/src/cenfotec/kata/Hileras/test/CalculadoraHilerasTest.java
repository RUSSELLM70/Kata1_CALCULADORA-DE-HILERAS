package cenfotec.kata.Hileras.test;

import static org.junit.Assert.*;

import org.junit.Test;

import cenfotec.kata.Hileras.CalculadoraHileras;


public class CalculadoraHilerasTest {
	
	CalculadoraHileras calc = new CalculadoraHileras();

	
	/*KATA 1*/
	
	
	@Test // Punto a.
	public void testStringVacio() throws Exception {
		assertEquals(0, calc.add(""));
	}
	
	
	@Test // Punto a 2.
	public void testSumaSimple() throws Exception {
		assertEquals(1, calc.add("0,1"));
		assertEquals(3, calc.add("0,1,2"));
	}
	
//	@Test (expected = Exception.class) // Punto b.
//	public void testErrorNumeroParametros() throws Exception {
//		assertEquals(4, calc.add("1,1,1,1"));
//		
//	}
	
	@Test  // Punto c.
	public void testUnNumero() throws Exception {
		assertEquals(1, calc.add("1"));
		assertEquals(2, calc.add("2"));
	}
	
	@Test // Punto 3.
	public void testSeparadores () throws Exception{
		assertEquals(3, calc.add("1 . 2"));
	}
	
	//Aceptar N parametros, aceptar "," y "." como separador

}
