package com.mongo.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.presentation.model.Presentation;

@RestController
public class PresentationController {
	
	@Autowired
	private PresentationService service;

	@GetMapping
	public Presentation getPage(long page) {
		return service.getPage(page);
	}
	
	@PostMapping
	public void addPage(Presentation presentation) {
		service.addPresentation(presentation);
	}
	
	@DeleteMapping
	public void removePage(Long presentation) {
		service.remove(presentation);
	}
	
}
