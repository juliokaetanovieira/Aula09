package br.com.db1.db1start.aula2;

import org.junit.Assert;
import org.junit.Test;

public class ExercicioDeDoubleTest {
	@Test
	public void menorValorEntreDoisDoubles() {

		ExercicioDeInteger comparador = new ExercicioDeInteger();
		double resultado = comparador.menorValorEntreDoisDoubles(10.2, 15.3);
		Assert.assertEquals(10.2, resultado, 0);
	}
	
	@Test
	public void menorValorEntreTresDoubles() {
		
		ExercicioDeInteger comparador = new ExercicioDeInteger();
		double resultado = comparador.menorValorEntreTresDoubles(1.2, 2.3, 3.5);
		Assert.assertEquals(1.2, resultado, 0);
	}
	
	@Test
	public void exibeMediaDeTresNumeros() {
		
		ExercicioDeInteger comparador = new ExercicioDeInteger();
		double resultado = comparador.exibeMediaDeTresNumeros(8.5, 5.2, 5.6);
		Assert.assertEquals(6.43, resultado, 6);
	}
	
	@Test
	public void calculaAreaDeTriangulo() {
		
		ExercicioDeInteger comparador = new ExercicioDeInteger();
		double resultado = comparador.calculaAreaDeTriangulo(10.5, 15.5);
		Assert.assertEquals(81.37, resultado, 81);
		
	}

}
