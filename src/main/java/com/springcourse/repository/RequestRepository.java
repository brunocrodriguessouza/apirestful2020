package com.springcourse.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springcourse.domain.Request;

public interface RequestRepository extends JpaRepository<Request, Long> {
	
	public List<Request> findAllByOwnerId(Long id) ;
	
}
