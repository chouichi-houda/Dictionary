package tn.esprit.spring.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.Entity.Dictionary;
import tn.esprit.spring.Repository.DictionaryRepository;

@Service
public class DictionaryServiceImpl implements IDictionaryService {
	@Autowired
	DictionaryRepository dictionaryRepository;

	@Override
	public Dictionary addWord(Dictionary dictionary) {
		
		return dictionaryRepository.save(dictionary) ;
	}

	@Override
	public List<String> getSynonyms(String word) {
		Dictionary dictionary= dictionaryRepository.findByWord(word);
		List<String> synonyms= new ArrayList<String>() ;
		for (Dictionary dic :dictionary.getSynonyms()){
			synonyms.add(dic.getWord());
			
		}
			
		return synonyms;
	}

	

	
	

}
