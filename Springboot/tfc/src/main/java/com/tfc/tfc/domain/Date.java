package com.tfc.tfc.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Date {
    private int day;
    private int month;
    private int year;

    public String getDate(){
        return day + "/" + month + "/" + year;
    }
}
