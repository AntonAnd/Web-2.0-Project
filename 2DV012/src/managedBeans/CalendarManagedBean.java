package managedBeans;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import queryBeans.CalendarQueryBean;

@Named
@SessionScoped
public class CalendarManagedBean implements Serializable{

	private static final long serialVersionUID = 1L; 
	
	private int id;

	private byte isPrivate;

	private String name;

	private String password;

	private String url;
	
	@EJB
	private CalendarQueryBean qb;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte getIsPrivate() {
		return isPrivate;
	}

	public void setIsPrivate(byte isPrivate) {
		this.isPrivate = isPrivate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	
	
	

}
