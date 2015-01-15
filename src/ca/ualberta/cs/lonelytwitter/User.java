package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;

public abstract class User extends Object implements UserLike{
	
	protected String username;

	public String getUsername() {
		return username;
	}

	public abstract void setUsername(String x) throws IOException;

	public User() {
		super();
		this.username = "annoymous";
	}
	

}
