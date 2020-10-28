package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.example.demo.model.NationalModel;
import com.example.demo.repository.HelloRepository;

@Service
public class NationalService {
	@Autowired
	private HelloRepository helloRepository;

	public Object saveUser(NationalModel newsModel) {
		return helloRepository.save(newsModel);
	}

	public List<NationalModel> getAllNews() {	
		 return helloRepository.findAll();
	}
	
	public Object getNewsDetail(int id) {
		return helloRepository.findById(id);
	}
	
	public Object UpdateNews(NationalModel newsModel) {
		return helloRepository.save(newsModel);
	}

	public ResponseEntity<?> DeleteNews(int id) {
		try {
			helloRepository.deleteById(id);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
		}
	}
	
	

}
