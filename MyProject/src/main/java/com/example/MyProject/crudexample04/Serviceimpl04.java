package com.example.MyProject.crudexample04;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MyProject.crudexample01.Entity01;

import java.util.Optional;

@Service
public class Serviceimpl04 implements Service04 {

    @Autowired
    private Jparepo04 jparepo;

    @Autowired
	 private ModelMapper mm;
    
    @Override
    public String createFilter(Dto04 dto04) {
    	Entity04 entity04 = mm.map(dto04, Entity04.class);
        jparepo.save(entity04);
        return "Filter created successfully";
    }

    @Override
    public Dto04 getFilter(Long id) {
        Optional<Entity04> filter = jparepo.findById(id);
        if (filter.isPresent()) {
            Entity04 entity = filter.get();
            Dto04 dto04 = new Dto04();
            dto04.setId(entity.getId());
            dto04.setFiltername(entity.getFiltername());
            dto04.setDescription(entity.getDescription());
            dto04.setAppliedFilters(entity.getAppliedFilters());
            return dto04;
        } else {
            throw new RuntimeException("Filter not found");
        }
    }

    @Override
    public String updateFilter(Long id, Dto04 dto04) {
        Optional<Entity04> filter = jparepo.findById(id);
        if (filter.isPresent()) {
            Entity04 entity = filter.get();
            entity.setId(dto04.getId());
            entity.setFiltername(dto04.getFiltername());
            entity.setDescription(dto04.getDescription());
            entity.setAppliedFilters(dto04.getAppliedFilters());
            jparepo.save(entity);
            return "Filter updated successfully";
        } else {
            return "Filter not found";
        }
    }

    @Override
    public String deleteFilter(Long id) {
        if (jparepo.existsById(id)) {
            jparepo.deleteById(id);
            return "Filter deleted successfully";
        } else {
            return "Filter not found";
        }
    }
}
