package br.com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="categoria")
public class Categoria {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idcategoria;
	private String descricao;

	public Categoria() {
	}

	public Categoria(long idcategoria, String descricao) {
		this.idcategoria = idcategoria;
		this.descricao = descricao;
	}

	public long getIdcategoria() {
		return idcategoria;
	}

	public void setIdcategoria(long idcategoria) {
		this.idcategoria = idcategoria;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Categoria [idcategoria=" + idcategoria + ", descricao=" + descricao + "]";
	}

}
