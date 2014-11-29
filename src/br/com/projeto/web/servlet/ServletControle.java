package br.com.projeto.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description = "ServletControle", urlPatterns = { "/ServletControle" })
public class ServletControle extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public ServletControle() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		double x=Double.parseDouble(request.getParameter("m"));
		double y=Double.parseDouble(request.getParameter("n"));
		
		System.out.println(x * y);
		
		//CRIAR ATRIBUTO DE SESSÃO
		request.setAttribute("nome_do_atributo", "valor");
		
		//REDIRECIONAMENTO PARA OUTRA PÁGINA
		RequestDispatcher expediente=request.getRequestDispatcher("/paginas/sucesso.html");
		expediente.forward(request, response);
	}
}