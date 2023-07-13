package br.com.Produto.service.Cliente;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.Produto.Dao.ClienteDAO;
import br.com.Produto.dto.ClienteDto;
import br.com.Produto.model.Cliente;

@Component
public class ServiceClienteImpl implements IClienteService {
   
	@Autowired
	 public ClienteDAO dao;
	
	@Override
	public ClienteDto salvar(Cliente cliente) {
		// TODO Auto-generated method stub
				
		Cliente cli = new Cliente();
		
		cli = dao.save(cli);
		
	   ClienteDto cliDto = new ClienteDto(cli);
	   
	   return  cliDto;
	}

	@Override
	public ClienteDto alterarDados(Cliente alterar){
	
		Cliente cli = new Cliente();
		
		cli=dao.save(alterar);
		
		ClienteDto dto = new ClienteDto(cli);
		return dto;
	}

	@Override
	public void deletar(int deleta) {
      
		dao.deleteById(deleta);
	}

	@Override
	public List<ClienteDto> listartodos() {
		
	
		return null;
	}



	@Override
	public ClienteDto buscar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	

}