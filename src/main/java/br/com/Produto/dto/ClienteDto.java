package br.com.Produto.dto;

import br.com.Produto.model.Cliente;

public class ClienteDto {
	
	private Integer id;
	private String nome;
	private String email;
	private int telefone;
	
	public ClienteDto() {
		
	}
	
	

	public ClienteDto(Integer id, String nome, String email, int telefone) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
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
