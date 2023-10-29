package FactoryTutorials;

import FactoryTutorials.Car.CarFactory;
import FactoryTutorials.Color.ColorFactory;
import FactoryTutorials.Shape.ShapeFactory;

public class CreateAbsFactory {
    public static AbstractFactory getAbsFactory(CommonType commonType){
        switch (commonType){
            case CAR:return new CarFactory();
            case COLOR:return new ColorFactory();
            case SHAPE:return new ShapeFactory();
            default:throw new RuntimeException();
        }

    }

}
