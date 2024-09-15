package Creational.FactoryDesign.Creator;

import Creational.FactoryDesign.Product.TwoWheelerVehicle;
import Creational.FactoryDesign.Product.Vehicle;

public class TwoWheelerFactory implements VehicleFactory {

    @Override
    public Vehicle getVehicle(){
        return new TwoWheelerVehicle();
    }
}
