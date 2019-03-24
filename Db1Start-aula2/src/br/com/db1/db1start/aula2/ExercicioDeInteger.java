package br.com.db1.db1start.aula2;

public class ExercicioDeInteger {

	public double menorValorEntreDoisDoubles(Double numero1, Double numero2) {
		if (numero1 < numero2) {
			return numero1;
		}
		return numero2;
	}

	public double menorValorEntreTresDoubles(Double valor3, Double valor4, Double valor5) {

		if (valor3 < valor4 && valor3 < valor5) {
			return valor3;
		}

		if (valor4 < valor3 && valor4 < valor5) {
			return valor4;
		}

		return valor5;

	}
	
	public double exibeMediaDeTresNumeros(Double valor1, Double valor2, Double valor3) {
		return (valor1 + valor2 + valor3) / 3; 
		
	}
	
	public double calculaAreaDeTriangulo(Double base, Double altura) {
		double area = (base * altura) / 2;
		return area;
	}
}
