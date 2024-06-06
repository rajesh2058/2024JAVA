
class Shape{
    void area(){
        System.out.println("area is not right now");
    }
}
class Rectangle extends Shape{
    int length ;
    int breath;
 void area(int length,int breath){
    this.length = length;
    this.breath = breath ;
    int area1 = length * breath ;
    System.out.println("area is "+area1);
 }
}
public class inheritance {
    public static void main(String[] args) {
    Rectangle A = new Rectangle();
    A.area(5,4);
    A.area();
    }
}
