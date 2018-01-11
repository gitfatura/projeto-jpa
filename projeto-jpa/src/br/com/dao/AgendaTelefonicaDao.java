package br.com.dao;

import java.util.List;

import br.com.entity.AgendaTelefonica;

public class AgendaTelefonicaDao {

	private Dao<AgendaTelefonica> dao = new Dao<AgendaTelefonica>(AgendaTelefonica.class);

	public void adiciona(AgendaTelefonica t) {
		dao.adiciona(t);
	}

	public void update(AgendaTelefonica t) {
		dao.update(t);
	}

	public void remove(AgendaTelefonica t) {
		dao.remove(t);
	}

	public AgendaTelefonica buscaPorId(Long id) {
		return dao.buscaPorId(id);
	}

	public List<AgendaTelefonica> getAll() {
		return dao.getAll();
	}
	
	
		
}
