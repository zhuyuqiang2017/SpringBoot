package top.selfhelp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhuyuqiang
 */
@SpringBootApplication
public class TestApplication {
	private final static Logger logger = LoggerFactory.getLogger(TestApplication.class);

	public static void main(String[] args){
		SpringApplication application = new SpringApplication(TestApplication.class);
		application.setBannerMode(Banner.Mode.OFF);
		application.run(args);
		logger.info("start TestApplication.....");
	}
}