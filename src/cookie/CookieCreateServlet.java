package cookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieCreateServlet
 */
@WebServlet("/cookie/create")
public class CookieCreateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("/cookie/create[GET]");

		// javax.servlet.http.Cookie
		Cookie c1 = new Cookie("ID", "Ali"); // 쿠키 생성
		resp.addCookie(c1); // 응답객체에 쿠키 포함시키기

		Cookie c2 = new Cookie("PASS", "1234"); // 쿠키 생성
		resp.addCookie(c2); // 응답객체에 쿠키 포함시키기

		Cookie c3 = new Cookie("name", "alice"); // 쿠키 생성
		resp.addCookie(c3); // 응답객체에 쿠키 포함시키기

//		// 응답보내기 방법1 - 서블릿에서 직접 작성
//		resp.getWriter().append("<h1>Hello</h1>");

		// 응답보내기 방법2 - JSP(view)를 이용한 forward
		req.getRequestDispatcher("/WEB-INF/views/cookie/create.jsp").forward(req, resp);
	}
}
