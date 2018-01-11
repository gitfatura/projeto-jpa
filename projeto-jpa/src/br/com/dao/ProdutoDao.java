package br.com.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.entity.Produto;

public class ProdutoDao {

	private final EntityManager manager = new JPAUtil().getEntityManager();

	private Dao<Produto> dao = new Dao<Produto>(Produto.class);

	public void adiciona(Produto t) {
		dao.adiciona(t);
	}

	public void update(Produto t) {
		dao.update(t);
	}

	public void remove(Produto t) {
		dao.remove(t);
	}

	public Produto buscaPorId(Long id) {
		return dao.buscaPorId(id);
	}

	public List<Produto> getAll() {
		return dao.getAll();
	}

	public void entradaProduto(Produto p) {
		manager.getTransaction().begin();
		Query query = manager.createQuery(
				"update produto p set p.quantidade = p.quantidade + :novaquantidade where p.idproduto = :idproduto");
		query.setParameter("novaquantidade", p.getQuantidade());
		query.setParameter("idproduto", p.getIdproduto());
		query.executeUpdate();
		manager.getTransaction().commit();
		manager.close();
	}

	public void saidaProduto(Produto p) {
		manager.getTransaction().begin();
		Query query = manager.createQuery(
				"update produto p set p.quantidade = p.quantidade - :novaquantidade where p.idproduto = :idproduto");
		query.setParameter("novaquantidade", p.getQuantidade());
		query.setParameter("idproduto", p.getIdproduto());
		query.executeUpdate();
		manager.getTransaction().commit();
		manager.close();
	}

	@SuppressWarnings("unchecked")
	public List<Produto> getPorData(Date inicio, Date fim) {
		Query query = manager.createQuery("select p from produto p where p.data between :dinicio and :dfim");
		query.setParameter("dinicio", inicio);
		query.setParameter("dfim", fim);
		return query.getResultList();

	}

}
