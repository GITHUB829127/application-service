package com.jsp.appService.Service;

import java.util.List;

import com.jsp.appService.Dto.AppPropertiesDto;
import com.jsp.appService.Dto.AppResponseDto;

public interface AppProperties {

	AppResponseDto createProperties(List<AppPropertiesDto> appDto);

	AppResponseDto getAllProperties();

	AppResponseDto getPropertiesByModule(String moduleName);

	AppResponseDto getPropertiesByKey(String propertyKey);

}
