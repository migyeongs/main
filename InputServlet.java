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
@WebServlet("/input")//������ ���� �̸��� input
public class InputServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public void init(ServletConfig config) throws ServletException {
		System.out.println("init �޼��� ȣ��");
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");//�ѱ� ���� ����
		String user_id = request.getParameter("user_id");//<input>�±��� name �Ӽ������� ���۵� value �޾ƿ�
		String user_pw = request.getParameter("user_pw");
		System.out.println("���̵�: " + user_id);
		System.out.println("��й�ȣ: " + user_pw);
		String[] subject = request.getParameterValues("subject");//�ϳ��� name���� ���� ���� �����ϴ� ��� getParameterValues()�� �̿��� �迭 ���·� ��ȯ
		for(String str: subject) {
			System.out.println("������ ����:" + str);
		}
	}
	
	public void destroy() {
		System.out.println("destroy�޼��� ȣ��");
	}


}
