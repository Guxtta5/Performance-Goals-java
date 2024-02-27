package Model;

import Repository.Repository;

public abstract class Produtos implements Repository {
	
	private int id;
	private int tipo;
	private float preco;
	private String nomeDoProduto;
	
	
	public Produtos(int id, int tipo, float preco, String nomeDoProduto) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.preco = preco;
		this.nomeDoProduto = nomeDoProduto;
	}
	
	public Produtos() {}

	public int getId() {
		return id;
	}

	public int getTipo() {
		return tipo;
	}

	public float getPreco() {
		return preco;
	}

	public String getNomeDoProduto() {
		return nomeDoProduto;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public void setNomeDoProduto(String nomeDoProduto) {
		this.nomeDoProduto = nomeDoProduto;
	}
	
	public void visualizar() {
		
	}
	
}
