package br.com.dao;

import java.util.List;

import br.com.entity.Cliente;

public class ClienteDao {

	private Dao<Cliente> dao = new Dao<Cliente>(Cliente.class);

	public void adiciona(Cliente t) {
		dao.adiciona(t);
	}

	public void update(Cliente t) {
		dao.update(t);
	}

	public void remove(Cliente t) {
		dao.remove(t);
	}

	public Cliente buscaPorId(Long id) {
		return dao.buscaPorId(id);
	}

	public List<Cliente> getAll() {
		return dao.getAll();
	}

	
	
	
}
