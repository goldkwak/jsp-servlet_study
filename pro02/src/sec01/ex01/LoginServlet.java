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
		
		request.setCharacterEncoding("UTF-8"); //html에서 전송한 데이터를 받을때 UTF-8로 받을 수 있도록 세팅
		
		String user_id = request.getParameter("user_id"); //user_id를 가진 name의 value를 변수에 담는다.
		String user_pw = request.getParameter("user_pw"); //user_pw를 가진 name의 value를 변수에 담는다.
		
		System.out.println("아이디: " + user_id);
		System.out.println("비밀번호: " + user_pw);
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy() call..");
	}	
}
