package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.NationalModel;
import com.example.demo.service.NationalService;


@RestController
@CrossOrigin("http://localhost:3000")
public class NationalController {
	
	@Autowired
	private NationalService nationalService;
	
//    @RequestMapping("/")
//  public String home() {
//        return "hello.html";
//    }
    
    @PostMapping("/news")
    public Object create(@RequestBody NationalModel newsModel) {
    	 return nationalService.saveUser(newsModel);
    }
    
    @GetMapping("/news")
    public List<NationalModel> getAllNews1(){
    	return nationalService.getAllNews();
    }
    
    @GetMapping("/news/{id}")
    public Object getNews(@PathVariable("id") int id){
    	return nationalService.getNewsDetail(id);
    }
    
    @PutMapping("/news")
    public Object UpdateNews(@RequestBody NationalModel newsModel) {
    	return nationalService.saveUser(newsModel);
    	
    }
    
    @DeleteMapping("/news/{id}")
	 public ResponseEntity<?> delete(@PathVariable("id") int id) {
    	return nationalService.DeleteNews(id);
	 }
    
}



