package br.com.Produto.service.Pedido;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.Produto.Dao.PedidoDAO;
import br.com.Produto.model.ItemPedido;
import br.com.Produto.model.Pedido;

@Component
public class PedidoServiceImpl implements IPedidoService {

	@Autowired
	PedidoDAO dao;

	@Override
	public Pedido criarNovo(Pedido novo) {
        
		double total = 0;
		int quantidade = 0;
		
		for (ItemPedido item : novo.getItens()) {

			item.setPedido(novo);
			total =+ item.getValortotal();
			quantidade =+item.getQuantidade();
			
			
	
		}
		novo.setValorTotal(total);
		novo.setDesconto(calculaDesconto(novo.getValorTotal())); 
		novo.setQuantidade(quantidade);
		

		return dao.save(novo);
	}

	@Override
	public Pedido alterarDados(Pedido alterar) {
		// TODO Auto-generated method stub
		return dao.save(alterar);
	}

	@Override
	public List<Pedido> listar() {
		// TODO Auto-generated method stub
		return (List<Pedido>) dao.findAll();
	}

	@Override
	public Pedido buscarporId(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id).orElse(null);
	}

	@Override
	public void deletar(int id) {
		dao.deleteById(id);

	}

	@Override
	public Double calculaDesconto(double valorTotal) {

		double vdesc = 0;

		if (valorTotal > 500.00) {

			vdesc = (valorTotal * 10) / 100;
			return vdesc;
		} else if (valorTotal > 100 && valorTotal < 500) {
			vdesc = (valorTotal * 5) / 100;

			return vdesc;
		}

		return 0.0;
	}
	@Override
	public String statusPedido(int valorStatus) {
		 
		switch (valorStatus) {
		
		case 1: {
		  return "Em Preparo";	
		}
		case 2 :{
			return "Finalizado";
		}
		case 3 :{
			return "Entregue";
		}
		default:{
			return "NAO Encontrado";
		}
		}
	}

}
