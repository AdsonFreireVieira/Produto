package br.com.Produto.dto;

import br.com.Produto.model.Cliente;

public class ClienteDto {
	
	private Integer id;
	private String nome;
	private String email;
	private int telefone;
	
	public ClienteDto() {
		
	}

	public ClienteDto(Cliente cliente) {
		
		id = cliente.getId();
		nome = cliente.getNome();
	    email = cliente.getEmail();
		telefone = cliente.getTelefone();
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public int getTelefone() {
		return telefone;
	}
	
	
	
	

}
