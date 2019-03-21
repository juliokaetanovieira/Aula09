package br.com.db1.db1start.aula2;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {
	
	@Test
	public void deveSomarDoisNumeros(){
		
		Calculadora calculadora = new Calculadora();
		Integer resultado = calculadora.somar(2, 5);
		Assert.assertEquals(7, resultado, 0);
	}
	
	@Test
	public void deveSubtrairDoisNumeros(){
		
		Calculadora calculadora = new Calculadora();
		Integer resultado = calculadora.subtrair(5, 2);
		Assert.assertEquals(3, resultado, 0);
	}
	
	@Test
	public void deveDividirDoisNumeros(){
		
		Calculadora calculadora = new Calculadora();
		double resultado = calculadora.dividir(2, 2);
		Assert.assertEquals(1, resultado, 0);
	}
	
	@Test
	public void deveRetornarNumeroParOuImpar(){
		
		Calculadora calculadora = new Calculadora();
		Boolean resultado = calculadora.parOuImpar(3);
		Assert.assertEquals(false, resultado);
	}
	
	public void deveContarNumerosImpar(){
		
		Calculadora calculadora = new Calculadora();
		Integer resultado = calculadora.contarImpar(99);
		Assert.assertEquals(1, resultado, 0);
	}
}
