package repositories;

import java.util.Map;

import models.Produto;

public class ProdutoRepository {

	Map<String, Produto> produtos;
	
	public void addProduto(Produto produto) {
		produtos.put(produto.getId(), produto);
	}

	//public String listaProdutos() {
		// produto
	//}
}

