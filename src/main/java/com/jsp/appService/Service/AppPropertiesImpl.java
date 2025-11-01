package com.jsp.appService.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.appService.Dto.AppPropertiesDto;
import com.jsp.appService.Dto.AppResponseDto;
import com.jsp.appService.Entity.appProperties;
import com.jsp.appService.Repository.appRepository;


@Service
public class AppPropertiesImpl implements AppProperties {
	
	@Autowired
	appRepository repository;
	
	@Override
	public	AppResponseDto createProperties(List<AppPropertiesDto> appDto)
	{
		AppResponseDto response=null;
		List<appProperties> app=new ArrayList<>();
		for(AppPropertiesDto appdto:appDto)
		{
			appProperties appproperties= new appProperties();
			appproperties.setCreatedDate(new Date());
			appproperties.setCreatedBy(appdto.getCreatededBy());
			appproperties.setModifiedBy(appdto.getModifiedBy());
			appproperties.setModifiedDate(appdto.getModifiedDate());
			appproperties.setModuleName(appdto.getModuleName());
			appproperties.setPropertyKey(appdto.getPropertyKey());
			appproperties.setPropertyValue(appdto.getPropertyValue());
			app.add(appproperties);
			
		}
		try {
			List<appProperties> saveObj= repository.saveAll(app);
			if(saveObj==null)
				return new AppResponseDto("FAILURE","500",null,null);
			response=new AppResponseDto("ACCEPTTED", "200", saveObj, null);
		}
		catch(Exception e)
		{
			response=new AppResponseDto("FAILURE","500",null,e.getLocalizedMessage());
		}
		return response;
	}
	@Override
	 public AppResponseDto getAllProperties()
	{
		AppResponseDto response=null;
		try
		{
		List<appProperties> savedObj=repository.findAll();
		if(savedObj==null)
			return new AppResponseDto("FAILURE", "500",null, null);
		response=new AppResponseDto("SUCCESS", "500", savedObj, null);
		}
		catch(Exception e)
		{
			response=new AppResponseDto("FAILURE", "500", null, e.getLocalizedMessage());
		}
		return response;
		
	}
	@Override
	public AppResponseDto getPropertiesByModule(String moduleName)
	{
		AppResponseDto response=null;
		try
		{
		List<appProperties> savedObj=repository.findByModuleName(moduleName);
		if(savedObj==null)
			return new AppResponseDto("FAILURE", "500",null, null);
		response=new AppResponseDto("SUCCESS", "500", savedObj, null);
		}
		catch(Exception e)
		{
			response=new AppResponseDto("FAILURE", "500", null, e.getLocalizedMessage());
		}
		return response;
	}
	
	
	@Override
	public AppResponseDto   getPropertiesByKey(String propertyKey)
	{	AppResponseDto response=null;
	try
	{
	appProperties savedObj=repository.findByPropertyKey(propertyKey);
	if(savedObj==null)
		return new AppResponseDto("FAILURE", "500",null, null);
	response=new AppResponseDto("SUCCESS", "500", savedObj, null);
	}
	catch(Exception e)
	{
		response=new AppResponseDto("FAILURE", "500", null, e.getLocalizedMessage());
	}
	return response;
		
	}

}
