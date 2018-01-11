package br.com.dao;

import java.util.List;

import br.com.entity.Categoria;

public class CategoriaDao {

	private Dao<Categoria> dao = new Dao<Categoria>(Categoria.class);

	public void adiciona(Categoria t) {
		dao.adiciona(t);
	}

	public void update(Categoria t) {
		dao.update(t);
	}

	public void remove(Categoria t) {
		dao.remove(t);
	}

	public Categoria buscaPorId(Long id) {
		return dao.buscaPorId(id);
	}

	public List<Categoria> getAll() {
		return dao.getAll();
	}

}
