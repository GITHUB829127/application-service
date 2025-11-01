package com.jsp.appService.Service;

import com.jsp.appService.Dto.AppResponseDto;
import com.jsp.appService.Dto.AppServiceDto;

public interface AppService {

	AppResponseDto registerService(AppServiceDto appServiceDto);

	AppResponseDto getAppServiceByServiceName(String serviceName);

}
