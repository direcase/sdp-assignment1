package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Car car= new Car();
	Builder builder=new Builder();

        Scanner sc= new Scanner(System.in);
        System.out.println("Choose car brand: 'Toyota' or 'Kia';");
        String brand=sc.nextLine();
        if(brand=="Toyota"){
            car.setBrand("Toyota");
            Toyota toyota= new Toyota();
            for (ToyotaTypes t:ToyotaTypes.values()){
                System.out.println(t);
            }try {
                String type=sc.nextLine();
                switch(type) {
                    case "Camry":
                        toyota.setType(ToyotaTypes.Camry);
                        break;
                    case "Alphard":
                        toyota.setType(ToyotaTypes.Alphard);
                        break;
                    case "Corolla":
                        toyota.setType(ToyotaTypes.Corolla);
                        break;
                    default:
                        break;
                }
            }catch (Exception e) {
                System.out.println("Please,choose type. Try again.");
                sc.next();
            }
        }else if(brand=="Kia"){
            car.setBrand("Kia");
            Kia kia= new Kia();
            for (KiaTypes k:KiaTypes.values()){
                System.out.println(k);
            }try {
                String type=sc.nextLine();
                switch(type) {
                    case "Rio":
                        kia.setType(KiaTypes.Rio);
                        break;
                    case "Cerato":
                        kia.setType(KiaTypes.Cerato);
                        break;
                    case "Optima":
                        kia.setType(KiaTypes.Optima);
                        break;
                    default:
                        break;
                }
            }catch (Exception e) {
                System.out.println("Please,choose type. Try again.");
                sc.next();
            }
        }
        for (Color c: Color.values()){
            System.out.println(c);
        }try {
            String c= sc.nextLine();
            switch(c) {
                case "black":
                    car.setColor(Color.black);
                    break;
                    case "white":
                        car.setColor(Color.white);
                        break;
                    case "grey":
                        car.setColor(Color.grey);
                        break;
                    case "green":
                        car.setColor(Color.green);
                        break;
                    case "red":
                        car.setColor(Color.red);
                        break;
                    default:
                        break;
            }
        } catch (Exception exception) {
            System.out.println("Please,chose color. Try again.");
            sc.next();
        }

        System.out.println("Type desired engine volume:");
        String engineVolumn=sc.nextLine();
        car.setEngineVolume(engineVolumn);

        System.out.println("Type desired horse power:");
        String power=sc.nextLine();
        car.setHorsePower(power);

        System.out.println("Type wished year of manufacturing:");
        String year=sc.nextLine();
        car.setYearOfManufacture(year);



    }
}
