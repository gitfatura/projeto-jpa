package br.com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "funcionario")
public class Funcionario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idfuncionario;
	private String nome;
	private String cpf;

	public Funcionario() {
	}

	public Funcionario(long idfuncionario, String nome, String cpf) {
		this.idfuncionario = idfuncionario;
		this.nome = nome;
		this.cpf = cpf;
	}

	public long getIdfuncionario() {
		return idfuncionario;
	}

	public void setIdfuncionario(long idfuncionario) {
		this.idfuncionario = idfuncionario;
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
		return "Funcionario [idfuncionario=" + idfuncionario + ", nome=" + nome + ", cpf=" + cpf + "]";
	}

}
