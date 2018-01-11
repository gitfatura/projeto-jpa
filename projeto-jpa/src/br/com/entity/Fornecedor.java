package br.com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="fornecedor")
public class Fornecedor {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idfornecedor;
	private String nome;
	private String fantasia;

	public Fornecedor() {
	}

	public Fornecedor(long idfornecedor, String nome, String fantasia) {
		this.idfornecedor = idfornecedor;
		this.nome = nome;
		this.fantasia = fantasia;
	}

	public long getIdfornecedor() {
		return idfornecedor;
	}

	public void setIdfornecedor(long idfornecedor) {
		this.idfornecedor = idfornecedor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFantasia() {
		return fantasia;
	}

	public void setFantasia(String fantasia) {
		this.fantasia = fantasia;
	}

	@Override
	public String toString() {
		return "Fornecedor [idfornecedor=" + idfornecedor + ", nome=" + nome + ", fantasia=" + fantasia + "]";
	}

}
