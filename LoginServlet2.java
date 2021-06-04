package sec02.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login2")
public class LoginServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public void init(ServletConfig config) throws ServletException {
		System.out.println("init �޼��� ȣ��");
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");//�ѱ� ���� ����
		response.setContentType("text/html;charset=utf-8");//html���·� response, Ŭ���̾�Ʈ���� �ǵ��� �� �� �ѱ۱��� ����
		PrintWriter out = response.getWriter();//out���ֱ� ���� getWriter() �޼ҵ� ���(����Ŭ������ �ҷ��� �� new�� �ƴ� �޼ҵ带 ���) 
		String id = request.getParameter("user_id");
		String pw = request.getParameter("user_pw");
		
		String data ="<html>";//html ���ڿ��� ����
		data += "<body>";
		data += "���̵�: " + id;
		data += "<br>";
		data += "�н�����: " + pw;
		data += "</body>";
		data += "</html>";
		out.print(data);//���ڿ��� �� �������� ���
		
	}
	
	
	public void destroy() {
		System.out.println("destroy �޼ҵ� ȣ��");
	}

}
