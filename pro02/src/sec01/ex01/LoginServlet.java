package sec01.ex01;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	
	@Override
	public void init() throws ServletException {
		System.out.println("init() call..");
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8"); //html���� ������ �����͸� ������ UTF-8�� ���� �� �ֵ��� ����
		
		String user_id = request.getParameter("user_id"); //user_id�� ���� name�� value�� ������ ��´�.
		String user_pw = request.getParameter("user_pw"); //user_pw�� ���� name�� value�� ������ ��´�.
		
		System.out.println("���̵�: " + user_id);
		System.out.println("��й�ȣ: " + user_pw);
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy() call..");
	}	
}
