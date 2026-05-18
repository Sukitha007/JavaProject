package com.example.MyProject.crudexample06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(allowedHeaders = "*")
@RequestMapping("/api/edits")
public class Controller06 {

    @Autowired
    private Service06 service06;

    @PostMapping("/create5")
    public String createEdit(@RequestBody Dto06 dto06) {
        service06.createEdit(dto06);
        return "Edit created successfully";
    }

    @GetMapping("/get5/{id}")
    public Dto06 getEdit(@PathVariable Long id) {
        return service06.getEdit(id);
    }

    @PutMapping("/update5/{id}")
    public String updateEdit(@PathVariable Long id, @RequestBody Dto06 dto06) {
        service06.updateEdit(id, dto06);
        return "Edit updated successfully";
    }

    @DeleteMapping("/delete5/{id}")
    public String deleteEdit(@PathVariable Long id) {
        service06.deleteEdit(id);
        return "Edit deleted successfully";
    }
} 
