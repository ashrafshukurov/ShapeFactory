package FactoryTutorials.Car;

import FactoryTutorials.AbstractFactory;
import FactoryTutorials.Color.ColorType;
import FactoryTutorials.Color.IColor;
import FactoryTutorials.Shape.IShape;
import FactoryTutorials.Shape.ShapeType;

public class CarFactory extends AbstractFactory {
    public ICar getIcar(CarType carType){
        switch (carType){
            case BMW:
                return new Bmw();
            case MERCEDES:
                return new Mercedes();
            case RANGEROVER:
                return new RangeRover();
            default:
                throw new RuntimeException();
        }


    }public IColor getIcolor(ColorType colorType){
        return null;
    }
    public IShape getIshape(ShapeType shapeType){
        return null;
    }
}
