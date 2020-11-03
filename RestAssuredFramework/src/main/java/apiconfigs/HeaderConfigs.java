package apiconfigs;

import java.util.HashMap;
import java.util.Map;

public class HeaderConfigs {
	
	public Map<String,String> defaultHeaders(){
		Map<String,String> defaultHeaders = new HashMap<String,String>();
		defaultHeaders.put("Content-Type", "application/json");
		
		return null;
		
	}
	
	public Map<String,String> headersWithToken(){
		Map<String,String> defaultHeaders = new HashMap<String,String>();
		defaultHeaders.put("Content-Type", "application/json");
		defaultHeaders.put("Access_Token", "IMAD7-DNALN4");
		
		return null;
		
	}
}
