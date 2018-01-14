package com.mongo.presentation.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PresentationRepository extends JpaRepository<Presentation, Long>{
	Presentation findByPage(Long page);
}
