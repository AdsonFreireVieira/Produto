package br.com.Produto.Response;


public class ClienteResponse {

	private Integer id;

	private String nome;

	private String email;

	private int telefone;

	private int cep;

	private String endereco;

	private String cidade;

	private int numero;

	public ClienteResponse() {

	}
    
	
	public ClienteResponse(Integer id, String nome, String email, int telefone, int cep, String endereco, String cidade,
			int numero) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.cep = cep;
		this.endereco = endereco;
		this.cidade = cidade;
		this.numero = numero;
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
