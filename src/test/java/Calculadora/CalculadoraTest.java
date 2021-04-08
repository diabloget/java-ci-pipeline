package Calculadora;

import static org.junit.Assert.*;

import org.junit.Test;


public class CalculadoraTest {

	
	@Test
	public void testSuma() {
		int resultado = Calculadora2.sumar(2,3);
		int esperado = 5;// 2 + 3 = 5
		assertEquals(esperado, resultado);
		
	}
	@Test
	public void testResta() {
		int resultado = Calculadora2.restar(3,2);
		int esperado = 1;// 3 - 1  = 1
		assertEquals(esperado, resultado);
	}

}
