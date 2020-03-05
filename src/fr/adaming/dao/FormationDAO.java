package fr.adaming.dao;
 
import java.util.ArrayList;
import java.util.List;
 
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import fr.adaming.dao.IFormationDAO;
import fr.adaming.model.Formation;
import fr.adaming.model.Lieu;
 
public class FormationDAO implements IFormationDAO {
    SessionFactory factory = new Configuration().configure("/resources/hibernate.cfg.xml").buildSessionFactory();
     
     
    public int creatFormation(Formation fr) {
        try {
        Session s = factory.openSession();
        s.beginTransaction();
        s.saveOrUpdate(fr);
        s.getTransaction().commit();
        s.close();
        return 1;
    }
        catch (HibernateException e) {
            e.printStackTrace();
            System.out.println("Erreur de persistance");
            return 0;
        }
 
}
 
 
    @Override
    public List<Formation> getFormations() {
        try {
        List<Formation> liste = new ArrayList<Formation>();
        Session s = factory.openSession();
        s.beginTransaction();
        liste=s.createQuery("from Formation").list();
        return liste;
        }
        catch (HibernateException e) {
            e.printStackTrace();
            System.out.println("Erreur d'affichage");
            return null;
        }
         
    }
 
 
    @Override
    public List<Formation> getFormations(String ville) {
            try {
                List<Formation> liste  = new ArrayList<Formation>();
                Session s = factory.openSession();
                s.beginTransaction();
                Query query = s.createQuery("from Formation where  lieu.ville = :ville");
                query.setParameter("ville", ville);
                liste= query.list();
                return liste;
            } catch (HibernateException e) {
                e.printStackTrace();
                System.out.println("Erreur getFormations par lieu");
                return null;
            }
    }
 
 
 
}