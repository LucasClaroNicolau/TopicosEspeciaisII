import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
 

@WebServlet(name="listTreinador", urlPatterns = {"/listTreinador"})
public class ServletListTreinador extends HttpServlet{
	
	private static final long serialVersionUID = 2L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		List<Treinador> treinadores = new ArrayList<>();
		Enumeration<String> keys = session.getAttributeNames();
		
		while(keys.hasMoreElements()) {
			String key = keys.nextElement();
			if(session.getAttribute(key) instanceof Treinador) {
				treinadores.add((Treinador) session.getAttribute(key));
			}
		}
		 PrintWriter pw = response.getWriter();
		  
		 pw.print("<html>"); 
		 pw.print("<body style='text-align: center'>");
		 pw.print("<h3>Treinadores salvos na sessão!</h3>");
		 pw.print("<div style='text-align: left;max-width: 200px;margin: 0 auto;'>");

		 if(!treinadores.isEmpty()) {
			 treinadores.forEach(t -> {
			 pw.print("Nome: " + t.getNome());
			 pw.print("<br/>");
			 pw.print("Cidade: " + t.getCidade());
			 pw.print("<br/>");
			 pw.print("nivel: " + t.getNivel());
			 pw.print("<br/>");
			 String is = t.getMestreGinasio() ? "Sim" : "Não";
			 pw.print("É mestre de ginasio? : " + is);
			 pw.print("<br/>");
			 pw.print("Número de insignias: " + t.getQntInsignia());
			 pw.print("<br/>");
			 pw.print("<br/>");
		 });
			 pw.print("Treinadores cadastrados: " + treinadores.size());
		 }else {
			 pw.print("Nenhum treinador foi cadastrado!");
		 }
		 pw.print("</div>");

		 pw.print("<br/>");
		 pw.print("<button><a href='/TrabalhoTopicosII/addTreinador.jsp'>Cadastrar novo treinador</a></button>"); 
		 pw.print("<br>");
		 pw.print("<button><a href='/TrabalhoTopicosII/index.jsp'>Inicio</a></button>");
		 pw.print("</body>");
		 pw.print("</html>");
	}
}