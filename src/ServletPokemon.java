import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 

@WebServlet(name="addPokemon", urlPatterns = {"/addPokemon"})
public class ServletPokemon extends HttpServlet{
	
	private static final long serialVersionUID = 2L;
		
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Integer ataque = Integer.parseInt(request.getParameter("ataque"));
		Integer defesa = Integer.parseInt(request.getParameter("defesa"));
		Integer vida = Integer.parseInt(request.getParameter("vida"));
		Boolean evolucao = (request.getParameter("temevolucao") == null ) ? false : true;
		
		Pokemon pokemon = new Pokemon(request.getParameter("nome"),request.getParameter("cp"),ataque,defesa,vida,evolucao );
		response.sendRedirect("/TrabalhoTopicosII/listPokemon");
	}
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher view = request.getRequestDispatcher("/addPokemon.jsp");
        view.forward(request, response);
	}
}