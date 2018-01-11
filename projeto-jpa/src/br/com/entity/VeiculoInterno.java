package br.com.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "veiculointerno")
public class VeiculoInterno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idveiculonterno;
	
	private String placa;
	
	@ManyToOne
	@JoinColumn
	private Funcionario funcionario;// motorista
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date saida;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date entrada;
	
	@Enumerated
	private Tipo tipo;
	
	private String avaria;
	private String obs;

	public VeiculoInterno() {
	}

	public VeiculoInterno(long idveiculonterno, String placa, Funcionario funcionario, Date saida, Date entrada,
			Tipo tipo, String avaria, String obs) {
		this.idveiculonterno = idveiculonterno;
		this.placa = placa;
		this.funcionario = funcionario;
		this.saida = saida;
		this.entrada = entrada;
		this.tipo = tipo;
		this.avaria = avaria;
		this.obs = obs;
	}

	public long getIdveiculonterno() {
		return idveiculonterno;
	}

	public void setIdveiculonterno(long idveiculonterno) {
		this.idveiculonterno = idveiculonterno;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Date getSaida() {
		return saida;
	}

	public void setSaida(Date saida) {
		this.saida = saida;
	}

	public Date getEntrada() {
		return entrada;
	}

	public void setEntrada(Date entrada) {
		this.entrada = entrada;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public String getAvaria() {
		return avaria;
	}

	public void setAvaria(String avaria) {
		this.avaria = avaria;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	@Override
	public String toString() {
		return "VeiculoInterno [idveiculonterno=" + idveiculonterno + ", placa=" + placa + ", funcionario="
				+ funcionario + ", saida=" + saida + ", entrada=" + entrada + ", tipo=" + tipo + ", avaria=" + avaria
				+ ", obs=" + obs + "]";
	}

}
