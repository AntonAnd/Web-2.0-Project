package managedBeans;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import queryBeans.UserQueryBean;
import model.User;

@Named
@SessionScoped
public class UserManagedBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String username;
	private String password;
	
	private User user;
	
	@EJB
	private UserQueryBean qb;	
	
	public String getUsername(){
		return username;
			
	}
	
	public void setUsername(String n){
		username = n;
	}
	
	public String getPassword(){
		return password;
	}
	
	public void setPassword(String s){
		password = s;
	}
	
	public void addUser(){
		user = new User();
		user.setUsername(username);
		user.setPassword(password);
		
		qb.addUser(user);
	}
}
