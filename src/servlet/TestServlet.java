package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//http://localhost:8080/ServletTomcat/test
@WebServlet(name = "TestServlet", urlPatterns = "/test")
public class TestServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        System.out.println("the test get request is touch!!!");
        System.out.println("请求方式："+ request.getMethod());
        System.out.println("URI："+ request.getRequestURI());
        System.out.println("发出请求客户端IP地址："+ request.getRemoteAddr());
        System.out.println("服务点接收请求的IP地址："+ request.getLocalAddr());
        System.out.println("访问客户端的端口号："+ request.getRemotePort());
        System.out.println("web应用路径："+ request.getContextPath());
        System.out.println("http协议和版本："+ request.getProtocol());
    }
}
