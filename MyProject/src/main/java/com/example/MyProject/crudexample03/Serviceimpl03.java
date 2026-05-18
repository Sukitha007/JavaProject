package com.example.MyProject.crudexample03;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Optional;

@Service
public class Serviceimpl03 implements Service03 {

    @Autowired
    private Jparepo03 jparepo;

    @Autowired
	 private ModelMapper mm;
    
    @Override
    public String createTemplate(Dto03 dto03) {
    	Entity03 entity03 = mm.map(dto03, Entity03.class);
        jparepo.save(entity03);
        return "Template created successfully";
    }

    @Override
    public Dto03 getTemplate(Long id) {
        Optional<Entity03> template = jparepo.findById(id);
        if (template.isPresent()) {
            Entity03 entity = template.get();
            Dto03 dto03 = new Dto03();
            dto03.setId(entity.getId());
            dto03.setTemplatename(entity.getTemplatename());
            dto03.setFilepath(entity.getFilepath());
            dto03.setUploadedBy(entity.getUploadedBy());
            dto03.setFilter(entity.getFilter());
            return dto03;
        } else {
            throw new RuntimeException("Template not found");
        }
    }

    @Override
    public String updateTemplate(Long id, Dto03 dto03) {
        Optional<Entity03> template = jparepo.findById(id);
        if (template.isPresent()) {
            Entity03 entity = template.get();
            entity.setId(dto03.getId());
            entity.setTemplatename(dto03.getTemplatename());
            entity.setFilepath(dto03.getFilepath());
            entity.setUploadedBy(dto03.getUploadedBy());
            entity.setFilter(dto03.getFilter());
            jparepo.save(entity);
            return "Template updated successfully";
        } else {
            return "Template not found";
        }
    }

    @Override
    public String deleteTemplate(Long id) {
        if (jparepo.existsById(id)) {
            jparepo.deleteById(id);
            return "Template deleted successfully";
        } else {
            return "Template not found";
        }
    }
}
