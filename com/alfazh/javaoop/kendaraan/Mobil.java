package com.alfazh.javaoop.kendaraan;

public class Mobil extends Kendaraan{
    public Mobil() {
        System.out.println("Mobil created");
    }

    @Override
    public String type() {
        return "Mobil";
    }
}
