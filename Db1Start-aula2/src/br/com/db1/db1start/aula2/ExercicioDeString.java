package br.com.db1.db1start.aula2;

public class ExercicioDeString {
	
	public String transformarParaMaiusculo(String texto) {
		return texto.toUpperCase();
	}
	
	public String transformarParaMinusculo(String texto) {
		return texto.toLowerCase();
	}
	
	public Integer contaCaracteres(String texto) {
		return texto.length();
		
	}
	
	public Integer contaCarateresComEspaços(String texto) {
		return texto.length();
	}
	
	public Integer contaCaracteresSemEspaços(String texto) {
		return texto.trim().length();
	}
	
	public String exibeQuatroPrimeirasLetras(String texto) {
		return texto.substring(0, 4);
	}
	
	public String exibeApartirDaTerceiraLetra(String texto) {
		return texto.substring(3, 20);
	}
	
	public String exibeQuatroUltimasLetras(String texto) {
		return texto.substring(16, 20);
	}
	
	public String substituiPrimeiroNome(String texto) {
		return texto.replace("julio", "ALUNO");
	}
	
	public String exibeTextoSeparadamente(String texto) {
		String frutas[] = texto.split(",");
		return frutas[0] + frutas[1] + frutas[2];
		
	}
	
	public Integer exibeQuantidadeDeVogais(String texto) {
		texto.toLowerCase();
		Integer contvogais = 0;
		for(Integer i = 0; i < texto.length(); i++) {
			char charvog = texto.charAt(i);
			if(charvog == 'a' || charvog == 'e' || charvog == 'i' || charvog == 'o' || charvog == 'u'
					|| charvog == 'A' || charvog == 'E' || charvog == 'I' || charvog == 'O' || charvog == 'U')
				contvogais++;
		}
		return contvogais;
		
	}
	
	public String exibeTextoInvertido(String texto) {
		String Invertido = "";
		for(Integer i = texto.length()-1; i >= 0; i--) {
			Invertido +=texto.charAt(i);
		}
		return Invertido;
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
