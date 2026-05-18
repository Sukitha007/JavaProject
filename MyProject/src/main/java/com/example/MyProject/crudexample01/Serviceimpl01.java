package com.example.MyProject.crudexample01;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.MyProject.utilpackage.Emailsmtp;

import java.util.List;
import java.util.Optional;


@Service
public class Serviceimpl01 implements Service01 {

//	@Autowired
//	 private ModelMapper mm;
	
    @Autowired
    private Jparepo01 jparepo;
    
    @Autowired
	private Emailsmtp smtp;
	public int updateQuery1(Long id, String email) {
	smtp.sendMail(email);
	return jparepo.updateQuery1(id,email);
	}

    @Override
	public String createUser(Dto01 dto01) {
//	Entity01 entity01 = mm.map(dto01, Entity01.class);
	Entity01 user = new Entity01();
       user.setUsername(dto01.getUsername());
       user.setEmail(dto01.getEmail());
       user.setPassword(dto01.getPassword());
       user.setRole(dto01.getRole());
       user.setRegistrationDate(dto01.getRegistrationDate());
       user.setImage(dto01.getImage());
        jparepo.save(user);
        return "User created successfully";
	}

    @Override
    public Dto01 getUser(Long id) {
        Optional<Entity01> user = jparepo.findById(id);
        if (user.isPresent()) {
            Entity01 entity = user.get();
            Dto01 dto = new Dto01();
            dto.setUsername(entity.getUsername());
            dto.setEmail(entity.getEmail());
            dto.setPassword(entity.getPassword());
            dto.setRole(entity.getRole());
            dto.setRegistrationDate(entity.getRegistrationDate());
            dto.setImage(entity.getImage());
            return dto;
        } else {
            throw new RuntimeException("User not found");
        }
    }


    @Override
    public String updateUser(Long id, Dto01 dto01) {
        Optional<Entity01> user = jparepo.findById(id);
        if (user.isPresent()) {
            Entity01 entity = user.get();
            entity.setUsername(dto01.getUsername());
            entity.setEmail(dto01.getEmail());
            entity.setPassword(dto01.getPassword());
            entity.setRole(dto01.getRole());
            entity.setRegistrationDate(dto01.getRegistrationDate());
            entity.setImage(dto01.getImage());
            jparepo.save(entity);
            return "User updated successfully";
        } else {
            return "User not found";
        }
    }

    @Override
    public String deleteUser(Long id) {
        if (jparepo.existsById(id)) {
            jparepo.deleteById(id);
            return "User deleted successfully";
        } else {
            return "User not found";
        }
    }

	
	@Override
	//@Transactional
	public int deleteQuery(Long id) {
		
		
		return jparepo.deleteQuery(id);
	}

	@Override

	public int updateQuery(Long id, String username) {
		
		return jparepo.updateQuery(id,username);
	}

	
	@Override
	public List<Entity01> pageData1(int page, String username, String email) {
			//PageRequest p = PageRequest.of(page, 5);
		    PageRequest p1 = PageRequest.of(page, 5,Sort.by("id"));
			List<Entity01> table = jparepo.findAllByUsername(p1,username);
			//List<Entity01> table = jparepo.findByUsernameStartingWith();

			return table;
	}

	
}


