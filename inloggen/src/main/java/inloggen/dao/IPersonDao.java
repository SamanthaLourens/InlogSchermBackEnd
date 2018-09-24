package inloggen.dao;

import java.util.*;
import org.springframework.data.repository.CrudRepository;
import inloggen.model.PersonModel;




public interface IPersonDao extends CrudRepository<PersonModel, Long>{
	
	public List<PersonModel> findByName(String naam);   
	
	public Optional<PersonModel> findById(Long id);
	
	public List<PersonModel> findAll();

	
}
