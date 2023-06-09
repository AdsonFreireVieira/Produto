package br.com.Produto.service.Pedido;

import java.util.List;

import br.com.Produto.model.pedido;

public interface IPedidoService {

	public pedido criarNovo(pedido novo);
	public pedido alterarDados(pedido alterar);
	public List<pedido> listar();
	public pedido buscarporId(int id);
	public void deletar(int id);
}
