package sec01.ex01;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InputServlet2
 */
@WebServlet("/input2")
public class InputServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init 메서드 호출");
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		Enumeration enu = request.getParameterNames();//변수이름을 몰라도 차례대로 불러옴
		while(enu.hasMoreElements())//for문으로 처리할 수 없는 메서드, 객체 안에 값이 있는 동안 반복
		{
			String name=(String)enu.nextElement();//현재 포인트가 가리키는 값 출력 후 다음값으로 
			String[] values = request.getParameterValues(name);
			//이름은 하나지만 값이 여러개이기 때문에 배열로 받음, name의 값에 해당하는 value 하나씩 분리
			for(String value : values) {
				System.out.println("name= " + name + ",value= " + value);//반복문 나가서 사라지기 전 name값 출력
			}
		}
	}

	
	public void destroy() {
		System.out.println("destroy 메서드 호출");
	}

}
