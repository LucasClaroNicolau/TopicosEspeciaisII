import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name="addPokemon", urlPatterns = {"/addPokemon"})
public class ServletPokemon extends HttpServlet{
	
	private static final long serialVersionUID = 2L;
		
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Pokemon pokemon = new Pokemon(request.getParameter("nome"), request.getParameter("cp"),
				Integer.parseInt(request.getParameter("ataque")),
				Integer.parseInt(request.getParameter("defesa")),
				Integer.parseInt(request.getParameter("vida")),
				request.getParameter("temevolucao") != null && Boolean.getBoolean(request.getParameter("temevolucao")));

		session.setAttribute(pokemon.getNome(), pokemon);

		response.sendRedirect("/TrabalhoTopicosII/index");
	}
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher view = request.getRequestDispatcher("/addPokemon.jsp");
        view.forward(request, response);
	}
}