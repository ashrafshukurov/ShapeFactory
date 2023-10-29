package FactoryTutorials;

import FactoryTutorials.Car.CarType;
import FactoryTutorials.Car.ICar;
import FactoryTutorials.Color.ColorType;
import FactoryTutorials.Color.IColor;
import FactoryTutorials.Shape.IShape;
import FactoryTutorials.Shape.ShapeType;

public abstract class AbstractFactory {
    public abstract IShape getIshape(ShapeType shapeType);
    public abstract IColor getIcolor(ColorType colorType);
    public abstract ICar getIcar(CarType carType);


}
