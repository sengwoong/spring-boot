

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("WEB-INF/views/login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 아이디 비번 확인해서 맞으면 맞다고, 틀리면 틀렸다고 리턴
		
		String body = Utils.getBody(request);
		System.out.println(body);
		Map map = Utils.getQueryMap(body);
		System.out.println(map);
		
		// 데이터베이스에 아이디 hong / 비번 1234 있다고 가정
		if("hong".equals(map.get("id")) &&
			"1234".equals(map.get("pw"))
		) {
			response.setCharacterEncoding("UTF-8");
			response.setContentType("text/plain");
			response.getWriter().print("ok");
		} else {
			response.setCharacterEncoding("UTF-8");
			response.setContentType("text/plain");
			response.getWriter().print("fail");
		}
		
		
		

	}

}














