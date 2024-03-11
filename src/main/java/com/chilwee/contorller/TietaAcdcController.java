package com.chilwee.contorller;

import com.chilwee.pojo.DataEnerge.DataEnerge;
import com.chilwee.pojo.DataTime.DataTime;
import com.chilwee.pojo.Result;
import com.chilwee.service.impl.HistoryInfo;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TietaAcdcController {

    @Autowired
    private HistoryInfo datainfo;

    @RequestMapping("/cloud/main")
    public Result GetMaininfoService(String date, Integer number_dates, Integer deviceid) throws JsonProcessingException {
        DataEnerge data = datainfo.getHistoryInfo(date,number_dates,deviceid);
        return Result.success(data);
    }

    @RequestMapping("/cloud/energetime")
    public Result GetEnergetimeService(String nowtime,Integer deviceid) throws JsonProcessingException {
        DataTime data = datainfo.getMainInfo(nowtime,deviceid);
        return Result.success(data);
    };

}
