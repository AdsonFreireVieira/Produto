package br.com.Produto.service.Produto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.Produto.Dao.ProdutoDAO;
import br.com.Produto.model.Produto;
@Component
public class ServiceProdutoImpl  implements IProdutoService{

	@Autowired
	private ProdutoDAO dao;
	@Override
	public Produto cadastrarNovo(Produto novo) {
		
		return dao.save(novo) ;
	}

	@Override
	public Produto alterar(Produto produto) {
		
		return dao.save(produto);
	}

	@Override
	public List<Produto> listar() {
	
		return  (List<Produto>) dao.findAll();
	}

	@Override
	public Produto buscarPorId(int id) {
		
		return dao.findById(id).orElse(null);
	}

	@Override
	public void deletar(int deletar) {
		dao.deleteById(deletar);
		
	}

}
