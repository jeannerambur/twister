package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Hello extends HttpServlet {
	public void doGet( HttpServletRequest requete, HttpServletResponse reponse ) throws ServletException ,IOException {
		reponse.setContentType("text/plan");
		PrintWriter out = reponse.getWriter();
		out.println("Hello !! Hello !!");
	}

}
