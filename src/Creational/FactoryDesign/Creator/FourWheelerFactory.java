package Creational.FactoryDesign.Creator;

import Creational.FactoryDesign.Product.FourWheelerVehicle;
import Creational.FactoryDesign.Product.Vehicle;

public class FourWheelerFactory implements VehicleFactory {

    @Override
    public Vehicle getVehicle(){
        return new FourWheelerVehicle();
    }
}
