package com.produtos.apireste.models;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Para definir que é uma entidade de banco
@Entity

//Define o nome da tabela
@Table(name="TB_PRODUTO")
public class Produto implements Serializable{
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public BigDecimal getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(BigDecimal quantidade) {
		this.quantidade = quantidade;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	private static final long serialVersionUID = 1L;
	
	//Define o id
	@Id
	
	//Define o auto increment do id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String nome;
	
	private BigDecimal quantidade;
	
	private BigDecimal valor;
}
