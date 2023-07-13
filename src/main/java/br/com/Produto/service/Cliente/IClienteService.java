package br.com.Produto.service.Cliente;

import java.util.List;

import br.com.Produto.dto.ClienteDto;
import br.com.Produto.model.Cliente;



public interface IClienteService {
	
	public ClienteDto salvar(Cliente cliente);
	public ClienteDto alterarDados(Cliente alterar);
	public void   deletar( int deleta);
	public List<ClienteDto> listartodos();
	public ClienteDto buscar(int id); 

}
