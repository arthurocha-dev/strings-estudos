package a;

public class string {

	public static void main(String[] args) {
		
		//criando string
		String nome = "Arthur";
		String nomeComparacao = "Arthur";
		String frase = "Eu sou Arthur, e temho 16 anos";
		
		//Concatenar 
		String comprimentar = "Olá, " + nome + " tudo bem?";
		System.out.println(comprimentar);
		
		//tamanho da string
		System.out.println("Tamanho da string: " + frase.length());
		
		//acessar caracteres especificos
		System.out.println("Acessar caracteres esécíficos:" + nome.charAt(0) + nome.charAt(1) + nome.charAt(2));
		
		//comparando strings
		if(nome.equals(nomeComparacao) == true) {
			System.out.println("os nomes são iguais");
		}
		
		else {
			System.out.println("Os nomes não são iguais");
		}
		
		// de maneira mais simples
		//System.out.println(nome + "e" + nome.equals(nomeComparacao) );
		
		//convertendo os caracteres para maiúsculos
		System.out.println(nome.toUpperCase());
		
		//convertendo os caracteres para minúsculas
		System.out.println(nome.toLowerCase());
		
		//verificar se tem tal palavra na String
		if(frase.contains("17") == true) {
			System.out.println("Tem essa palavra mesmo(17)");
		}
		
		else {
			System.out.println("Não tem essa palavra(17)");
		}
		
		//substituir palavras
//		frase = frase.replace("16", "17");
//		System.out.println(frase);
		
		System.out.println("Antiga frase: " + frase );
		System.out.println("Nova frase: " + frase.replace("16", "17"));
		
		
		//removendo algumas partes da string
		String parte = frase.substring(29,30);
		System.out.println(parte);
		
        
//		String fraseNova = frase;
//		
//		for(int menos = fraseNova.length(); menos < 16; menos++ ) {
//			fraseNova = fraseNova  + menos;
//		}
//		
		
//		
		//17
	}

}
