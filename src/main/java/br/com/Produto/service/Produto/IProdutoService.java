package br.com.Produto.service.Produto;

import java.util.List;

import br.com.Produto.model.Produto;

public interface IProdutoService {
	
	public Produto cadastrarNovo(Produto novo);
	public Produto alterar (Produto produto);
	public List<Produto> listar();
	public Produto budscarPorId(int id);
	public void deletar(int deletar);
	
	

}
