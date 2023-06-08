package br.com.Produto.Dao;

import org.springframework.data.repository.CrudRepository;

import br.com.Produto.model.pedido;

public interface PedidoDAO extends CrudRepository<pedido, Integer> {

}
