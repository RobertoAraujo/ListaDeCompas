package execoes;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CapturaExecao
 */
@WebServlet("/pages/capturaExecoes")
public class CapturaExecao extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CapturaExecao() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		try {
			String valor = request.getParameter("valorParam");
			Integer.parseInt(valor);
			//System.out.println(request.getParameter("valorParam"));
			
			response.setStatus(200);// ok nem erro
			response.getWriter().write("processado com sucesso");
			
		} catch (Exception e) {
			response.setStatus(500); // erro interno do servidor
			response.getWriter().write("Error favor tentar mais tarde!" + e.getMessage());// adiciona o responseTxt
		}
	}

}
