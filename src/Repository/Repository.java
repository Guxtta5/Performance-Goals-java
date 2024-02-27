package Repository;

import Model.Produtos;

public interface Repository {
	
	public void Adicionar(Produtos Produto);

	public void ListarTodos();

	public void ConsutarId(int id);

	public void Atualizar(Produtos Produto);

	public void Deletar(int id);
}
