package org.cloudfoundry.samples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/plain");
		response.setStatus(200);
		PrintWriter writer = response.getWriter();
        //System.out.println("test");
		//writer.println("Hello World from " + System.getenv("VCAP_APP_HOST") + ":" + System.getenv("VCAP_APP_PORT"));
		writer.println("Hello from MoPaaS MCE");
		writer.close();
	}
}