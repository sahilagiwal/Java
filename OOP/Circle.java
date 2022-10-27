package OOP;


public class Circle {
    public double radius;
    public double area(){
        return (Math.PI*(radius*radius)) ;
    }
    public double perimeter(){
        return ( Math.round(2*Math.PI*radius));
    }
    public double circumference(){
        return perimeter(); 
    }

}
class My{
    public static void main(String args[])
    {
        Circle c=new Circle();
        c.radius=3;
        System.out.println(c.area());
        System.out.println(c.perimeter());
        System.out.println(c.circumference());

    }
}
