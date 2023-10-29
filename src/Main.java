import FactoryTutorials.AbstractFactory;
import FactoryTutorials.Car.CarFactory;
import FactoryTutorials.Car.CarType;
import FactoryTutorials.Car.ICar;
import FactoryTutorials.Color.ColorFactory;
import FactoryTutorials.Color.ColorType;
import FactoryTutorials.Color.IColor;
import FactoryTutorials.CommonType;
import FactoryTutorials.CreateAbsFactory;
import FactoryTutorials.Shape.IShape;
import FactoryTutorials.Shape.ShapeFactory;
import FactoryTutorials.Shape.ShapeType;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose SHAPE,CAR,COLOR");
        AbstractFactory abstractFactory= CreateAbsFactory.getAbsFactory(CommonType.valueOf(sc.nextLine()));
        if(abstractFactory instanceof CarFactory){
            System.out.println("Choose MERCEDES,BMW,RANGEROVER");
            ICar car=abstractFactory.getIcar(CarType.valueOf(sc.nextLine()));
            car.drive();
        }else if(abstractFactory instanceof ColorFactory){
            System.out.println("Choose RED,BLACK,GREEN");
            IColor iColor=abstractFactory.getIcolor(ColorType.valueOf(sc.nextLine()));
            iColor.draw();
        } else if (abstractFactory instanceof ShapeFactory) {
            System.out.println("Choose Shape RECTANGLE,TRIANGLE,SQUARE");
            IShape iShape=abstractFactory.getIshape(ShapeType.valueOf(sc.nextLine()));
            iShape.shape();

        }
    }
}