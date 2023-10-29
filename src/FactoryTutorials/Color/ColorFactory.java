package FactoryTutorials.Color;

import FactoryTutorials.AbstractFactory;
import FactoryTutorials.Car.CarType;
import FactoryTutorials.Car.ICar;
import FactoryTutorials.Shape.IShape;
import FactoryTutorials.Shape.ShapeType;

public class ColorFactory extends AbstractFactory {


    @Override
    public IShape getIshape(ShapeType shapeType) {
        return null;
    }

    @Override
    public IColor getIcolor(ColorType colorType) {
        switch (colorType){
            case BLACK:
                return new Black();
            case RED:
                return new Red();
            case GREEN:
                return new Green();
            default:throw new RuntimeException();
        }

    }

    @Override
    public ICar getIcar(CarType carType) {
        return null;
    }
}
