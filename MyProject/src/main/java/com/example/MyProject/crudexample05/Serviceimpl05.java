package com.example.MyProject.crudexample05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class Serviceimpl05 implements Service05 {

    @Autowired
    private Jparepo05 jparepo;

    @Override
    public String createAppliedFilter(Dto05 dto05) {
        Entity05 appliedFilter = new Entity05();
        appliedFilter.setId(dto05.getId());
        appliedFilter.setAppliedFilterID(dto05.getAppliedFilterID());
        appliedFilter.setSecondaryFilterID(dto05.getSecondaryFilterID());
        jparepo.save(appliedFilter);
        return "Applied Filter created successfully";
    }

    @Override
    public Dto05 getAppliedFilter(Long id) {
        Optional<Entity05> appliedFilter = jparepo.findById(id);
        if (appliedFilter.isPresent()) {
            Entity05 entity = appliedFilter.get();
            Dto05 dto05 = new Dto05();
            dto05.setId(entity.getId());
            dto05.setAppliedFilterID(entity.getAppliedFilterID());
            dto05.setSecondaryFilterID(entity.getSecondaryFilterID());
            return dto05;
        } else {
            throw new RuntimeException("Applied Filter not found");
        }
    }

    @Override
    public String updateAppliedFilter(Long id, Dto05 dto05) {
        Optional<Entity05> appliedFilter = jparepo.findById(id);
        if (appliedFilter.isPresent()) {
            Entity05 entity = appliedFilter.get();
            entity.setId(dto05.getId());
            entity.setAppliedFilterID(dto05.getAppliedFilterID());
            entity.setSecondaryFilterID(dto05.getSecondaryFilterID());
            jparepo.save(entity);
            return "Applied Filter updated successfully";
        } else {
            return "Applied Filter not found";
        }
    }

    @Override
    public String deleteAppliedFilter(Long id) {
        if (jparepo.existsById(id)) {
            jparepo.deleteById(id);
            return "Applied Filter deleted successfully";
        } else {
            return "Applied Filter not found";
        }
    }
}
