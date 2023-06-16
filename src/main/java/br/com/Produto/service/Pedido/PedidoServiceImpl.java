package br.com.Produto.service.Pedido;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.ReflectionUtils.DescribedFieldFilter;
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


		for (ItemPedido item : novo.getItens()) {

			item.setPedido(novo);
		}

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isNumber(Double valor) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String statusPedido(int valorStatus) {
		// TODO Auto-generated method stub
		return null;
	}

}
