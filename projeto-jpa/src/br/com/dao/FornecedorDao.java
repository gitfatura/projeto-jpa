package br.com.dao;

import java.util.Date;
import java.util.List;

import br.com.entity.Fornecedor;
import br.com.entity.Produto;

public class FornecedorDao {

	private Dao<Fornecedor> dao = new Dao<Fornecedor>(Fornecedor.class);

	public void adiciona(Fornecedor t) {
		dao.adiciona(t);
	}

	public void update(Fornecedor t) {
		dao.update(t);
	}

	public void remove(Fornecedor t) {
		dao.remove(t);
	}

	public Fornecedor buscaPorId(Long id) {
		return dao.buscaPorId(id);
	}

	public List<Fornecedor> getAll() {
		return dao.getAll();
	}

	
	
	
	
}
