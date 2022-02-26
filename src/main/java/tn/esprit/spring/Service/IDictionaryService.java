package tn.esprit.spring.Service;

import java.util.List;

import tn.esprit.spring.Entity.Dictionary;

public interface IDictionaryService {
	
	public Dictionary addWord(Dictionary dictionary);
	
	public List<String> getSynonyms(String word);

}
