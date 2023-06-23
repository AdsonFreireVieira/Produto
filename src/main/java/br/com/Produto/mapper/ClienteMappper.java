package br.com.Produto.mapper;

import br.com.Produto.Request.ClienteRequest;
import br.com.Produto.Response.ClienteResponse;
import br.com.Produto.model.Cliente;

public class ClienteMappper {

	public static Cliente toCliente(ClienteRequest request){
	
       Cliente cliente = new Cliente();
       
       
		cliente.setNome(request.getNome());
		cliente.setNumero(request.getNumero());
		cliente.setEmail(request.getEmail());
		cliente.setEndereco(request.getEndereco());
		cliente.setCidade(request.getCidade());
		cliente.setTelefone(request.getTelefone());
		
		return cliente;
	}
	
	public static ClienteResponse toClienteResponse(Cliente cliente){
		
		var response = new ClienteResponse();
		
		response.setId(cliente.getId());
		response.setEmail(cliente.getEmail());
		response.setEndereco(cliente.getEndereco());
		response.setNome(cliente.getNome());
		response.setCidade(cliente.getCidade());
		response.setCep(cliente.getCep());
		response.setNumero(cliente.getNumero());
		response.setTelefone(cliente.getTelefone());
		
		return response;
	} 
}
