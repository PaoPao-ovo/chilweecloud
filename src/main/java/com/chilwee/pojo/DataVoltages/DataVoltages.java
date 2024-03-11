package com.chilwee.pojo.DataVoltages;

import java.util.ArrayList;

public class DataVoltages {
    private ArrayList<Integer> vol;

    public DataVoltages(){};

    public DataVoltages(ArrayList<Integer> vol) {
        this.vol = vol;
    }

    public ArrayList<Integer> getVol() {
        return vol;
    }

    public void setVol(ArrayList<Integer> vol) {
        this.vol = vol;
    }

    @Override
    public String toString() {
        return "DataVoltages{" +
                "vol=" + vol +
                '}';
    }
}
