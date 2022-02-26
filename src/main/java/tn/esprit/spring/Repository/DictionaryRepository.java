package tn.esprit.spring.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.Entity.Dictionary;

@Repository
public interface DictionaryRepository extends JpaRepository<Dictionary, Long>{
	
	public Dictionary findByWord(String word);

}
