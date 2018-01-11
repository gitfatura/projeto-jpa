package br.com.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "produto")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idproduto;
	private String descricao;
	private int quantidade;
	private BigDecimal preco;
	@ManyToOne
	@JoinColumn
	private Fornecedor fornecedor;
	@ManyToOne
	@JoinColumn
	private Categoria categoria;

	@Temporal(TemporalType.DATE)
	private Date data;

	public Produto() {
	}

	public Produto(long idproduto, String descricao, int quantidade, BigDecimal preco, Date data, Fornecedor fornecedor,
			Categoria categoria) {
		this.idproduto = idproduto;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.preco = preco;
		this.data = data;
		this.fornecedor = fornecedor;
		this.categoria = categoria;
	}

	public long getIdproduto() {
		return idproduto;
	}

	public void setIdproduto(long idproduto) {
		this.idproduto = idproduto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Produto [idproduto=" + idproduto + ", descricao=" + descricao + ", quantidade=" + quantidade
				+ ", preco=" + preco + ", fornecedor=" + fornecedor + ", categoria=" + categoria + ", data=" + data
				+ "]";
	}

}
