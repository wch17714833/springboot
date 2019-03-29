package com.wench.web;

import net.unicon.cas.client.configuration.EnableCasClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@EnableCasClient//启用cas client
public class WebApplication extends SpringBootServletInitializer {
    private Logger logger = LoggerFactory.getLogger(WebApplication.class);
    @RequestMapping("/index")
    public String index(ModelMap map) {
        System.out.println("111111111111111111111111WWW");

        map.addAttribute("name", "clien B");
        return "index";
    }
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(WebApplication.class);
    }

    public static void main(String[] args) {
        System.out.println("222");

        SpringApplication.run(WebApplication.class, args);
    }

}
