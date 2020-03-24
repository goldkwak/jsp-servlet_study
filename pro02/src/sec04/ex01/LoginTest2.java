package sec04.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginTest2")
public class LoginTest2 extends HttpServlet {
	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init() call..");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");
		
		if((user_id != "" || user_id.length() != 0) && (user_pw != "" || user_pw.length() != 0)) {
			if(user_id.equals("admin")&& user_pw.equals("1")) {
				out.print("�����ڴ� �ȳ��ϼ���.");
			} else {
				out.print("���̵�: " + user_id);
				out.print("��й�ȣ: " + user_pw);
			}
		} else {
			out.print("<html>");
			out.print("<body>");
			out.print("ID �� PW�� ����� �Է����ּ���");
			out.print("<a href='http://localhost:8080/pro02/test01/login.html'>�α���â���� �̵�<a>");
			out.print("</body>");
			out.print("</html>");
		}		
	}
	
	public void destroy() {
		System.out.println("destroy() call..");
	}


}
