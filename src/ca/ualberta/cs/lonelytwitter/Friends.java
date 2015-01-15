package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;
import java.util.List;

public abstract class Friends extends User{

	protected String name;
	protected String username;
	private List<String> publicUpdates;
	
	
	public void setName(String name) {
		this.name = name;
	}

	public void setUsername(String username) {
		this.username = User.getUsername();
	}
	public List<String> getPublicUpdates() {
		return publicUpdates;
	}
	public void setPublicUpdates(List<String> publicUpdates) {
		this.publicUpdates = publicUpdates;
	}
	
	
	

}
