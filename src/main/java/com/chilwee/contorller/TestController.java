package com.chilwee.contorller;

import com.chilwee.pojo.Result;
import com.chilwee.pojo.Vol;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

    @RequestMapping("/home")
    public Result hello() throws JsonProcessingException {
        RestTemplate test = new RestTemplate();
        String url = "https://chilwee-power.cloud/volmap?nowdate=2月26日&deviceid=1";
        ResponseEntity<String> response = test.getForEntity(url, String.class);
        String responseBody =  response.getBody();
        ObjectMapper mapper = new ObjectMapper();
        Vol vol = mapper.readValue(responseBody, Vol.class);
        System.out.println(vol);
        return Result.success(vol);
    }
}
