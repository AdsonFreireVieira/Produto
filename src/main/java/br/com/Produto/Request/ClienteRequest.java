package br.com.Produto.Request;


public class ClienteRequest {
	
	private String nome;
	
	private String email;
	
	private int telefone;
	
	private String endereco;
	
	private String cidade;
	
	private int  numero;
	
	public ClienteRequest() {
		
	}
	public ClienteRequest(String nome, String email, int telefone, String endereco, String cidade, int numero) {
	
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
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
