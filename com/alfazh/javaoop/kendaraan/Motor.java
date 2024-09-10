package com.alfazh.javaoop.kendaraan;

public class Motor extends Kendaraan{
    public Motor() {
        System.out.println("Motor created");
    }

    @Override
    public String type() {
        return "Motor";
    }

}
