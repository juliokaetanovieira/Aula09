package br.com.db1.db1start.aula2;

import org.junit.Assert;
import org.junit.Test;

public class ExercicioDeIntegerTest {
	
	@Test
	public void deveSomarDoisNumeros(){
		
		ExercicioDeDouble calculadora = new ExercicioDeDouble();
		Integer resultado = calculadora.somar(2, 5);
		Assert.assertEquals(7, resultado, 0);
	}
	
	@Test
	public void deveSubtrairDoisNumeros(){
		
		ExercicioDeDouble calculadora = new ExercicioDeDouble();
		Integer resultado = calculadora.subtrair(5, 2);
		Assert.assertEquals(3, resultado, 0);
	}
	
	@Test
	public void deveDividirDoisNumeros(){
		
		ExercicioDeDouble calculadora = new ExercicioDeDouble();
		double resultado = calculadora.dividir(2, 2);
		Assert.assertEquals(1, resultado, 0);
	}
	
	@Test
	public void deveRetornarNumeroParOuImpar(){
		
		ExercicioDeDouble calculadora = new ExercicioDeDouble();
		Boolean resultado = calculadora.parOuImpar(3);
		Assert.assertEquals(false, resultado);
	}
	
	@Test
	public void deveContarNumerosImpar(){
		
		ExercicioDeDouble calculadora = new ExercicioDeDouble();
		Integer resultado = calculadora.contarImpar(99);
		Assert.assertEquals(1, resultado, 0);
	}
}
