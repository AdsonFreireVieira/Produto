package br.com.Produto.dto;

import br.com.Produto.model.Cliente;

public class ClienteDTO {
    
	private Integer id;
	private String nome;
	
	public ClienteDTO() {
		// TODO Auto-generated constructor stub
	}

	public ClienteDTO(Integer id, String nome) {
		
		this.id = id;
		this.nome = nome;
	}
	
	public ClienteDTO(Cliente cliente){
		
		this.id = cliente.getId();;
		this.nome =cliente.getNome();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
}
