package com.newLearnings;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet{

	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//studentGetall(req,resp);
		RequestDispatcher rd=req.getRequestDispatcher("displayjstleg.jsp");
		rd.forward(req, resp);
	}
	public void studentGetall(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Student> studs=Arrays.asList(new Student(1,"Sam"), new Student(2,"Chithra"), new Student(3,"Kittu"), new Student(4, "Ashwin"));
	//	Student s=new Student(1,"Roopa Sri");
		req.setAttribute("student", studs);
		
	//	((ServletRequest) resp).setAttribute("student", s);
	
		RequestDispatcher rd=req.getRequestDispatcher("display.jsp");
		rd.forward(req, resp);
		
	}
	public void sampleJSTLeg(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		String name_eg="Sample";
		
		req.setAttribute("namelabel", name_eg);
	//	((ServletRequest) resp).setAttribute("student", s);
	
		RequestDispatcher rd=req.getRequestDispatcher("display.jsp");
		rd.forward(req, resp);
	}

}
