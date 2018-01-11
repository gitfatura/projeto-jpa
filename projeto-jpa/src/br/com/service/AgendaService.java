package br.com.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.dao.AgendaDao;
import br.com.entity.Agenda;
import br.com.interfaces.AssinaturaHttp;
import br.com.logic.Logic;

public class AgendaService extends HttpServlet implements AssinaturaHttp {
	private static final long serialVersionUID = 1L;

	private AgendaDao dao = new AgendaDao();
	private Logic logic = new Logic();

	@Override
	public void adiciona(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Agenda agenda = new Agenda();

		String visitante = request.getParameter("visitante");
		String visitado = request.getParameter("visitado");
		String local = request.getParameter("local");
		String data = request.getParameter("data");
		String hora = request.getParameter("hora");
		String tempo = request.getParameter("tempo");
		try {
			agenda.setVisitante(visitante);
			agenda.setVisitado(visitado);
			agenda.setLocal(local);
			agenda.setData(logic.formataDate(data));
			agenda.setHora(logic.formataHora(hora));
			agenda.setTempo(logic.formataHora(tempo));
			dao.adiciona(agenda);

		} catch (Exception e) {
			System.out.println(e);
		}

	}
	
	
	@Override

	public void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Agenda agenda = new Agenda();

		String idagenda = request.getParameter("id");
		String visitante = request.getParameter("visitante");
		String visitado = request.getParameter("visitado");
		String local = request.getParameter("local");
		String data = request.getParameter("data");
		String hora = request.getParameter("hora");
		String tempo = request.getParameter("tempo");
		String status = request.getParameter("status");
		try {
			agenda.setIdagenda(Long.parseLong(idagenda));
			agenda.setVisitante(visitante);
			agenda.setVisitado(visitado);
			agenda.setLocal(local);
			agenda.setData(logic.formataDate(data));
			agenda.setHora(logic.formataHora(hora));
			agenda.setTempo(logic.formataHora(tempo));
			agenda.setStatus(status);
			dao.adiciona(agenda);

		} catch (Exception e) {
			System.out.println(e);
		}

	}
	
	
	@Override
	public void remove(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		Agenda agenda = new Agenda();
		agenda.setIdagenda(Long.parseLong(id));
		dao.remove(agenda);
		
	}
	
	
	@Override
	public void buscaPorId(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		Agenda agenda = dao.buscaPorId(Long.parseLong(id));
		request.setAttribute("agenda", agenda);
	}
	
	
	@Override
	public void getAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Agenda> agendas = dao.getAll();
		request.setAttribute("agendas", agendas);
		
	}
	
}
