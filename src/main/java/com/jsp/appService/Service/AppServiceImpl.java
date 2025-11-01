package com.jsp.appService.Service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.appService.Dto.AppResponseDto;
import com.jsp.appService.Dto.AppServiceDto;
import com.jsp.appService.Entity.appService;
import com.jsp.appService.Repository.serviceRepository;
@Service
public class AppServiceImpl implements AppService {
	@Autowired
	serviceRepository repository;
	
	@Override
	
	public  AppResponseDto registerService(AppServiceDto appServiceDto)
	{
		
		AppResponseDto response=null;
		appService service=new appService();
		service.setCreatedDate(new Date());
		service.setServiceName(appServiceDto.getServiceName());
		service.setServiceUrl(appServiceDto.getServiceUrl());
		service.setModifiedDate(null);
		service.setStatus("ACCEPTED");
		
		try
		{
			appService  saveObj= repository.save(service);
			if(saveObj==null)
				return new AppResponseDto("FAILURE","500",null,null);
			response=new AppResponseDto("SUCCESS", "200", saveObj, null);
		}
		catch(Exception e)
		{
			response=new AppResponseDto("FAILURE", "500", null, e.getLocalizedMessage());
		}
		return response;
	}
	 
	@Override
	public AppResponseDto getAppServiceByServiceName(String serviceName)
	{
		
		AppResponseDto response=null;
		try
		{
		List<appService> savedObj=repository.findByServiceName(serviceName);
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
