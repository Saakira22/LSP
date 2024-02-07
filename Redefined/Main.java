package Redefined;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Vehicle List (Grand Father)
         List<Vehicle> vehicleList=new ArrayList<>();
        vehicleList.add(new Car());
        vehicleList.add(new Motorcycle());
        vehicleList.add(new Bicycle());

        for(Vehicle vehicle : vehicleList){
            System.out.println(vehicle.getNumberofWheels());
        } 

       //EngineVehicle List (Father) 
        List<EngineVehicle> EnginevehicleList = new ArrayList<>();
        EnginevehicleList.add(new Car());
        EnginevehicleList.add(new Motorcycle());
        for(EngineVehicle ev : EnginevehicleList){
            System.out.println(ev.hasengine());
            System.out.println(ev.getNumberofWheels());
            System.out.println("*****");
        } 
    }
    
}
