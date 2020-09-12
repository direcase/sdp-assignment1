package com.company;

public class Builder implements CarFactory {


    private Toyota toyota;
    private Kia kia;

    @Override
    public String getCar(Car car) {
        switch (car.getBrand()){
            case "Toyota":
                return toyota.toString();
            case    "Kia":
                return kia.toString();

            default:break;
        }
        return null;
    }
}
