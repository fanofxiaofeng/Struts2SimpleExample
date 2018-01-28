package com.jyjz.playground;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Enumeration;

/**
 * 展示 request 的 header 中的各个 key/value 对
 */
public class ShowRequestHeaderServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        temp(request, response, "doGet()");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        temp(request, response, "doPost()");
    }

    private void temp(HttpServletRequest request, HttpServletResponse response, String info) throws IOException {
        response.setContentType("text/html");

        OutputStream outputStream = response.getOutputStream();
        outputStream.write(f("<!DOCTYPE html>"));
        outputStream.write(f("<html>"));
        outputStream.write(f("<head>"));
        outputStream.write(f("<meta charset=\"UTF-8\">"));
        outputStream.write(f("<title>\ud83d\ude02</title>"));
        outputStream.write(f("</head>"));
        outputStream.write(f("</head>"));
        outputStream.write(f("<body>"));
        outputStream.write(f("<p>"));
        outputStream.write(f(String.format("This is %s in: " + this.getClass().toString(), info)));
        Enumeration a = request.getHeaderNames();
        if (a.hasMoreElements()) {
            outputStream.write(f("<table border=\"5px\">"));
            while (a.hasMoreElements()) {
                String key = (String) a.nextElement();
                String value = request.getHeader(key);
                outputStream.write(f("<tr>"));
                outputStream.write(f("<td>"));
                outputStream.write(f(key));
                outputStream.write(f("</td>"));
                outputStream.write(f("<td>"));
                outputStream.write(f(value));
                outputStream.write(f("</td>"));
                outputStream.write(f("</tr>"));
            }
            outputStream.write(f("</table>"));
            outputStream.write(f("<hr/>"));
        }

        outputStream.write(f("</p>"));
        outputStream.write(f("</body>"));
        outputStream.write(f("</html>"));
        outputStream.flush();
        outputStream.close();
    }

    private byte[] f(String s) throws UnsupportedEncodingException {
        return s.getBytes("UTF-8");
    }
}
