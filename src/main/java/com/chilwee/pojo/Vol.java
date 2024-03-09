package com.chilwee.pojo;

import java.util.Arrays;

public class Vol {
    private int[] vol;

    public Vol() {

    };

    @Override
    public String toString() {
        return "Vol{" +
                "vol=" + Arrays.toString(vol) +
                '}';
    }

    public int[] getVol() {
        return vol;
    }

    public void setVol(int[] vol) {
        this.vol = vol;
    }

    public Vol(int[] vol) {
        this.vol = vol;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vol vol1 = (Vol) o;
        return Arrays.equals(vol, vol1.vol);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(vol);
    }
}
