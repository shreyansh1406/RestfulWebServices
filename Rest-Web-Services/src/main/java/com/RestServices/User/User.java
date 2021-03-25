package com.RestServices.User;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;  
@Entity

@Table(name = "user")
	public class User {
		
		public User() {
		super();
	}
		@Id
		
		private Long id;
		
		@Column( length = 45)
		private String name;
		
		@Column( length = 64)
		private String dob;
		
	
public User(Long id, String name, String dob)   
{  
super();  
this.id = id;  
this.name = name;  
this.dob = dob;  
}  

public Long getId()   
{  
return id;  
}  
public void setId(Long id)   
{  
this.id = id;  
}  
public String getName()   
{  
return name;  
}  
public void setName(String name)   
{  
this.name = name;  
}  
public String getDob()   
{  
return dob;  
}  
public void setDob(String dob)   
{  
this.dob = dob;  
}  
@Override  
public String toString()   
{  
//return "User [id=" + id + ", name=" + name + ", dob=" + dob + "]";  
return String.format("User [id=%s, name=%s, dob=%s]", id, name, dob);  
}  
}  
