package tn.esprit.spring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import tn.esprit.spring.Entity.Dictionary;
import tn.esprit.spring.Service.IDictionaryService;


@RestController
@Api(tags = "Management of Dictionary")
@RequestMapping("Dictionary")
public class DictionaryController {
	@Autowired
	IDictionaryService dictionaryService;
	@ApiOperation(value = "add Word")
	@PostMapping("/add-word")
	@ResponseBody
	public Dictionary addWord(@RequestBody Dictionary word){
		return dictionaryService.addWord(word) ;
		
	}
	
	@ApiOperation(value = "retrieve synonyms")
	@GetMapping("/retrieve-synonyms/{word}")
	@ResponseBody
	public List<String> getSynonyms(@PathVariable String word){
		
		return dictionaryService.getSynonyms(word);

}
	
	@ApiOperation(value = "retrieve synonyms")
	@GetMapping("/hello")
	@ResponseBody
	public String hello(){
		
		return "hello";
		

}

}
