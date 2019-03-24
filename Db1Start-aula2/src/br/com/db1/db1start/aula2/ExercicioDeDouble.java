package br.com.db1.db1start.aula2;

public class ExercicioDeDouble {

	public Integer somar(Integer numero1, Integer numero2) {
		Integer soma = numero1 + numero2;
		return soma;
	}

	public Integer subtrair(Integer numero1, Integer numero2) {
		Integer subtrai = numero1 - numero2;
		return subtrai;
	}

	public double dividir(double numero1, double numero2) {
		double dividi = numero1 / numero2;
		return dividi;
	}

	public Boolean parOuImpar(Integer numero) {
		if (numero % 2 == 0) {
			return true;
		}
		return false;
	}

	public Integer contarImpar(Integer numero) {
		Integer contini = 0;
		for (Integer cont = numero; cont <= 100; contini++)
			if (cont % 2 == 1) {
				contini++;
			}
		return contini;
	}

}
