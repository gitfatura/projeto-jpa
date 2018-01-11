package br.com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "transportadora")
public class Transportadora {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idtransportadora;

	private String nome;
	private String cnpj;
	private String endereco;

	public Transportadora() {
	}

	public Transportadora(long idtransportadora, String nome, String cnpj, String endereco) {
		this.idtransportadora = idtransportadora;
		this.nome = nome;
		this.cnpj = cnpj;
		this.endereco = endereco;
	}

	public long getIdtransportadora() {
		return idtransportadora;
	}

	public void setIdtransportadora(long idtransportadora) {
		this.idtransportadora = idtransportadora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Transportadora [idtransportadora=" + idtransportadora + ", nome=" + nome + ", cnpj=" + cnpj
				+ ", endereco=" + endereco + "]";
	}

}
