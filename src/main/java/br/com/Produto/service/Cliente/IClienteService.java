package br.com.Produto.service.Cliente;

import java.util.List;

import br.com.Produto.Request.ClienteRequest;
import br.com.Produto.Response.ClienteResponse;

public interface IClienteService {
	
	public ClienteResponse  salvar(ClienteRequest clienteRequest);
	public ClienteResponse alterar(ClienteRequest alterar);
	public void   deletar( int deleta);
	public List<ClienteResponse> listartodos();
	public ClienteResponse buscar(int id); 

}
