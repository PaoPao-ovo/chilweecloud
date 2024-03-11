package com.chilwee.pojo.DataTime;

import java.util.ArrayList;

public class DataTime {
    private ArrayList<TimeArea> chargetime;
    private ArrayList<TimeArea> discharge;

    public DataTime() {};

    public ArrayList<TimeArea> getChargetime() {
        return chargetime;
    }

    public void setChargetime(ArrayList<TimeArea> chargetime) {
        this.chargetime = chargetime;
    }

    public ArrayList<TimeArea> getDischarge() {
        return discharge;
    }

    public void setDischarge(ArrayList<TimeArea> discharge) {
        this.discharge = discharge;
    }

    @Override
    public String toString() {
        return "DataTime{" +
                "chargetime=" + chargetime +
                ", discharge=" + discharge +
                '}';
    }
}
