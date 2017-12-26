package app;

import api.AppApi;

/**
 * 어플리케이션 API 구현체이다.
 * 
 * @author O117012
 */
public class AppApiImpl implements AppApi {
	public AppApiImpl() {}
	
	@Override
	public String getResourceInfo() {
		return "AppApiImpl-getResourceInfo";
	}
	
	@Override
	public String toString() {
		return "AppApiImpl : {}";
		
	}

}
