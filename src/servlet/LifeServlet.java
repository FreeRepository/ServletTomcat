package servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
//import java.io.PrintWriter;

//http://localhost:8080/ServletTomcat/life
@WebServlet(name = "LifeServlet", urlPatterns = "/life")
public class LifeServlet extends HttpServlet {

	private static final long serialVersionUID = 4083041314571354252L;

	@Override
    public void init() throws ServletException {
        super.init();
        System.out.println("go life init");
        ServletConfig servletConfig = this.getServletConfig();
        String encoding = servletConfig.getInitParameter("encoding");
        System.out.println("encoding="+encoding);
    }
	
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
        System.out.println("go life service");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("go life get");

        response.setHeader("Content-type","text/html;charset=UTF-8");//向浏览器发送一个响应头，设置浏览器的解码方式为UTF-8
        String data = "中国";
        OutputStream stream = response.getOutputStream();
        stream.write(data.getBytes("UTF-8"));
        stream.close();

//        response.setCharacterEncoding("UTF-8");//设置Response的编码方式为UTF-8
//        response.setHeader("Content-type","text/html;charset=UTF-8");//向浏览器发送一个响应头，设置浏览器的解码方式为UTF-8,其实设置了本句，也默认设置了Response的编码方式为UTF-8，但是开发中最好两句结合起来使用
//        //response.setContentType("text/html;charset=UTF-8");同上句代码作用一样
//        PrintWriter writer = response.getWriter();
//        writer.write("中国");
//        writer.close();
    }
    
    @Override
    public void destroy() {
        super.destroy();
        System.out.println("go life destory");
    }
}
