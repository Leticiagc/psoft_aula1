import models.Lote;
import models.Produto;
import repositories.LoteRepository;
import repositories.ProdutoRepository;
import services.LoteService;
import services.ProdutoService;

public class Facade {
	
	private ProdutoRepository ps;
	private LoteRepository ls;
	
	public Facade() {
		this.ls = new LoteRepository();
		this.ps = new ProdutoRepository();
	}
	
	public void criarProduto(Produto produto) {
		this.ps.addProduto(produto);
	}
	
	public void criarLote(Lote lote) {
		this.ls.createdLote(lote);
	}

}
