package com.hosieo.gae3;

import java.io.IOException;
import java.util.Date;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class HosieoGae3Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		
		resp.getWriter().println("Hello, world. It's " + new Date());
	}
}
