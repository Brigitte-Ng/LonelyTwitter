package ca.ualberta.cs.lonelytwitter;

import java.lang.reflect.Array;
import java.util.List;

public class CloseFriends extends Friends {
	
	private List<String> privateUpdates;

	public CloseFriends(String name, String username, List<String> publicUpdates, List<String> privateUpdates) {
		super(name, username, publicUpdates);
		this.privateUpdates = privateUpdates;
	}
	
	public List<String> getPrivateUpdates(){
		return privateUpdates;
	}
	

}
