package com.example.MyProject.crudexample01;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(allowedHeaders = "*")
@RequestMapping("/api/users")
public class Controller01 {

    @Autowired
    private Service01 service01;
    
    @GetMapping("/Email")
	public int  updateQuery1(@RequestParam Long id,String email) {
	    return service01.updateQuery1(id,email);
	}


    @PostMapping("/create")
    public String createUser(@RequestBody Dto01 dto01) {
        service01.createUser(dto01);
        return "User created successfully";
    }

    @GetMapping("/get/{id}")
    public Dto01 getUser(@PathVariable Long id) {
        return service01.getUser(id);
    }

    @PutMapping("/update/{id}")
    public String updateUser(@PathVariable Long id, @RequestBody Dto01 dto01) {
        service01.updateUser(id, dto01);
        return "User updated successfully";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable Long id) {
        service01.deleteUser(id);
        return "User deleted successfully";
    }
    
    @GetMapping("/page")
    public List<Entity01> pageData1(@RequestParam int page,String username,String email){
    	 return service01.pageData1(page,username,email);
    }
    
    @GetMapping("/updateQuery")
    public int updateQuery (@RequestParam Long id,String username) {
    	return service01.updateQuery(id,username);
    }

    @GetMapping("/DeleteQuery")
    public int deleteQuery(@RequestParam Long id) {
    	return service01.deleteQuery(id);
    }
    
    
}









//{
//	  "email": "727823tuit235@skct.edu.in",
//	  "image": "animal",
//	  "password": "sukitha",
//	  "registrationDate": "2025-03-19T04:21:17.047Z",
//	  "role": "Editor",
//	  "username": "Sukitha"
//	  
//	}
