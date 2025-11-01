package com.jsp.appService.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.appService.Entity.appService;

public interface serviceRepository extends JpaRepository<appService, Integer> {

	List<appService> findByServiceName(String serviceName);

}
