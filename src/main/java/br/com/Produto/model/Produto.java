package br.com.Produto.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_Produto")
	private Integer id;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="cor")
	private String cor;
	
	@Column(name="litros")
    private int  litros;
	
	@Column(name="descricao")
    private String descricao;

}
