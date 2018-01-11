package br.com.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Essa agenda e uma agenda interna para visitante da empresa interna
 */
@Entity(name = "agenda")
public class Agenda {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idagenda;

	private String local;
	private String visitado;
	private String visitante;
	@Temporal(TemporalType.DATE)
	private Date data;
	@Temporal(TemporalType.TIME)
	private Date hora;
	@Temporal(TemporalType.TIME)
	private Date tempo;
	private String status;

	public Agenda() {
	}

	public Agenda(long idagenda, String local, String visitado, String visitante, Date data, Date hora, Date tempo,
			String status) {
		this.idagenda = idagenda;
		this.local = local;
		this.visitado = visitado;
		this.visitante = visitante;
		this.data = data;
		this.hora = hora;
		this.tempo = tempo;
		this.status = status;
	}

	public long getIdagenda() {
		return idagenda;
	}

	public void setIdagenda(long idagenda) {
		this.idagenda = idagenda;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getVisitado() {
		return visitado;
	}

	public void setVisitado(String visitado) {
		this.visitado = visitado;
	}

	public String getVisitante() {
		return visitante;
	}

	public void setVisitante(String visitante) {
		this.visitante = visitante;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Date getHora() {
		return hora;
	}

	public void setHora(Date hora) {
		this.hora = hora;
	}

	public Date getTempo() {
		return tempo;
	}

	public void setTempo(Date tempo) {
		this.tempo = tempo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Agenda [idagenda=" + idagenda + ", local=" + local + ", visitado=" + visitado + ", visitante="
				+ visitante + ", data=" + data + ", hora=" + hora + ", tempo=" + tempo + ", status=" + status + "]";
	}

}
