package com.mongo.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.presentation.model.Presentation;

@RestController
public class PresentationController {

	@Autowired
	private PresentationService service;

	public PresentationController() {
		Constants.pages.put(1, Constants.PAGE_1);
		Constants.pages.put(2, Constants.PAGE_2);
		Constants.pages.put(3, Constants.PAGE_3);
		Constants.pages.put(4, Constants.PAGE_4);
		Constants.pages.put(5, Constants.PAGE_5);
	}

	@GetMapping("/page/{page}")
	public String getPage(@PathVariable int page) {
		return Constants.pages.get(page);
	}

	@PostMapping("/addPage/")
	public void addPage(@RequestBody Presentation presentation) {
		service.addPresentation(presentation);
	}

	@DeleteMapping("/delPage/{presentation}")
	public void removePage(@PathVariable Long presentation) {
		service.remove(presentation);
	}

}
