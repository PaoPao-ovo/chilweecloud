package com.chilwee.pojo.DataEnerge;

import java.util.ArrayList;

public class Serise {
    private ArrayList<Double> chargedata;

    private ArrayList<Double> dischargedata;
    private ArrayList<Double> efficiency;
    private ArrayList<Double> income;

    public Serise() {};

    public Serise(ArrayList<Double> chargedata, ArrayList<Double> dischargedata, ArrayList<Double> efficiency, ArrayList<Double> income) {
        this.chargedata = chargedata;
        this.dischargedata = dischargedata;
        this.efficiency = efficiency;
        this.income = income;
    }

    public ArrayList<Double> getChargedata() {
        return chargedata;
    }

    public void setChargedata(ArrayList<Double> chargedata) {
        this.chargedata = chargedata;
    }

    public ArrayList<Double> getDischargedata() {
        return dischargedata;
    }

    public void setDischargedata(ArrayList<Double> dischargedata) {
        this.dischargedata = dischargedata;
    }

    public ArrayList<Double> getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(ArrayList<Double> efficiency) {
        this.efficiency = efficiency;
    }

    public ArrayList<Double> getIncome() {
        return income;
    }

    public void setIncome(ArrayList<Double> income) {
        this.income = income;
    }

    @Override
    public String toString() {
        return "serise{" +
                "chargedata=" + chargedata +
                ", dischargedata=" + dischargedata +
                ", efficiency=" + efficiency +
                ", income=" + income +
                '}';
    }
}
