package top.selfhelp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author zhuyuqiang
 */
@RestController
public class TestController {

	@RequestMapping(value = "/hello",method = {RequestMethod.GET,RequestMethod.POST})
	public String sayHello(HttpServletRequest request){
		return "hello web";
	}
}
