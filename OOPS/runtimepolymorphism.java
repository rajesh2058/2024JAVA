//override means same function used by subclass and base class
class Shape {
    public void area() {
        System.out.println("Displays Area of Shape");
    }
 }
 class Triangle extends Shape {
    public void area(int h, int b) {
        System.out.println(0.5*b*h);
    }  
 }
 class Circle extends Shape {
    public void area(int r) {
        System.out.println((3.14)*r*r);
    }  
 }
 
public class runtimepolymorphism {
    public static void main(String[] args) {
        Triangle s = new Triangle();
        s.area();
        s.area(2,3);
        Circle c = new Circle();
        c.area(5);
    }
}
