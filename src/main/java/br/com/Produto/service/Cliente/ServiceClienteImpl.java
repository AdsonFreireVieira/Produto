package br.com.Produto.service.Cliente;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.Produto.Dao.ClienteDAO;
import br.com.Produto.dto.ClienteDto;
import br.com.Produto.model.Cliente;

@Component
public class ServiceClienteImpl implements IClienteService {

	private final ClienteDAO dao = null;
	
	@Override
	public Cliente salvar(Cliente cliente) {
		
		return dao.save(cliente);
	}

	@Override
	public Cliente alterar(Cliente alterar) {
		
		return dao.save(alterar);
	}

	@Override
	public void deletar(int deleta) {
	
		dao.deleteById(deleta);
		
	}

	@Override
	public List<Cliente> listartodos() {
		
		return dao.findByOrderByNomeAsc();
	}

	@Override
	public Cliente buscar(int id) {
		// TODO Auto-generated method stu
		return dao.findById(id).orElse(null);
	}
}
