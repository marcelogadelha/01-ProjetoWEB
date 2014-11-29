package br.com.projeto.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description = "ServletMetodos", urlPatterns = { "/ServletMetodos" })
public class ServletMetodos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletMetodos() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//URL + PAR�METROS
		request.getQueryString();
		//PAR�METROS
		request.getParameter("arg");//STRING COM UM VALOR
		request.getParameterValues("arg");//STRING COM VALORES
		request.getParameterNames();//ENUMERA��O COM NOMES
		//CABE�ALHOS
		request.getHeader("arg");//retorna: STRING COM UM VALOR
		request.getHeaderNames();//retorna: ENUMERA��O COM NOMES
		request.getHeaders("arg");//retorna: ENUMERA��O COM VALORES
		//ERROS
		response.sendError(404,"arg");
		//response.sendError(response.SC_NOT_FOUND,"arg");
		//CRIAR ATRIBUTO DE SESS�O
		request.setAttribute("nome_do_atributo", "valor");
		
		//REDIRECIONAMENTO
		response.sendRedirect("sucesso.html");
		//REDIRECIONAMENTO
		RequestDispatcher expediente=request.getRequestDispatcher("/paginas/sucesso.html");
		expediente.forward(request, response);
	}
}