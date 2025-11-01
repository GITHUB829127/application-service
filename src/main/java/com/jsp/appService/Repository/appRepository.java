package com.jsp.appService.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jsp.appService.Entity.appProperties;

@Repository
public interface appRepository extends JpaRepository<appProperties,Integer> {

	public List<appProperties> findByModuleName(String moduleName);

	public appProperties findByPropertyKey(String propertyKey);

}
