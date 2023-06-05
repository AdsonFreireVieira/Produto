package br.com.Produto.Dao;

import org.springframework.data.repository.CrudRepository;

import br.com.Produto.model.Produto;

public interface ProdutoDAO  extends CrudRepository<Produto, Integer>{

}
