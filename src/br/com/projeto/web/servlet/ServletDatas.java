package br.com.projeto.web.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description = "ServletDatas", urlPatterns = { "/ServletDatas" })
public class ServletDatas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletDatas() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yy - HH:mm:ss");
		formato.format(new Date());
	}
}