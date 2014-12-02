package managedBeans;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class User implements Serializable{

	private String name = "";
	
	public String getName(){
		return name;
			
	}
	
	public void setName(String n){
		name = n;
	}
}
