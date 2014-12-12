package managedBeans;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
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
	
	public String login(){
		for(int i=0; i<qb.getListOfUsers().size(); i++){
			if(qb.getListOfUsers().get(i).getUsername().equals(this.getUsername()) && 
					qb.getListOfUsers().get(i).getPassword().equals(this.getPassword())){
				return "/index.xhtml?faces-redirect=true";
			}
		}
		setErrorMsgs("Wrong username or password, please try again.");
		return "";
	}
	
	private void setErrorMsgs(String s) {
		FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR, s, null);
		FacesContext.getCurrentInstance().addMessage("", facesMessage);
	}
	
	public boolean loginCheck(){
		for(int i=0; i<qb.getListOfUsers().size(); i++){
			if(qb.getListOfUsers().get(i).getUsername().equals(this.getUsername()) && 
					qb.getListOfUsers().get(i).getPassword().equals(this.getPassword())){
				return true;
			}
		}
		return false;
	}
}
