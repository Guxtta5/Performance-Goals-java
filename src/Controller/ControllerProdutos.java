package Controller;

import java.util.ArrayList;

import Model.Produtos;
import Repository.Repository;

public class ControllerProdutos implements Repository {

	private ArrayList<Produtos> ListarTodos = new ArrayList<Produtos>();
	int id = 0;

	@Override
	public void Adicionar(Produtos Produto) {
		ListarTodos.add(Produto);
		System.out.println("O Produto: " + Produto.getNomeDoProduto() + " foi adicionado com sucesso!!");

	}

	@Override
	public void ListarTodos() {
		for (var Produto : ListarTodos) {
			Produto.visualizar();
		}
	}

	@Override
	public void ConsutarId(int id) {
		var Produto = buscarNaCollection(id);
		if(Produto != null) {
			Produto.visualizar();
		}else 
			System.out.println("O Produto de id:" + id + " não foi encontado");

	}

	@Override
	public void Atualizar(Produtos Produto) {
		var buscarProduto = buscarNaCollection(Produto.getId());
		if(buscarProduto != null) {
			ListarTodos.set(ListarTodos.indexOf(buscarProduto), Produto);
			System.out.println("O produto de id:" + Produto.getId() + " foi atualizado");
		}else 
			System.out.println("O produto de id:" + Produto.getId() + " não foi encontrado");
	}

	@Override
	public void Deletar(int id) {
		var Produto = buscarNaCollection(id);
		if (Produto != null) {
			if (ListarTodos.remove(Produto) == true)
				System.out.println("O Produto com id:" + id + " foi deletado cokm sucesso!!");
		}else {
			System.out.println("O Produto dom id:" + id + " não foi encontrado");
		}

	}

	public int gerarId() {
		return ++id;
	}

	public Produtos buscarNaCollection(int id) {
		for (var Produto : ListarTodos) {
			if (Produto.getId() == id) {
				return Produto;
			}
		}
		return null;
	}
}
