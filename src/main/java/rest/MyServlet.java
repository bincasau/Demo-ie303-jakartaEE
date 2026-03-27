package rest;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "MyServlet", urlPatterns = "/hello-servlet")
public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<html><body>");
            out.println("<h1>Chào mừng đến với Seminar Jakarta EE 11</h1>");
            out.println("<p>Đây là <b>Jakarta Servlet 6.1</b> đang chạy trực tiếp!</p>");
            out.println("<p>Thời gian hệ thống: " + new java.util.Date() + "</p>");
            out.println("<a href='api/tasks'>Chuyển sang xem danh sách Task (JAX-RS)</a>");
            out.println("</body></html>");
        }
    }
}
