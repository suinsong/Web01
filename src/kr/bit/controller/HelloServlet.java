package kr.bit.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.bit.mem.Helper;

public class HelloServlet extends HttpServlet {// 서블릿(웹에서 구동되는 자바로 된 웹프로그래밍)
	// javaEE에서는 이렇게!!!
	// service, doGet, doPost

	// 기본 골격
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		Helper h = new Helper();
		int sum = h.hap();
		// 구한 sum의 값을 요청한 client한테 응답해주면 됨
		
		
		// 프레젠테이션 로직
		PrintWriter out = res.getWriter();
		out.println("<html>");
		out.println("<body>");
		
		out.print(sum);
		out.println("</body>");
		out.println("</html>");
		
	}

}
