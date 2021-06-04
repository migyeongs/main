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
		System.out.println("init 메서드 호출");
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");//한글 깨짐 방지
		response.setContentType("text/html;charset=utf-8");//html형태로 response, 클라이언트에게 되돌려 줄 때 한글깨짐 방지
		PrintWriter out = response.getWriter();//out해주기 위해 getWriter() 메소드 사용(내장클래스를 불러올 때 new가 아닌 메소드를 사용) 
		String id = request.getParameter("user_id");
		String pw = request.getParameter("user_pw");
		
		String data ="<html>";//html 문자열로 나열
		data += "<body>";
		data += "아이디: " + id;
		data += "<br>";
		data += "패스워드: " + pw;
		data += "</body>";
		data += "</html>";
		out.print(data);//문자열을 웹 브라우저로 출력
		
	}
	
	
	public void destroy() {
		System.out.println("destroy 메소드 호출");
	}

}
