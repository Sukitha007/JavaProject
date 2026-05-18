package com.example.MyProject.crudexample06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class Serviceimpl06 implements Service06 {

    @Autowired
    private Jparepo06 jparepo;

    @Override
    public String createEdit(Dto06 dto06) {
        Entity06 edit = new Entity06();
        edit.setId(dto06.getId());
        edit.setImageID(dto06.getImageID());
        edit.setAction(dto06.getAction());
        jparepo.save(edit);
        return "Edit created successfully";
    }

    @Override
    public Dto06 getEdit(Long id) {
        Optional<Entity06> edit = jparepo.findById(id);
        if (edit.isPresent()) {
            Entity06 entity = edit.get();
            Dto06 dto06 = new Dto06();
            dto06.setId(entity.getId());
            dto06.setImageID(entity.getImageID());
            dto06.setAction(entity.getAction());
            dto06.setTemplate(entity.getTemplate());
            return dto06;
        } else {
            throw new RuntimeException("Edit not found");
        }
    }

    @Override
    public String updateEdit(Long id, Dto06 dto06) {
        Optional<Entity06> edit = jparepo.findById(id);
        if (edit.isPresent()) {
            Entity06 entity = edit.get();
            entity.setId(dto06.getId());
            entity.setImageID(dto06.getImageID());
            entity.setAction(dto06.getAction());
            entity.setTemplate(dto06.getTemplate());
            jparepo.save(entity);
            return "Edit updated successfully";
        } else {
            return "Edit not found";
        }
    }

    @Override
    public String deleteEdit(Long id) {
        if (jparepo.existsById(id)) {
            jparepo.deleteById(id);
            return "Edit deleted successfully";
        } else {
            return "Edit not found";
        }
    }
}
