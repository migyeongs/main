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
		System.out.println("init �޼��� ȣ��");
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		Enumeration enu = request.getParameterNames();//�����̸��� ���� ���ʴ�� �ҷ���
		while(enu.hasMoreElements())//for������ ó���� �� ���� �޼���, ��ü �ȿ� ���� �ִ� ���� �ݺ�
		{
			String name=(String)enu.nextElement();//���� ����Ʈ�� ����Ű�� �� ��� �� ���������� 
			String[] values = request.getParameterValues(name);
			//�̸��� �ϳ����� ���� �������̱� ������ �迭�� ����, name�� ���� �ش��ϴ� value �ϳ��� �и�
			for(String value : values) {
				System.out.println("name= " + name + ",value= " + value);//�ݺ��� ������ ������� �� name�� ���
			}
		}
	}

	
	public void destroy() {
		System.out.println("destroy �޼��� ȣ��");
	}

}
