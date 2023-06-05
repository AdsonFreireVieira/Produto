package br.com.Produto.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.Produto.model.Cliente;


public interface ClienteDAO extends JpaRepository<Cliente, Integer> {
	
	public  List<Cliente> findByOrderByNomeAsc();

}
