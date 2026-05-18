package com.example.MyProject.crudexample02;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MyProject.crudexample01.Entity01;

import java.util.Optional;

@Service
public class Serviceimpl02 implements Service02 {

    @Autowired
    private Jparepo02 jparepo;
    
    @Autowired
	 private ModelMapper mm;

    @Override
    public String updateImage(Long id, Dto02 dto02) {
        
		Optional<Entity02> user = jparepo.findById(id);
        if (user.isPresent()) {
            Entity02 entity = user.get();
            entity.setId(dto02.getId());
            entity.setFilename(dto02.getFilename());
            entity.setFilepath(dto02.getFilepath());
            entity.setUserID(dto02.getUserID());
            entity.setUploadDate(dto02.getUploadDate());
            entity.setEditHistory(dto02.getEditHistory());
            jparepo.save(entity);
            return "User updated successfully";
        } else {
            return "User not found";
        }
    }

    @Override
    public String deleteImage(Long id) {
        if (jparepo.existsById(id)) {
            jparepo.deleteById(id);
            return "User deleted successfully";
        } else {
            return "User not found";
        }
    }

    @Override
    public String createImage(Dto02 dto02) {
    	Entity02 entity02 = mm.map(dto02, Entity02.class);
//        user.setImageID(dto02.getImageID());
//        user.setFilename(dto02.getFilename());
//        user.setFilepath(dto02.getFilepath());
//        user.setUserID(dto02.getUserID());
//        user.setUploadDate(dto02.getUploadDate());
//        user.setEditHistory(dto02.getEditHistory());
        jparepo.save(entity02);
        return "User created successfully";
    }

	@Override
	public Dto02 getImage(Long id) {
		Optional<Entity02> user = jparepo.findById(id);
        if (user.isPresent()) {
            Entity02 entity1 = user.get();
            Dto02 dto02 = new Dto02();
            dto02.setId(entity1.getId());
            dto02.setFilename(entity1.getFilename());
            dto02.setFilepath(entity1.getFilepath());
            dto02.setUserID(entity1.getUserID());
            dto02.setUploadDate(entity1.getUploadDate());
            dto02.setEditHistory(entity1.getEditHistory());
            return dto02;
        } else {
            throw new RuntimeException("User not found");
        }
	}
}