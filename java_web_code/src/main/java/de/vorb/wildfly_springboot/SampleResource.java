package de.vorb.wildfly_springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleResource {

    @RequestMapping("/")
    public String hello() {
        return "Hello World!";
    }
    
    @RequestMapping(value = "/ex/info", method = RequestMethod.GET)
    @ResponseBody
        public String getInfo() {
        return "This sample Java Web App is created using Spring Boot by Zaryab Husain Ghori";
    }

}
