package yaoct.test.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
@ComponentScan(basePackages={"yaoct.test"})
@MapperScan(basePackages="yaoct.test.mapper")
public class Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@RequestMapping(value="/hello")
	@ResponseBody
	String m(String name) {
		return name+"testjjjjj";
	}

}
