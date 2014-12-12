package queryBeans;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import model.User;

/**
 * Session Bean implementation class UserQueryBean
 */
@Stateless
@LocalBean
public class UserQueryBean {
	
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(name = "2DV012")
	EntityManager em;

    /**
     * Default constructor. 
     */
    public UserQueryBean() {
        // TODO Auto-generated constructor stub
    }
    
    public void addUser(User u){
    	em.persist(u);
    }
    
    public List<User> getListOfUsers() {
		TypedQuery<User> theQuery = em.createQuery("SELECT u FROM User u",
				User.class);
		List<User> result = theQuery.getResultList();
		return result;
	}

}
