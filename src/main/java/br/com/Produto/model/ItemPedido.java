package br.com.Produto.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_itempedido")
public class ItemPedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="num_sequencial")
	private Integer numSequencial;
	
	@Column(name="quantidade")
	private int quantidade;
	
	@Column(name="valorunitario")
	private Double valorunitario;
	
	@Column(name="valortotal")
	private  Double valortotal;

	@ManyToOne
	@JoinColumn(name="tbl_Produto")
	private Produto produto;
	
	@ManyToOne
	@JoinColumn(name="tbl_Pedido")
	@JsonIgnoreProperties("itens")
	private Pedido pedido;

	public Integer getNumSequencial() {
		return numSequencial;
	}
	

	public void setNumSequencial(Integer numSequencial) {
		this.numSequencial = numSequencial;
	}


	public double getValorunitario() {
		return valorunitario;
	}


	public void setValorunitario(Double valorunitario) {
		this.valorunitario = valorunitario;
	}


	public Double getValortotal() {
		return valortotal;
	}


	public void setValortotal(Double valortotal) {
		this.valortotal = valortotal;
	}


	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
}
