package com.chilwee.service.impl;
import com.chilwee.pojo.DataEnerge.DataEnerge;
import com.chilwee.pojo.DataTime.DataTime;
import com.chilwee.pojo.DataVoltages.DataVoltages;
import com.chilwee.service.DataInterface;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class HistoryInfo implements DataInterface {
    private static final String BASE_URL = "https://chilwee-power.cloud/";
    private static final RestTemplate restobj = new RestTemplate();
    @Override
    public DataTime getMainInfo(String nowtime, Integer deviceid) throws JsonProcessingException {
        String url = BASE_URL + "getsettime?"
                + "nowtime=" + nowtime + "&"
                + "deviceid=" + deviceid;
        ResponseEntity<String> response = restobj.getForEntity(url, String.class);
        String responseBody =  response.getBody();
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(responseBody, DataTime.class);
    }

    @Override
    public DataEnerge getHistoryInfo(String date, Integer number_dates, Integer deviceid) throws JsonProcessingException {
        String url = BASE_URL + "get_energy_day_data?"
                + "date=" + date + "&"
                + "deviceid=" + deviceid + "&"
                + "number_dates=" + number_dates;
        ResponseEntity<String> response = restobj.getForEntity(url, String.class);
        String responseBody =  response.getBody();
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(responseBody, DataEnerge.class);
    }

    @Override
    public DataVoltages getVoltageInfo(String nowdate,Integer deviceid) throws JsonProcessingException {
        String url = BASE_URL + "volmap?"
                + "nowdate=" + nowdate + "&"
                + "deviceid=" + deviceid;
        ResponseEntity<String> response = restobj.getForEntity(url, String.class);
        String responseBody =  response.getBody();
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(responseBody, DataVoltages.class);
    }
}
