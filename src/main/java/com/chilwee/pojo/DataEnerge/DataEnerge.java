package com.chilwee.pojo.DataEnerge;

import java.util.Arrays;

public class DataEnerge {
    /*获取历史充放电量、效率和收益*/
    private Serise serise;

    public void setxAxis(String[][] xAxis) {
        this.xAxis = xAxis;
    }

    private String[][] xAxis;

    public DataEnerge(){};

    @Override
    public String toString() {
        return "DataEnerge{" +
                "serise=" + serise +
                ", xAxis=" + Arrays.toString(xAxis) +
                '}';
    }

    public DataEnerge(Serise serise, String[][] xAxis) {
        this.serise = serise;
        this.xAxis = xAxis;
    }

    public Serise getSerise() {
        return serise;
    }

    public void setSerise(Serise serise) {
        this.serise = serise;
    }

    public String[][] getxAxis() {
        return xAxis;
    }

}
