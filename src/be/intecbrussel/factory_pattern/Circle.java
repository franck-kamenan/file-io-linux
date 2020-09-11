package be.intecbrussel.factory_pattern;

public class Circle implements Shape{

    @Override
    public void draw()
    {
        System.out.println("Inside the Circle::draw method");
    }
}
