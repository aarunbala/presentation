package com.mongo.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongo.presentation.model.Presentation;
import com.mongo.presentation.model.PresentationRepository;

@Service
public class PresentationService {

	@Autowired
	PresentationRepository repo;

	public String getPage(long page) {
		return Constants.PAGE_1;
	}

	public void addPresentation(Presentation presentation) {
		repo.saveAndFlush(presentation);
	}

	public void remove(Long presentation) {
		repo.delete(presentation);
	}
}
