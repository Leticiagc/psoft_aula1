package services;

import models.Produto;
import repositories.ProdutoRepository;

public class ProdutoService {
	
	private ProdutoRepository pr;
	
	public void createdProduto(String nome, String fabricante, double preco) {
		Produto produto = new Produto(nome, fabricante, preco);
		pr.addProduto(produto);
	}
	
	public String listarProdutos() {
		return pr.listaProdutos();
	}
}
