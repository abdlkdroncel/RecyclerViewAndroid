package com.example.recyclerview;

import java.io.Serializable;

public class LandMark implements Serializable {

    String name;
    String country;
    int draw;

    public LandMark(String name, String country, int draw) {
        this.name = name;
        this.country = country;
        this.draw = draw;
    }
}
