package managedBeans;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import queryBeans.WindowQueryBean;
import model.Window;

/**
 * Session Bean implementation class windowManagedBean
 */

@Named
@SessionScoped
public class WindowManagedBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int id;
	private String url;
	private Date date;
	
	private Window window;
	private Calendar calendar;
	
	@EJB
	private WindowQueryBean qb;
	
    /**
     * Default constructor. 
     */
    public WindowManagedBean() {
        // TODO Auto-generated constructor stub
    }
    
    public void addContent(){
    	calendar = Calendar.getInstance();
    	calendar.set(2014, 12, 12);
    	date = calendar.getTime();
    	
    	window = new Window();
    	window.setDate(date);
    	window.setId(id);
    	window.setUrl(url);
    	qb.addWindow(window);
    }
    
    
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
    
    

}
