package sec01.ex01;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/input")
public class InputServlet extends HttpServlet {
	
	public void init() throws ServletException {
		System.out.println("init() call..");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");
		System.out.println(user_id);
		System.out.println(user_pw);
		
		String[] subject = request.getParameterValues("subject"); //배열로 오기때문에 values
		
		for(String str : subject) {
			System.out.print(str);
		}
	}
	
	public void destroy() {
		System.out.println("destroy() call..");
	}
	
}
