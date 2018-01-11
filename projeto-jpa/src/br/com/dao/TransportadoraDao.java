package br.com.dao;

import java.util.List;

import br.com.entity.Transportadora;

public class TransportadoraDao {

	private Dao<Transportadora> dao = new Dao<Transportadora>(Transportadora.class);

	public void adiciona(Transportadora t) {
		dao.adiciona(t);
	}

	public void update(Transportadora t) {
		dao.update(t);
	}

	public void remove(Transportadora t) {
		dao.remove(t);
	}

	public Transportadora buscaPorId(Long id) {
		return dao.buscaPorId(id);
	}

	public List<Transportadora> getAll() {
		return dao.getAll();
	}

	
	
	
	
}
