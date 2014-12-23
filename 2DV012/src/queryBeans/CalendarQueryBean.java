package queryBeans;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Session Bean implementation class CalendarQueryBean
 */
@Stateless
@LocalBean
public class CalendarQueryBean {
	
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(name = "2DV012")
	EntityManager em;

    /**
     * Default constructor. 
     */
    public CalendarQueryBean() {
        // TODO Auto-generated constructor stub
    }

}
