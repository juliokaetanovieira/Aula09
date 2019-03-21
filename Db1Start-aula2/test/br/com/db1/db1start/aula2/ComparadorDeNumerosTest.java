package br.com.db1.db1start.aula2;

import org.junit.Assert;
import org.junit.Test;


public class ComparadorDeNumerosTest {
	@Test
	public void deveRetornarNumero1MenorQueNumero2(){
		
		ComparadorDeNumeros comparador = new ComparadorDeNumeros();
		double resultado = comparador.menor(1, 2);
		Assert.assertEquals(1, resultado, 0);
	}
	
	@Test
	public void deveRetornarNumero2MenorQueNumero2(){
		
		ComparadorDeNumeros comparador = new ComparadorDeNumeros();
		double resultado = comparador.menor(30, 20);
		Assert.assertEquals(20, resultado, 0);
	}
	
		
}
