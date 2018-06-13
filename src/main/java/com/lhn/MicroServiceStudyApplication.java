package com.lhn;

import com.lhn.proxy.controller.ProxyServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan(basePackageClasses = ProxyServlet.class)
public class MicroServiceStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceStudyApplication.class, args);
	}
}
