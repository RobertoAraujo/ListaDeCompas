package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import classes.Usuario;

@WebFilter(urlPatterns={"/pages/Painel.jsp"})
public class FileAutenticacao implements Filter{

	// FAZ alguma coisa quando a aplicação e derrubada
	@Override
	public void destroy() {
		
	}
	
	// intercepta todas as requisições
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		// altenticação e redirecionamento aqui 
		HttpServletRequest req = (HttpServletRequest) request;
		HttpSession session = req.getSession();
		//session.getAttribute("usuario");
		String urlParaAutenticar = req.getServletPath();
		Usuario userLogado = (Usuario) session.getAttribute("usuario");
		
		if(userLogado == null) {//usuario logado
			RequestDispatcher dispatcher=request.getRequestDispatcher("/Index.jsp?url=" + urlParaAutenticar);
			dispatcher.forward(request, response);
			return; // para o process opatra redirecionar
		}
		
		// execulta a ação do requewst e do resposnse
		chain.doFilter(request, response);

		
	}

	
	//execulta alguma coisa quando a aplicação e iniciada
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
		
	}

}
