package br.com.Produto.service.Cliente;

import java.util.List;

import br.com.Produto.Request.ClienteRequest;
import br.com.Produto.Response.ClienteResponse;
import br.com.Produto.model.Cliente;

public interface IClienteService {
	
	public Cliente  salvar(Cliente clienteRequest);
	public Cliente alterar(Cliente alterar);
	public void   deletar( int deleta);
	public List<Cliente> listartodos();
	public Cliente buscar(int id); 

}
