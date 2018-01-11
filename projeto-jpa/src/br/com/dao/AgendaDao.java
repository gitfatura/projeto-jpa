package br.com.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.entity.Agenda;

public class AgendaDao {

	private final EntityManager manager = new JPAUtil().getEntityManager();
	
	public void adiciona(Agenda agenda) {
		manager.getTransaction().begin();
		manager.persist(agenda);
		manager.getTransaction().commit();
		manager.close();
	}

	public void update(Agenda agenda) {
		manager.getTransaction().begin();
		manager.merge(agenda);
		manager.getTransaction().commit();
		manager.close();
	}

	public void remove(Agenda agenda) {
		manager.getTransaction().begin();
		manager.remove(manager.merge(agenda));
		manager.getTransaction().commit();
		manager.close();
	}

	public Agenda buscaPorId(Long id) {
		return manager.find(Agenda.class, id);
	}

	public void finalizaVisita(Agenda a) {
		manager.getTransaction().begin();
		Query query = manager.createQuery("update agenda a set a.status =:status  where a.idagenda =:idagenda")
				.setParameter("idagenda", a.getIdagenda()).setParameter("status", a.getStatus());
		query.executeUpdate();
		manager.getTransaction().commit();
		manager.close();

	}

	@SuppressWarnings("unchecked")
	public List<Agenda> getAgendaEmAberto() {
		return manager.createQuery("select a from agenda a where a.status = null").getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<Agenda> getPorData(Date inicio, Date fim) {
		return manager.createQuery("select a from agenda a where a.data between :dinicio and :dfim")
				.setParameter("dinicio", inicio).setParameter("dfim", fim).getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<Agenda> getAll() {
		return manager.createQuery("select a from agenda a").getResultList();
	}

}
