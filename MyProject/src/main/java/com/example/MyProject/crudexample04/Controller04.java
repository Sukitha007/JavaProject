package com.example.MyProject.crudexample04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(allowedHeaders = "*")
@RequestMapping("/api/filters")
public class Controller04 {

    @Autowired
    private Service04 service04;

    @PostMapping("/create3")
    public String createFilter(@RequestBody Dto04 dto04) {
        service04.createFilter(dto04);
        return "Filter created successfully";
    }

    @GetMapping("/get3/{id}")
    public Dto04 getFilter(@PathVariable Long id) {
        return service04.getFilter(id);
    }

    @PutMapping("/update3/{id}")
    public String updateFilter(@PathVariable Long id, @RequestBody Dto04 dto04) {
        service04.updateFilter(id, dto04);
        return "Filter updated successfully";
    }

    @DeleteMapping("/delete3/{id}")
    public String deleteFilter(@PathVariable Long id) {
        service04.deleteFilter(id);
        return "Filter deleted successfully";
    }
} 
