package com.RestServices;


import java.net.URI;
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.RestServices.User.User;
import com.RestServices.User.UserDaoService;

@RestController  
public class UserController  
{  
@Autowired  
private UserDaoService service;  
@GetMapping("/users")  
public List<User> retriveAllUsers()  
{  
return service.findAll();  
}
@GetMapping("/users/{id}")  
public User GetUser(@PathVariable int id)  
{  
 return service.findOne(id);
} 
@DeleteMapping("/users/{id}")  
public void deleteUser(@PathVariable int id)  
{  
User user= service.deleteById(id);  
if(user==null)  
//runtime exception  
throw new UserNotFoundException("id: "+ id);  
} 
@PostMapping("/users")  
public ResponseEntity<Object> createUser(@RequestBody User user)    
{  
User sevedUser=service.save(user);    
URI location=ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(sevedUser.getId()).toUri();  
return ResponseEntity.created(location).build();  
} 
@PutMapping("/users")
public ResponseEntity<Object> UpadteUser(@RequestBody User user)    
{  
User sevedUser=service.save(user);    
URI location=ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(sevedUser.getId()).toUri();  
return ResponseEntity.created(location).build();  
}  
}  


