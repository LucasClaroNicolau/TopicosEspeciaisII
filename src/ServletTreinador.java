import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name="addTreinador", urlPatterns = {"/addTreinador"})
public class ServletTreinador extends HttpServlet{
	
	private static final long serialVersionUID = 2L;
		
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Treinador treinador = new Treinador(request.getParameter("nome"), request.getParameter("cidade"),
				Integer.parseInt(request.getParameter("nivel")), request.getParameter("mestreginasio") != null && Boolean.getBoolean(request.getParameter("mestreginasio")),
				Integer.parseInt(request.getParameter("qntinsignia")));

		session.setAttribute(treinador.getNome(), treinador);

		response.sendRedirect("/TrabalhoTopicosII/index");
	}
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher view = request.getRequestDispatcher("/addTreinador.jsp");
        view.forward(request, response);
        
	}
}