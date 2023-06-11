package br.com.Produto.service.Pedido;

import java.util.List;

import br.com.Produto.model.Pedido;

public interface IPedidoService {

	public Pedido criarNovo(Pedido novo);
	public Pedido alterarDados(Pedido alterar);
	public List<Pedido> listar();
	public Pedido buscarporId(int id);
	public void deletar(int id);
}
