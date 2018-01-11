package br.com.dao;

import java.util.List;

import br.com.entity.VeiculoInterno;

public class VeiculoInternoDao {

	private Dao<VeiculoInterno> dao = new Dao<VeiculoInterno>(VeiculoInterno.class);

	public void adiciona(VeiculoInterno t) {
		dao.adiciona(t);
	}

	public void update(VeiculoInterno t) {
		dao.update(t);
	}

	public void remove(VeiculoInterno t) {
		dao.remove(t);
	}

	public VeiculoInterno buscaPorId(Long id) {
		return dao.buscaPorId(id);
	}

	public List<VeiculoInterno> getAll() {
		return dao.getAll();
	}

}
