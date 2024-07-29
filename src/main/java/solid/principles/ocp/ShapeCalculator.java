package solid.principles.ocp;

import java.util.Objects;

public class ShapeCalculator
{
    public double calculateArea(shape Shape){
        if (Objects.equals(Shape.type, "circle"))
        {
            System.out.println("circle circle");
        } else {
            System.out.println("rectangle rectangle");
        }
        return 6.0;
    }

    public double calculatePerimeter(shape Shape){
        if (Objects.equals(Shape.type, "circle"))
        {
            System.out.println("circle circle");
        } else {
            System.out.println("rectangle rectangle");
        }
        return 10.0;
    }
}
// now what if we want to add triangle into above