package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BasicCalculator;

/**
 * Servlet implementation class getValuesServlet
 */
@WebServlet("/getValuesServlet")
public class getValuesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getValuesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userValueOne = request.getParameter("value1");
		String userValueTwo = request.getParameter("value2");
		
		BasicCalculator valueResult = new BasicCalculator(Integer.parseInt(userValueOne), Integer.parseInt(userValueTwo));
		
		request.setAttribute("userValuesPouch", valueResult);
		
		getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
	}
}
