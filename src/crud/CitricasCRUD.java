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
	int posicao = 0;
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
			
			Citricas c1 = new Citricas(id, nomeFruta, precoFruta);
			citricaDAO.save(c1);
			System.out.println("Fruta cadastrada! \n");
			break;
			
		case 2: //READ
			for (Citricas c : citricaDAO.getCitricas()) {
				if (c == null) {
					System.out.println("\nNão há frutas cadastradas");
				} else {
					System.out.println("Id: " + c.getId() + " - Nome: " + c.getNomeFruta() + " - Preço: " + c.getPrecoFruta());
				}
			}
			System.out.println("\n");
			break;
			
		case 3: //UPDATE
			System.out.println("Digite o id da fruta: ");
			posicao = sc.nextInt();
			sc.nextLine();
			System.out.println("Digite o nome da fruta: ");
			nomeFruta = sc.nextLine();
			System.out.println("Digite o preco da fruta");
			precoFruta = sc.nextDouble();
			
			Citricas c2 = new Citricas (posicao, nomeFruta, precoFruta);
			citricaDAO.update(c2);
			System.out.println("Fruta atualizada\n");	
			
			break;
			
		case 4: //DELETE
			System.out.println("Digite o id da fruta: ");
			posicao = sc.nextInt();
			
			citricaDAO.delete(posicao);
			System.out.println("Fruta deletada\n");
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

