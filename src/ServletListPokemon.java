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
 

@WebServlet(name="listPokemon", urlPatterns = {"/listPokemon"})
public class ServletListPokemon extends HttpServlet{
	
	private static final long serialVersionUID = 2L;
		
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		List<Pokemon> pokemons = new ArrayList<>();
		Enumeration<String> keys = session.getAttributeNames();
		
		while(keys.hasMoreElements()) {
			String key = keys.nextElement();
			if(session.getAttribute(key) instanceof Pokemon) {
				pokemons.add((Pokemon) session.getAttribute(key));
			}
		}
		 PrintWriter pw = response.getWriter();
		  
		 pw.print("<html>"); 
		 pw.print("<body style='text-align: center'>");
		 pw.print("<h3>Pokemons salvos na sessão!</h3>");
		 pw.print("<div style='text-align: left;max-width: 200px;margin: 0 auto;'>");

		 if(!pokemons.isEmpty()) {
			 pokemons.forEach(p -> {
			 pw.print("Nome: " + p.getNome());
			 pw.print("<br/>");
			 pw.print("CP: " + p.getCp());
			 pw.print("<br/>");
			 pw.print("Ataque: " + p.getAtaque());
			 pw.print("<br/>");
			 pw.print("Defesa: " + p.getDefesa());
			 pw.print("<br/>");
			 pw.print("Vida: " + p.getVida());
			 pw.print("<br/>");
			 String is = p.getTemEvolucao() ? "Sim" : "Não";
			 pw.print("Possui evolução? : " + is);
			 pw.print("<br/>");
			 pw.print("<br/>");
		 });
			 pw.print("Pokemons cadastrados: " + pokemons.size());
		 }else {
			 pw.print("Nenhum Pokemon foi cadastrado!");
		 }
		 pw.print("</div>");

		 pw.print("<br/>");
		 pw.print("<button><a href='/TrabalhoTopicosII/addPokemon.jsp'>Cadastrar novo pokemon</a></button>"); 
		 pw.print("<br>");
		 pw.print("<button><a href='/TrabalhoTopicosII/index.jsp'>Inicio</a></button>");
		 pw.print("</body>");
		 pw.print("</html>");
	}
}