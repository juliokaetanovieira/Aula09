package br.com.db1.db1start.aula2;

import org.junit.Assert;
import org.junit.Test;

public class ExercicioDeStringTest {
	
	@Test
	public void transformarParaMaiusculo() {
		
		ExercicioDeString exstring = new ExercicioDeString();
		String resultado = exstring.transformarParaMaiusculo("julio");
		Assert.assertEquals("JULIO", resultado);
	}
	
	@Test
	public void trasnformarParaMinusculo() {
		
		ExercicioDeString exstring = new ExercicioDeString();
		String resultado = exstring.transformarParaMinusculo("JULIO");
		Assert.assertEquals("julio", resultado);
	}
	
	@Test
	public void contaCaracteres() {
		
		ExercicioDeString exstring = new ExercicioDeString();
		Integer resultado = exstring.contaCaracteres("DB1START");
		Assert.assertEquals(8, resultado, 0);
	}
	
	@Test
	public void contaCaracteresComEspaços() {
		
		ExercicioDeString exstring = new ExercicioDeString();
		Integer resultado = exstring.contaCarateresComEspaços(" DB1START ");
		Assert.assertEquals(10, resultado, 0);
	}
	
	@Test
	public void contaCaracteresSemEspaços() {
		
		ExercicioDeString exstring = new ExercicioDeString();
		Integer resultado = exstring.contaCaracteresSemEspaços(" DB1START ");
		Assert.assertEquals(8, resultado, 0);
		
	}
	
	@Test
	public void exibeQuatroPrimeirasLetras() {
		
		ExercicioDeString exstring = new ExercicioDeString();
		String resultado = exstring.exibeQuatroPrimeirasLetras("julio caetano vieira");
		Assert.assertEquals("juli", resultado);
	}
	
	@Test
	public void exibeApartirDaTerceiraLetra() {
		
		ExercicioDeString exstring = new ExercicioDeString();
		String resultado = exstring.exibeApartirDaTerceiraLetra("julio caetano vieira");
		Assert.assertEquals("io caetano vieira", resultado);
	}
	
	@Test
	public void exibeQuatroUltimasLetras() {
		
		ExercicioDeString exstring = new ExercicioDeString();
		String resultado = exstring.exibeQuatroUltimasLetras("julio caetano vieira");
		Assert.assertEquals("eira", resultado);
	}
	
	@Test
	public void substituiPrimeiroNome() {
		
		ExercicioDeString exstring = new ExercicioDeString();
		String resultado = exstring.substituiPrimeiroNome("julio caetano vieira");
		Assert.assertEquals("ALUNO caetano vieira", resultado);
	}
	
	@Test
	public void exibeTextoSeparadamente() {
		
		ExercicioDeString exstring = new ExercicioDeString();
		String resultado = exstring.exibeTextoSeparadamente("banana, maçã, melancia");
		Assert.assertEquals("banana maçã melancia", resultado);

	}
	
	@Test
	public void exibeQuantidadeDeVogais() {
		
		ExercicioDeString exstring = new ExercicioDeString();
		Integer resultado = exstring.exibeQuantidadeDeVogais("jUlIo");
		Assert.assertEquals(3, resultado, 0);
	}
	
	@Test
	public void exibeTextoInvertido() {
		
		ExercicioDeString exstring = new ExercicioDeString();
		String resultado = exstring.exibeTextoInvertido("JAVA");
		Assert.assertEquals("AVAJ", resultado);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
