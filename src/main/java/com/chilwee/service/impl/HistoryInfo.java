package com.chilwee.service.impl;
import com.chilwee.pojo.DataEnerge.DataEnerge;
import com.chilwee.service.DataInterface;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class HistoryInfo implements DataInterface {
    private static final String BASE_URL = "https://chilwee-power.cloud/";
    @Override
    public DataEnerge getHistoryInfo(String date, Integer number_dates, Integer deviceid) throws JsonProcessingException {
        RestTemplate test = new RestTemplate();
        String url = BASE_URL + "get_energy_day_data?"
                + "date=" + date + "&"
                + "deviceid=" + deviceid + "&"
                + "number_dates=" + number_dates;
        ResponseEntity<String> response = test.getForEntity(url, String.class);
        String responseBody =  response.getBody();
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(responseBody, DataEnerge.class);
    }
}
