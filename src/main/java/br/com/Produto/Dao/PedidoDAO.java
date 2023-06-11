package br.com.Produto.Dao;

import org.springframework.data.repository.CrudRepository;

import br.com.Produto.model.Pedido;

public interface PedidoDAO extends CrudRepository<Pedido, Integer> {

}
