package br.com.Produto.service.Cliente;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.Produto.Dao.ClienteDAO;
import br.com.Produto.model.Cliente;

@Component
public class ServiceClienteImpl implements IClienteService {

	@Autowired
	private ClienteDAO  dao;
	
	@Override
	public Cliente salvar(Cliente cliente) {
		// TODO Auto-generated method stub
		return dao.save(cliente);
	}

	@Override
	public Cliente alterar(Cliente alterar) {
		// TODO Auto-generated method stub
		return dao.save(alterar);
	}

	@Override
	public void deletar(int deleta) {
		dao.deleteById(deleta);
		
	}

	@Override
	public List<Cliente> listartodos() {
		// TODO Auto-generated method stub
		  return dao.findAll();
	}

	@Override
	public Cliente buscar(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id).orElse(null);
	}
	
	
	
}
