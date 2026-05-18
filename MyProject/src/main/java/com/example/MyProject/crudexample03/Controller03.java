package com.example.MyProject.crudexample03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(allowedHeaders = "*")
@RequestMapping("/api/templates")
public class Controller03 {

    @Autowired
    private Service03 service03;

    @PostMapping("/create2")
    public String createTemplate(@RequestBody Dto03 dto03) {
        service03.createTemplate(dto03);
        return "Template created successfully";
    }

    @GetMapping("/get2/{id}")
    public Dto03 getTemplate(@PathVariable Long id) {
        return service03.getTemplate(id);
    }

    @PutMapping("/update2/{id}")
    public String updateTemplate(@PathVariable Long id, @RequestBody Dto03 dto03) {
        service03.updateTemplate(id, dto03);
        return "Template updated successfully";
    }

    @DeleteMapping("/delete2/{id}")
    public String deleteTemplate(@PathVariable Long id) {
        service03.deleteTemplate(id);
        return "Template deleted successfully";
    }
} 

