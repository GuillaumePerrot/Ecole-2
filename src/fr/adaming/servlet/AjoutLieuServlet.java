package fr.adaming.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.adaming.dao.FormationDAO;
import fr.adaming.dao.IFormationDAO;
import fr.adaming.dao.ILieuDao;
import fr.adaming.dao.LieuDao;
import fr.adaming.model.Formation;
import fr.adaming.model.Lieu;

/**
 * Servlet implementation class AjoutLieuServlet
 */
@WebServlet("/ajoutlieux")
public class AjoutLieuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjoutLieuServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/WEB-INF/vues/enregistrementL.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 Lieu lieux = new Lieu();
	        lieux.setIdLieu(Integer.parseInt(request.getParameter("idLieu")));
	        lieux.setAddresse(request.getParameter("idLieu"));
	        lieux.setVille(request.getParameter("idLieu"));
	        ILieuDao dao = new LieuDao();
	        dao.createLieu(lieux);
	        
	        this.getServletContext().getRequestDispatcher("WEB-INF/vues/listeL").forward(request, response);
	         
	}

}
