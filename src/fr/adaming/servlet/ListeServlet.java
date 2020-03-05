package fr.adaming.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.adaming.dao.FormationDAO;
import fr.adaming.dao.IFormationDAO;
import fr.adaming.model.Formation;
import fr.adaming.model.Lieu;
 
/**
 * Servlet implementation class ListeServlet
 */
@WebServlet("/listes")
public class ListeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
        
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
 
    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Formation> list = new ArrayList<Formation>();
        IFormationDAO dao = new FormationDAO();
        list=dao.getFormations();
        request.setAttribute("formations", list);
        this.getServletContext().getRequestDispatcher("/WEB-INF/vues/liste.jsp").forward(request, response);
    }
 
    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
    	doGet(request, response);
    }
 
}