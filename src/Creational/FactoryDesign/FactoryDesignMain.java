package Creational.FactoryDesign;

import Creational.FactoryDesign.Creator.FourWheelerFactory;
import Creational.FactoryDesign.Creator.TwoWheelerFactory;
import Creational.FactoryDesign.Creator.VehicleFactory;
import Creational.FactoryDesign.Product.Vehicle;

public class FactoryDesignMain {

    private static Vehicle client(VehicleFactory vehicleFactory){
        return vehicleFactory.getVehicle();
    }

    public static void factorydesignMain(){
        TwoWheelerFactory twoWheelerFactory = new TwoWheelerFactory();
        Vehicle twoWheeler = client(twoWheelerFactory);
        twoWheeler.printVehicle();

        FourWheelerFactory fourWheelerFactory = new FourWheelerFactory();
        Vehicle fourWheeler = client(fourWheelerFactory);
        fourWheeler.printVehicle();
    }
}
