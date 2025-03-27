package a;
import java.util.Scanner;

public class string2 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Digite uma frase: ");
		String frase = input.nextLine();
		
		//quantos caracter
		System.out.println("Sua frase tem: " + frase.length() + " caractéres");
		
		//frase em letras minúsculas
		System.out.println("Sua frase em letras minúsculas: " + frase.toLowerCase());
		
		//frase em letra maiúscula
		System.out.println("Sua frase em letra maiúscula: " + frase.toUpperCase());
		
        //frase sem espaço
		System.out.println("Sua frase sem espaço: " + frase.replace(" ", ""));
	}

}
