package com.mongo.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongo.presentation.model.Presentation;
import com.mongo.presentation.model.PresentationRepository;

@Service
public class PresentationService {
	
	@Autowired
	PresentationRepository repo;

	public Presentation getPage(long page) {
		return repo.findByPage(page);
	}
	
	public void addPresentation(Presentation presentation) {
		repo.saveAndFlush(presentation);
	}

	public void remove(Long presentation) {
		repo.delete(presentation);
	}
}
