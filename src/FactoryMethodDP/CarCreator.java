package FactoryMethodDP;

import FactoryMethodDP.CarTypes.Car;
import FactoryMethodDP.CarTypes.FastCar;
import FactoryMethodDP.CarTypes.LightweightCar;
import FactoryMethodDP.CarTypes.PowerfulCar;

public class CarCreator {

    public Car createNew(String type){
        switch (type) {
            case "lightweight" -> { return new LightweightCar(); }
            case "powerful" -> { return new PowerfulCar(); }
            case "fast" -> { return new FastCar(); }
        }

        return null;
    }
}
