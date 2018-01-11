package br.com.controler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.service.AgendaService;

@WebServlet({ "/nova-agenda", "/adiciona-agenda", "/atualiza-agenda", "/todas-agendas", "/busca-agenda",
		"/remove-agenda" })
public class AgendaControler extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private AgendaService agendaService = new AgendaService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		executa(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		executa(request, response);
	}

	private void executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String uri = request.getRequestURI();
		String path = request.getContextPath();

		if (uri.equalsIgnoreCase(path + "/nova-agenda")) {
			request.getRequestDispatcher("/WEB-INF/paginas/agenda.jsp").forward(request, response);
			return;
		}

		if (uri.equalsIgnoreCase(path + "/adiciona-agenda")) {
			agendaService.adiciona(request, response);
			response.sendRedirect(path + "/nova-agenda");
			return;

		}
		if (uri.equalsIgnoreCase(path + "/atualiza-agenda")) {
			agendaService.update(request, response);
			response.sendRedirect(path + "/todas-agendas");
			return;
		}
		if (uri.equalsIgnoreCase(path + "/todas-agendas")) {
			request.getRequestDispatcher(path + "/WEB-INF/paginas/agendas.jsp").forward(request, response);
		}
		if (uri.equalsIgnoreCase(path + "/busca-agenda")) {
			agendaService.buscaPorId(request, response);
			return;
		}
		if (uri.equalsIgnoreCase(path + "/remove-agenda")) {
			agendaService.remove(request, response);
			request.getRequestDispatcher(path + "/WEB-INF/paginas/agendas.jsp").forward(request, response);
			return;
		} else {
			request.getRequestDispatcher("/WEB-INF/paginas/erro.jsp").forward(request, response);

		}

	}

}
