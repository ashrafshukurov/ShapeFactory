package FactoryTutorials.Shape;

import FactoryTutorials.AbstractFactory;
import FactoryTutorials.Car.CarType;
import FactoryTutorials.Car.ICar;
import FactoryTutorials.Color.ColorType;
import FactoryTutorials.Color.IColor;

public class ShapeFactory extends AbstractFactory {
    @Override
    public IShape getIshape(ShapeType shapeType) {
        switch (shapeType){
            case RECTANGLE:
                return new Rectangle();
            case SQUARE:
                return new Square();
            case TRIANGLE:
                return new Triangle();
            default:throw new RuntimeException();
        }
    }

    @Override
    public IColor getIcolor(ColorType colorType) {
        return null;
    }

    @Override
    public ICar getIcar(CarType carType) {
        return null;
    }
}
