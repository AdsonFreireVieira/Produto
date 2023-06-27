package br.com.Produto.dto;

import br.com.Produto.model.Cliente;

public class ClienteDto {
	
	private String nome;
	
	
	private String email;
	private int telefone;
	private int cep;
    private String endereco;
    private String cidade;
	private int  numero;
	
	public ClienteDto() {
		// TODO Auto-generated constructor stub
	}
	
	public ClienteDto clienteRequest(Cliente cliente) {
		
		ClienteDto Cdt = new ClienteDto();
				
		Cdt.setCep(cliente.getCep());
		Cdt.setCidade(cliente.getCidade());
		Cdt.setEmail(cliente.getEmail());
	    Cdt.setEndereco(cliente.getEndereco());
	    Cdt.setNome(cliente.getNome());
	    Cdt.setNumero(cliente.getNumero());
	    Cdt.setTelefone(cliente.getTelefone());

	    return Cdt;
	}
  
	public ClienteDto(String nome, String email, int telefone, int cep, String endereco, String cidade, int numero) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.cep = cep;
		this.endereco = endereco;
		this.cidade = cidade;
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	

}
