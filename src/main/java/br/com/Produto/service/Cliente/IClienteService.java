package br.com.Produto.service.Cliente;

import java.util.List;

import br.com.Produto.Request.ClienteRequest;
import br.com.Produto.Response.ClienteResponse;
import br.com.Produto.dto.ClienteDto;
import br.com.Produto.model.Cliente;

public interface IClienteService {
	
	public ClienteDto  salvar(ClienteDto clienteRequest);
	public ClienteDto alterar(ClienteDto alterar);
	public void   deletar( int deleta);
	public List<Cliente> listartodos();
	public ClienteDto buscar(int id); 

}
