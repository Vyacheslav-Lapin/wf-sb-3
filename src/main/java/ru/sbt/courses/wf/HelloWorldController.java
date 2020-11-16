package ru.sbt.courses.wf;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloWorldController extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest __, HttpServletResponse resp) throws ServletException, IOException {

    try (var writer = resp.getWriter()) {
      writer.println("Hello, World!");
    }
  }
}
