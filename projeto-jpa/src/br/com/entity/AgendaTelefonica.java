package br.com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="agendatelefonica")
public class AgendaTelefonica {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idagendatelefonica;
	private String nome;
	private String numero;

	public AgendaTelefonica() {
	}

	public AgendaTelefonica(long idagendatelefonica, String nome, String numero) {
		this.idagendatelefonica = idagendatelefonica;
		this.nome = nome;
		this.numero = numero;
	}

	public long getIdagendatelefonica() {
		return idagendatelefonica;
	}

	public void setIdagendatelefonica(long idagendatelefonica) {
		this.idagendatelefonica = idagendatelefonica;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "AgendaTelefonica [idagendatelefonica=" + idagendatelefonica + ", nome=" + nome + ", numero=" + numero
				+ "]";
	}

}
