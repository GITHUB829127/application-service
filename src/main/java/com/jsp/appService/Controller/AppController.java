package com.jsp.appService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.appService.Contant.MappingConstant;
import com.jsp.appService.Dto.AppPropertiesDto;
import com.jsp.appService.Dto.AppResponseDto;
import com.jsp.appService.Dto.AppServiceDto;
import com.jsp.appService.Service.AppPropertiesImpl;
import com.jsp.appService.Service.AppServiceImpl;

@RestController
public class AppController
{
	@Autowired
	AppPropertiesImpl properties;
	
	@Autowired
	AppServiceImpl service;

	@PostMapping(value=MappingConstant.SAVE_PROPERTIES)
public @ResponseBody AppResponseDto saveproperties(@RequestBody List<AppPropertiesDto> dto)
{
	return properties.createProperties(dto);
}
@GetMapping(value=MappingConstant.GET_ALL)
public @ResponseBody AppResponseDto getAllProperties()
{
	return properties.getAllProperties();
}
@GetMapping(value=MappingConstant.GET_BY_MODULE_NAME)
public @ResponseBody AppResponseDto getPropertiesByModule(@RequestParam("moduleName") String moduleName)
{
	return properties.getPropertiesByModule(moduleName);
}
@GetMapping(value=MappingConstant.GET_BY_KEY)
public @ResponseBody AppResponseDto getPropertiesByKey(@RequestParam("propertyKey") String  propertyKey)
{
	return properties.getPropertiesByKey(propertyKey);
}
@PostMapping(value=MappingConstant.SAVE_APP)
public @ResponseBody AppResponseDto registerService(@RequestBody AppServiceDto dto)
{
	return service.registerService(dto);
}
@GetMapping(value=MappingConstant.GET_APP_SERVICE_BY_NAME)
public @ResponseBody AppResponseDto getAppServiceByName(@RequestParam("serviceName") String serviceName)
{
return service.getAppServiceByServiceName(serviceName);	
}

}