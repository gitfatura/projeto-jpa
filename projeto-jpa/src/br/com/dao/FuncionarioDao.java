package br.com.dao;

import java.util.List;

import br.com.entity.Funcionario;

public class FuncionarioDao {

	private Dao<Funcionario> dao = new Dao<Funcionario>(Funcionario.class);

	public void adiciona(Funcionario t) {
		dao.adiciona(t);
	}

	public void update(Funcionario t) {
		dao.update(t);
	}

	public void remove(Funcionario t) {
		dao.remove(t);
	}

	public Funcionario buscaPorId(Long id) {
		return dao.buscaPorId(id);
	}

	public List<Funcionario> getAll() {
		return dao.getAll();
	}

	
	
	
}
