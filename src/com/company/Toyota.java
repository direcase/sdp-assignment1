package com.company;

public class Toyota extends Car {

    ToyotaTypes type;

    public ToyotaTypes getType() {
        return type;
    }

    public void setType(ToyotaTypes type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Toyota{" +
                "type=" + type +
                ", Color=" + Color +
                ", engineVolume='" + engineVolume + '\'' +
                ", horsePower='" + horsePower + '\'' +
                ", yearOfManufacture='" + yearOfManufacture + '\'' +
                '}';
    }
    public Builder getResult(){
        return new Builder();
    }
}
