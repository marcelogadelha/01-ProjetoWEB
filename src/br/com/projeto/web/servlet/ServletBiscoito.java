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
		biscoito.setSecure(true);//HTTP PADR�O BOOLEAN
		biscoito.setComment("Coment�rio");
		response.addCookie(biscoito);//ADICIONA COOKIE NA M�QUINA
		
		//RECUPERANDO
		//Cookie[] biscoitos=request.getCookies();
		
		biscoito.getName();//retorna: O NOME DO COOKIE
		biscoito.getValue();//retorna: O VALOR DO COOKIE
		biscoito.getMaxAge();//retorna: O TEMPO M�XIMO DE VIDA DO COOKIE
		biscoito.getSecure();//retorna: true SE � UTILIZADO O HTTP PADR�O
		biscoito.getComment();//retorna: O COMENT�RIO DO COOKIE
	}
}