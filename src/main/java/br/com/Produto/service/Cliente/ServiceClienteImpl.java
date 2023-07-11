package br.com.Produto.service.Cliente;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.Produto.Dao.ClienteDAO;
import br.com.Produto.dto.ClienteDto;
import br.com.Produto.model.Cliente;

@Component
public class ServiceClienteImpl implements IClienteService {

	 public ClienteDAO dao;
	
	@Override
	public ClienteDto salvar(ClienteDto clienteDto) {
		// TODO Auto-generated method stub
	var cliente = dao.save(clienteDto);
	}

	@Override
	public ClienteDto alterar(ClienteDto alterar) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletar(int deleta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ClienteDto> listartodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClienteDto buscar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}