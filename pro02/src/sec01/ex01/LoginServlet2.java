package sec01.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login2")
public class LoginServlet2 extends HttpServlet{
	@Override
	public void init() throws ServletException {
		System.out.println("init() call..");
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8"); //브라우저로 응답할 데이터 종류가 html임을 설정
		PrintWriter out = response.getWriter();
		String id = request.getParameter("user_id");
		String pw = request.getParameter("user_pw");
		
		String data = "<html>";
			data +="<body>";
			data +="아이디: " + id;
			data +="<br>";
			data +="패스워드: " + pw;
			data +="</html>";
			data +="</body>";
			
		out.print(data); //브라우저로 출력
		
	}
	
	private void destry() {
		// TODO Auto-generated method stub

	}
}
