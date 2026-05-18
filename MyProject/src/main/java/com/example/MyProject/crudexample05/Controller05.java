package com.example.MyProject.crudexample05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(allowedHeaders = "*")
@RequestMapping("/api/filters")
public class Controller05 {

    @Autowired
    private Service05 service05;

    @PostMapping("/create4")
    public String createAppliedFilter(@RequestBody Dto05 dto05) {
        service05.createAppliedFilter(dto05);
        return "Filter created successfully";
    }

    @GetMapping("/get4/{id}")
    public Dto05 getAppliedFilter(@PathVariable Long id) {
        return service05.getAppliedFilter(id);
    }

    @PutMapping("/update4/{id}")
    public String updateAppliedFilter(@PathVariable Long id, @RequestBody Dto05 dto05) {
        service05.updateAppliedFilter(id, dto05);
        return "Filter updated successfully";
    }

    @DeleteMapping("/delete4/{id}")
    public String deleteAppliedFilter(@PathVariable Long id) {
        service05.deleteAppliedFilter(id);
        return "Filter deleted successfully";
    }
} 
