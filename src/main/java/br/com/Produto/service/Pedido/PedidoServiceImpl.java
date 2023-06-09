package br.com.Produto.service.Pedido;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.Produto.Dao.PedidoDAO;
import br.com.Produto.model.ItemPedido;
import br.com.Produto.model.pedido;

public class PedidoServiceImpl implements IPedidoService{

	 @Autowired
	 PedidoDAO  dao;
	 
	@Override
	public pedido criarNovo(pedido novo) {
		
    for(ItemPedido item: novo.getItens() ) {
    	
    	item.setPedido(novo);
    }
		return dao.save(novo);
	}

	@Override
	public pedido alterarDados(pedido alterar) {
		// TODO Auto-generated method stub
		return dao.save(alterar);
	}

	@Override
	public List<pedido> listar() {
		// TODO Auto-generated method stub
		return (List<pedido>) dao.findAll();
	}

	@Override
	public pedido buscarporId(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id).orElse(null);
	}

	@Override
	public void deletar(int id) {
	    dao.deleteById(id);
		
	}

}
