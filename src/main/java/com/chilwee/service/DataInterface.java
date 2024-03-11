package com.chilwee.service;

import com.chilwee.pojo.DataEnerge.DataEnerge;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface DataInterface {

public DataEnerge getHistoryInfo(String date, Integer number_dates, Integer deviceid) throws JsonProcessingException;//获取历史充量、放电量、效率和收益。
}
