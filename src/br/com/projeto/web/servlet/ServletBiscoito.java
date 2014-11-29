package br.com.projeto.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description = "ServletBiscoito", urlPatterns = { "/ServletBiscoito" })
public class ServletBiscoito extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletBiscoito() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//CRIANDO
		Cookie biscoito = new Cookie("nome","valor");
		biscoito.setMaxAge(60);//dias*horas*minutos*segundos
		biscoito.setSecure(true);//HTTP PADRÃO BOOLEAN
		biscoito.setComment("Comentário");
		response.addCookie(biscoito);//ADICIONA COOKIE NA MÁQUINA
		
		//RECUPERANDO
		//Cookie[] biscoitos=request.getCookies();
		
		biscoito.getName();//retorna: O NOME DO COOKIE
		biscoito.getValue();//retorna: O VALOR DO COOKIE
		biscoito.getMaxAge();//retorna: O TEMPO MÁXIMO DE VIDA DO COOKIE
		biscoito.getSecure();//retorna: true SE É UTILIZADO O HTTP PADRÃO
		biscoito.getComment();//retorna: O COMENTÁRIO DO COOKIE
	}
}