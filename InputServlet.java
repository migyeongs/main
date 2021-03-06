package sec01.ex01;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InputServlet
 */
@WebServlet("/input")//서블릿의 매핑 이름이 input
public class InputServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public void init(ServletConfig config) throws ServletException {
		System.out.println("init 메서드 호출");
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");//한글 깨짐 방지
		String user_id = request.getParameter("user_id");//<input>태그의 name 속성값으로 전송된 value 받아옴
		String user_pw = request.getParameter("user_pw");
		System.out.println("아이디: " + user_id);
		System.out.println("비밀번호: " + user_pw);
		String[] subject = request.getParameterValues("subject");//하나의 name으로 여러 값을 전송하는 경우 getParameterValues()를 이용해 배열 형태로 변환
		for(String str: subject) {
			System.out.println("선택한 과목:" + str);
		}
	}
	
	public void destroy() {
		System.out.println("destroy메서드 호출");
	}


}
