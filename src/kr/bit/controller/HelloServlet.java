package kr.bit.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.bit.mem.Helper;

public class HelloServlet extends HttpServlet {// ����(������ �����Ǵ� �ڹٷ� �� �����α׷���)
	// javaEE������ �̷���!!!
	// service, doGet, doPost

	// �⺻ ���
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		Helper h = new Helper();
		int sum = h.hap();
		// ���� sum�� ���� ��û�� client���� �������ָ� ��
		
		
		// ���������̼� ����
		PrintWriter out = res.getWriter();
		out.println("<html>");
		out.println("<body>");
		
		out.print(sum);
		out.println("</body>");
		out.println("</html>");
		
	}

}
