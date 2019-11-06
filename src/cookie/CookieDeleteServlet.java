package cookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/cookie/delete")
public class CookieDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// 쿠키 삭제 방법
		// 쿠키의 maxAge 항목을  0으로 변경한다
		
		Cookie[] cookies = req.getCookies();
		
		for(int i=0; i<cookies.length; i++) {
//			cookies[i].setMaxAge(3); // 쿠키 유지 시간 : 3초
			cookies[i].setMaxAge(0); // 쿠키 유지 시간 : 0초 - 즉시삭제
//			cookies[i].setMaxAge(24*60*60); // 쿠키 유지 시간 : 하루
			
			resp.addCookie(cookies[i]);
		}
		System.out.println("/cookie/delete[GET]");
		
		req.getRequestDispatcher("/WEB-INF/views/cookie/delete.jsp").forward(req, resp);
	}
}
