package cookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/cookie/update")
public class CookieUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("/cookie/update[GET]");
		
		Cookie c1 = new Cookie("ID", "boo"); // 쿠키 생성
		resp.addCookie(c1); // 응답객체에 쿠키 포함시키기

		Cookie c2 = new Cookie("PASS", "4445556"); // 쿠키 생성
		resp.addCookie(c2); // 응답객체에 쿠키 포함시키기

		Cookie c3 = new Cookie("NAME", "Bab"); // 쿠키 생성
		resp.addCookie(c3); // 응답객체에 쿠키 포함시키기
		
		req.getRequestDispatcher("/WEB-INF/views/cookie/update.jsp").forward(req, resp);;
		
	}

}
