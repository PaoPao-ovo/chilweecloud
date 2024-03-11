package com.chilwee.pojo;

import java.util.Arrays;

public class TimeEnerge {
    private double[] charge_hourdata;
    private  double[] discharge_hourdata;

    @Override
    public String toString() {
        return "TimeEnerge{" +
                "charge_hourdata=" + Arrays.toString(charge_hourdata) +
                ", discharge_hourdata=" + Arrays.toString(discharge_hourdata) +
                '}';
    }

    public double[] getCharge_hourdata() {
        return charge_hourdata;
    }

    public void setCharge_hourdata(double[] charge_hourdata) {
        this.charge_hourdata = charge_hourdata;
    }

    public double[] getDischarge_hourdata() {
        return discharge_hourdata;
    }

    public void setDischarge_hourdata(double[] discharge_hourdata) {
        this.discharge_hourdata = discharge_hourdata;
    }

    public TimeEnerge(){
    };
    public TimeEnerge(double[] charge_hourdata, double[] discharge_hourdata) {
        this.charge_hourdata = charge_hourdata;
        this.discharge_hourdata = discharge_hourdata;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TimeEnerge that = (TimeEnerge) o;
        return Arrays.equals(charge_hourdata, that.charge_hourdata) && Arrays.equals(discharge_hourdata, that.discharge_hourdata);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(charge_hourdata);
        result = 31 * result + Arrays.hashCode(discharge_hourdata);
        return result;
    }
}
