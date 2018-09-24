package inloggen.service;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import inloggen.dao.IPersonDao;
import inloggen.model.PersonModel;


@Service
public class PersonService implements IPersonService {
	
	@Autowired
	private IPersonDao iPersonDao;
	

	@Override
	public List<PersonModel> findByName(String naam){
		return this.iPersonDao.findByName(naam);
	} 	
	
	@Override 
	public Optional<PersonModel> findById(Long id){
		return this.iPersonDao.findById(id);
	}
		
	@Override
	public List<PersonModel> findAll(){
		return this.iPersonDao.findAll();
	}

	@Override
	public PersonModel create(PersonModel person) {
		return this.iPersonDao.save(person);
	}
	
	@Override 
	public void delete(PersonModel person) {
		this.iPersonDao.delete(person);
	}
	
	@Override
	public void update(PersonModel person) {
		this.iPersonDao.save(person);
	}
}
