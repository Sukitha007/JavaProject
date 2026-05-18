package com.example.MyProject.crudexample02;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(allowedHeaders = "*")
@RequestMapping("/api/users")
public class Controller02 {
	@Autowired
    private Service02 service02;

    @PostMapping("/create1")
    public String createImage(@RequestBody Dto02 dto02) {
        service02.createImage(dto02);
        return "User created successfully";
    }

    @GetMapping("/get1/{id}")
    public Dto02 getImage(@PathVariable Long id) {
        return service02.getImage(id);
    }

    @PutMapping("/update1/{id}")
    public String updateImage(@PathVariable Long id, @RequestBody Dto02 dto02) {
        service02.updateImage(id, dto02);
        return "User updated successfully";
    }

    @DeleteMapping("/delete1/{id}")
    public String deleteImage(@PathVariable Long id) {
        service02.deleteImage(id);
        return "User deleted successfully";
    }
}
