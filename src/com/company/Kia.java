package com.company;

import java.io.CharArrayReader;

public class Kia extends Car{

    KiaTypes type;

    public KiaTypes getType() {
        return type;
    }

    public void setType(KiaTypes type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Kia{" +
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
