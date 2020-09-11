package be.intecbrussel.factory_pattern;

public class ShapeFactory {

    public Shape getShape(String shapeType){

        if (shapeType != null) {
            if (shapeType.equalsIgnoreCase("CIRCLE")) return new Circle();
            else if (shapeType.equalsIgnoreCase("RECTANGLE")) return new Rectangle();
            else if (shapeType.equalsIgnoreCase("SQUARE")) return new Square();
        }

        return null;
    }

}