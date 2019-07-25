package top.selfhelp.controller;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import top.selfhelp.http.response.AccessTokenResult;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhuyuqiang
 */
@RestController
public class TestController {

	private final Logger logger = LoggerFactory.getLogger(getClass());

	private final String appId = "wx4fdf8a1bd68ddc41";

	private final String secret = "a1e51e50c470f76244dc135e7933a463";

	@RequestMapping(value = "/getAccessToken",method = {RequestMethod.GET})
	public Object sayHello(HttpServletRequest request){
		RestTemplate restTemplate = new RestTemplate();
		Map<String,String> requestParameter = new HashMap<String,String>();
		requestParameter.put("grant_type","client_credential");
		requestParameter.put("appid",appId);
		requestParameter.put("secret",secret);
//		ResponseEntity<AccessTokenResult> response = restTemplate.getForEntity("https://api.weixin.qq.com/cgi-bin/token", AccessTokenResult.class,requestParameter);
		ResponseEntity<AccessTokenResult> response =
				restTemplate.getForEntity("https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=wx4fdf8a1bd68ddc41&secret=a1e51e50c470f76244dc135e7933a463", AccessTokenResult.class);
		logger.debug("获取微信Token返回结果：{}", JSONObject.toJSONString(response));
		if(response.hasBody()){
			return response.getBody();
		}
		return response;
	}
}
