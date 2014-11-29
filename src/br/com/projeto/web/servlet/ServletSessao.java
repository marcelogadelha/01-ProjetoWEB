package br.com.projeto.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(description = "ServletSessao", urlPatterns = { "/ServletSessao" })
public class ServletSessao extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletSessao() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//CRIANDO
		HttpSession sessao = request.getSession();
		sessao.setAttribute("nome", "valor");//CRIA ATRIBUTO DE SESS�O E CONFIGURA SEU VALOR
		sessao.setMaxInactiveInterval(2*60);//dias*horas*minutos*segundos
		sessao.removeAttribute("nome");//REMOVE ATRIBUTO INDEXADO
		sessao.invalidate();//INVALIDA A SESS�O
		
		//RECUPERANDO
		sessao.getCreationTime();//retorna: DATA DA CRIA��O DA SESS�O
		sessao.getLastAccessedTime();//retorna: DATA DO �LTIMO ACESSO � SESS�O 
		sessao.getId();//retorna: ID DA SESS�O
		sessao.getAttribute("arg");//retorna: VALOR DO ATRIBUTO INDEXADO
		sessao.getMaxInactiveInterval();//retorna: dias*horas*minutos*segundos
		sessao.isNew();//retorna: true SE A SESS�O FOR NOVA
	}
}