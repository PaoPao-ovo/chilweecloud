package com.chilwee.service;

import com.chilwee.pojo.DataEnerge.DataEnerge;
import com.chilwee.pojo.DataTime.DataTime;
import com.chilwee.pojo.DataVoltages.DataVoltages;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface DataInterface {
     DataTime getMainInfo(String nowtime, Integer deviceid) throws JsonProcessingException;//获取充放电时间
     DataEnerge getHistoryInfo(String date, Integer number_dates, Integer deviceid) throws JsonProcessingException;//获取历史充量、放电量、效率和收益。
     DataVoltages getVoltageInfo(String nowdate,Integer deviceid) throws JsonProcessingException;//获取单体电压。
}



