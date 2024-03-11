package com.chilwee.service;

import com.chilwee.pojo.DataEnerge.DataEnerge;
import com.chilwee.pojo.DataTime.DataTime;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface DataInterface {

public DataTime getMainInfo(String nowtime, Integer deviceid) throws JsonProcessingException;//获取充放电时间
public DataEnerge getHistoryInfo(String date, Integer number_dates, Integer deviceid) throws JsonProcessingException;//获取历史充量、放电量、效率和收益。

}



