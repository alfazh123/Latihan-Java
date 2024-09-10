package com.alfazh.javaoop.kendaraan;

public class Kendaraan implements Vehicle{
    public boolean isOn = false;
    private int speed = 0;

    public Kendaraan() {
        System.out.println("Kendaraan created");
    }
    @Override
    public String type() {
        return "Kendaraan Umum";
    }

    @Override
    public void turnOn() {
        isOn = true;
    }
    
    @Override
    public void turnOff() {
        isOn = false;
    }

    public void drive() {
        while(isOn) {
            System.out.println("Kendaraan is driving with speed: " + speed + "km/jam");

            menuDrive();

        }
    }

    public void menuDrive(){
        System.out.println("1. Turn On");
        System.out.println("2. Turn Off");
        System.out.println("3. Set Speed");
        System.out.println("4. Exit");
        System.out.print("Pilih: ");
    }

    @Override
    public void speed(int speed) {
        if(!isOn){
            speed = 0;
        } else {
            this.speed = speed;
        }
    }

    public void printData(){
        System.out.println("Kendintaraan is on: " + isOn);
    }

    public void printSpeed(){
        System.out.println("Kendaraan speed: " + speed + "km/jam");
    }
}
