package crud;

import java.util.Scanner;

import dao.CitricasDAO;
import model.Citricas;

public class CitricasCRUD {
	
	public static void main (String[] args) {
	
	CitricasDAO citricaDAO = new CitricasDAO();
	
	//ENTRADA DE DADOS
	Scanner sc = new Scanner(System.in);
	int opcao = 0;
	int id = 0;
	String nomeFruta = "";
	double precoFruta = 0;
	
	do {
		System.out.println("----- CRUD REVISAO -----");
		System.out.println("1 - Cadastrar (CREATE)");
		System.out.println("2 - Consultar (READ) ");
		System.out.println("3 - Atualizar (UPDATE) ");
		System.out.println("4 - Deletar (DELETE) ");
		System.out.println("0 - Sair ");
		opcao = sc.nextInt();
		sc.nextLine();
		
		switch (opcao) {
		case 1: //CREATE
			System.out.println("Digite o nome da fruta: ");
			nomeFruta = sc.nextLine();
			System.out.println("Digite o valor da fruta: ");
			precoFruta = sc.nextDouble();
			sc.nextLine();
			
			Citricas c1 = new Citricas(id, nomeFruta, precoFruta);
			citricaDAO.save(c1);
			System.out.println("Fruta cadastrada! \n");
			break;
			
		case 2:
			System.out.println();
			break;
		case 3:
			System.out.println();
			break;
		case 4:
			System.out.println();
			break;
		default:
			System.out.println();
			break;
			
		}
		
		
	} while (opcao != 0);
	
	System.out.println ("Sistema finalizado!");
	sc.close();
}
}

