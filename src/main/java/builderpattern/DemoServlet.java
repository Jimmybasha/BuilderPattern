package builderpattern;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import builderpattern.Taco.TacoBuilder;

/**
 * Servlet implementation class DemoServlet
 */
public class DemoServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DemoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter();
		PrintWriter pw=response.getWriter();
		response.getWriter().append(request.getContextPath());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String size = request.getParameter("size");
		String sauceType = request.getParameter("sauceType");
		String[] fillingArray = request.getParameterValues("Fillings");
		List<String> fillings = new ArrayList<>(Arrays.asList(fillingArray));
		TacoBuilder TacoBuilder= new TacoBuilder();
		TacoBuilder.setSize(size);
		TacoBuilder.setSauceType(sauceType);
		TacoBuilder.setFillings(fillings);
		Taco taco = TacoBuilder.build();
	
		request.setAttribute("taco", taco);
		request.setAttribute("size", size);
		request.setAttribute("sauceType", sauceType);
		request.setAttribute("fillings", fillings);
		RequestDispatcher dispatcher = request.getRequestDispatcher("tacosummary.jsp");
		dispatcher.forward(request,response);
		
		
		
		doGet(request, response);
	}

}
