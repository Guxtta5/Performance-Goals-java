package Menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		//IMPORTES
		 Scanner leia = new Scanner(System.in);
		 
		 //VARIAVEIS
		 int opcao, TipoDePoduto;
		 String NomeDoProduto, Bebida, Comestiveis;
		 float valor; 
		 //LOOP
		 while(true)
			 
		 System.out.println("------------------------------------------------------------");
		 System.out.println(".                                                           ");
		 System.out.println("                1 - Adicionar Produto                       ");
		 System.out.println("                2 - Listar Produtos                         ");
		 System.out.println("                3 - Procurar Produto                        ");
		 System.out.println("                4 - Deletar                                 ");
		 System.out.println("                                                            ");
		 System.out.println("------------------------------------------------------------");
		 System.out.println("               Qual opção que desehja seguir?               ");
		 
		 try {
			 opcao = leia.nextInt();
		 }catch(InputMismatchException e) {
			 System.out.println("Digete um número inteiro");
			 leia.nextLine();
			 opcao = 0;
		 }
		 
		 if (opcao == 4) {
			 System.out.println(" Seja Bem Vindo, gostaria de ajuda? ");
			 leia.close();
			 System.exit(0);
		 }
		 
		 switch(opcao) {
		 case 1: 
			 System.out.println("Adicionando um Produto");
			 System.out.println("Nome do Produto");
			 NomeDoProduto = leia.nextLine();
			 System.out.println("Qual valor do Produto");
			 valor = leia.nextInt();
			 break;
			 
		 case 2:
			 System.out.println("lista de Todos os Produtos\n");
			 produtos.listarTodos();
			 break;
		 case 3:
			 System.out.println("Procurar produto\n");
			 System.out.println("id do produto");
			 id = leia.nextInt();
			 
			 
		 case 4:
			 System.out.println("deletar do Produto\n");
			 System.out.println("id do Produto");
			 id = leia.nextInt();
		 
			 produtos.deletar(id);
			 
		 }
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
