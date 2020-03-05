
package fr.adaming.dao;
 
import java.util.List;
 
import fr.adaming.model.Formation;
import fr.adaming.model.Lieu;
 
public interface IFormationDAO {
public int creatFormation(Formation fr);
public List<Formation> getFormations();
public List<Formation> getFormations(String ville);
 
}