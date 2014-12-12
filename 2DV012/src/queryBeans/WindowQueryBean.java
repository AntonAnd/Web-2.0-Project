package queryBeans;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import model.User;
import model.Window;

/**
 * Session Bean implementation class WindowQueryBean
 */
@Stateless
@LocalBean
public class WindowQueryBean {
	
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(name = "2DV012")
	EntityManager em;

    /**
     * Default constructor. 
     */
    public WindowQueryBean() {
        
    }
    
    public void addWindow(Window w){
    	em.persist(w);
    }
    
    public List<Window> getListOfWindows() {
		TypedQuery<Window> theQuery = em.createQuery("SELECT w FROM Window w",
				Window.class);
		List<Window> result = theQuery.getResultList();
		return result;
	}

}
