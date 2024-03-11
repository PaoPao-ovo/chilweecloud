package com.chilwee.pojo.DataTime;

import java.util.ArrayList;

public class TimeArea {
    private ArrayList<Integer> starttime;
    private ArrayList<Integer> endtime;

    public TimeArea(){};
    public TimeArea(ArrayList<Integer> starttime, ArrayList<Integer> endtime) {
        this.starttime = starttime;
        this.endtime = endtime;
    }

    public ArrayList<Integer> getStarttime() {
        return starttime;
    }

    public void setStarttime(ArrayList<Integer> starttime) {
        this.starttime = starttime;
    }

    public ArrayList<Integer> getEndtime() {
        return endtime;
    }

    public void setEndtime(ArrayList<Integer> endtime) {
        this.endtime = endtime;
    }

    @Override
    public String toString() {
        return "TimeArea{" +
                "starttime=" + starttime +
                ", endtime=" + endtime +
                '}';
    }
}
