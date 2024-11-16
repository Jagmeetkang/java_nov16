package Oct29.Polymorphism;

public class Circle extends Shape{
    private double radius;
    private final double PI =3.14;

    public Circle(double radius){
        this.radius = radius;

    }
    @Override
    public double getArea(){
        return PI* radius*radius;
    }
}
