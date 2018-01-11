package br.com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idcliente;

	private String nome;
	private String cpf;

	public Cliente() {
	}

	public Cliente(long idcliente, String nome, String cpf) {
		this.idcliente = idcliente;
		this.nome = nome;
		this.cpf = cpf;
	}

	public long getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(long idcliente) {
		this.idcliente = idcliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Cliente [idcliente=" + idcliente + ", nome=" + nome + ", cpf=" + cpf + "]";
	}

}
