package com.RestServices;

@SuppressWarnings("serial")
public class UserNotFoundException extends RuntimeException   
{  
public UserNotFoundException(String message)   
{  
super(message);  
}  
}  