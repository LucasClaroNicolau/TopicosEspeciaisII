import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 

@WebServlet(name="addTreinador", urlPatterns = {"/addTreinador"})
public class ServletTreinador extends HttpServlet{
	
	private static final long serialVersionUID = 2L;
		
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Integer nivel = Integer.parseInt(request.getParameter("nivel"));
		Integer qntInsignia = Integer.parseInt(request.getParameter("qntinsignia"));
		Boolean mestre = (request.getParameter("mestreginasio")== null) ? false : true;
		
		Treinador treinado = new Treinador(request.getParameter("nome"), request.getParameter("cidade"), nivel, mestre, qntInsignia);
		response.sendRedirect("/TrabalhoTopicosII/listTreinador");
	}
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher view = request.getRequestDispatcher("/addTreinador.jsp");
        view.forward(request, response);
        
	}
}