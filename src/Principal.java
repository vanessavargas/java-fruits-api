import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		//ENTRADA DE DADOS
		//DECLARAÇÃO DO SCANNER
		Scanner sc = new Scanner (System.in);
		
		//VARIÁVEIS
		//tipo - nome da variável
		String nome;
		String fruta;
		int nota;
		
		//SAÍDA DE DADOS
		System.out.println("Qual seu nome?");
		nome = sc.nextLine();
		
		System.out.println("Qual sua fruta preferida?");
		fruta = sc.nextLine();
		
		System.out.println("Que legal " + nome + ", também gosto de " + fruta);
		System.out.println("");
		
		//ESTRUTURA DE REPETICAO
		do {
			System.out.println("De 0 a 10, qual sua nota pra essa fruta?");
			nota = sc.nextInt();
		
			//ESTRUTURA CONDICIONAL
			if (nota == 0) {
				System.out.println("Opa! Então vc não gosta dessa fruta");
				
				//ENCADEAMENTO DE CONDICIONAIS
			} else if (nota > 0 && nota <= 5){
				System.out.println("Ah.. vc não gosta tanto assim");
			} else if (nota > 5){
				System.out.println("Legal");
			}
		} while (nota < 0);
		
		//OPERADOR TERNÁRIO
		System.out.println((nota <= 5) ? "Mas obrigada pela informação!" : "Até que é uma boa nota");
		sc.close();		
	}

}
