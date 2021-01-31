package assignment2b.beans;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class User {
	
	String first;
	String last;

	// Constructor
	public User(String f, String l) 
	{
		this.first = f;
		this.last = l;
	}
	
	public User() 
	{
		
	}
	
	// Getters & Setters
	public String getFirst() 
	{
		return first;
	}

	public void setFirst(String first) 
	{
		this.first = first;
	}

	public String getLast() 
	{
		return last;
	}

	public void setLast(String last) 
	{
		this.last = last;
	}

}
