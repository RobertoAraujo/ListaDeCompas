package servelet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import classes.Usuario;

/**
 * Servlet implementation class SeleveteValidar
 */
@WebServlet("/SeleveteValidar")
public class SeleveteValidar extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	// FAZ alguma coisa quando a aplicação e derrubada
    public SeleveteValidar() {
        super();
       
    }

    // intercepta todas as requisições
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	//execulta alguma coisa quando a aplicação e iniciada
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("usuario");
		String senha = request.getParameter("senha");
		
		// neste momento pode ser feito uma valida��o no banco de dados
		if (login.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("123")){
			// se o login foi bem sucedido
			
			Usuario userLogado = new Usuario();			
			userLogado.setUsuario(login);
			userLogado.setSenha(senha);
			
			// adiciona usu�rio logado na sess�o
			HttpServletRequest req = (HttpServletRequest) request;
			HttpSession session = req.getSession();
			session.setAttribute("usuario", userLogado);
			
			//redireciona para o sistema e autoriza
			RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/Painel.jsp");
	    	dispatcher.forward(request, response);
			
		}else {// se o login falhou
			// redireciona para login novamente
			RequestDispatcher dispatcher=request.getRequestDispatcher("/Index.jsp");
			dispatcher.forward(request, response);
			
		}
		doGet(request, response);
		
	}

}
