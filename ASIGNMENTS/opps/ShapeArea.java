public class ShapeArea {
    
    public double calculateArea(double length, double width) {
        return length * width;
    }

  
    public double calculateArea(double length) {
        return length * length;
    }


    public double calculateAreaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

   
    public double calculateAreaOfCircleWithDiameter(double diameter) {
        return Math.PI * Math.pow(diameter / 2, 2);
    }

    
    public double calculateAreaOfTriangle(double base, double height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        ShapeArea shapeArea = new ShapeArea();

       
        System.out.println("Area of Rectangle =" + shapeArea.calculateArea(5, 3));
        System.out.println("Area of Square = " + shapeArea.calculateArea(5));

       
        System.out.println("Area of Circle = " + shapeArea.calculateAreaOfCircle(4));
        System.out.println("Area of Circle= " + shapeArea.calculateAreaOfCircleWithDiameter(8));

        
        System.out.println("Area of Triangle = " + shapeArea.calculateAreaOfTriangle(4, 6));
    }
}
