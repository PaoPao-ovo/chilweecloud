package com.chilwee.contorller;

import com.chilwee.pojo.Result;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

    @RequestMapping("/home")
    public Result hello(){
        RestTemplate test = new RestTemplate();
        String url = "https://chilwee-power.cloud/volmap?nowdate=2月2日&deviceid=1";
        ResponseEntity<String> response = test.getForEntity(url, String.class);
        String responseBody =  response.getBody();
        System.out.println(responseBody);
        return Result.success(responseBody);
    }

    @RequestMapping("/home1")
    public String hello1(){
        RestTemplate test = new RestTemplate();
        String url = "https://chilwee-power.cloud/volmap?nowdate=2月2日&deviceid=1";
        ResponseEntity<String> response = test.getForEntity(url, String.class);
        String responseBody =  response.getBody();
        return responseBody;
    }

}
