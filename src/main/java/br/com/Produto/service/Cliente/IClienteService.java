package br.com.Produto.service.Cliente;

import java.util.List;

import br.com.Produto.dto.ClienteDto;



public interface IClienteService {
	
	public ClienteDto salvar(ClienteDto clienteDto);
	public ClienteDto alterar(ClienteDto alterar);
	public void   deletar( int deleta);
	public List<ClienteDto> listartodos();
	public ClienteDto buscar(int id); 

}
