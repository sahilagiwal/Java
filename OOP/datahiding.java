package OOP;
 
public class datahiding {
    public static void main(String args[]){
        Rectangle r=new Rectangle();
        r.setLenght(10.5);
        r.setBreath(5.5);
        System.out.println(r.area());

    }
      
}
class Rectangle{
    private double length;
    private double breath;
    public double area(){
        return length*breath;
    }
    public double perimeter(){
        return (2*(length+breath));
    }
    public boolean isSquare(){
        if(length==breath){
            return true;
        }
        else{
            return false;
        }
    }
    public double getLength(){
        return length;
    }
    public double getBreath(){
        return breath;
    }
    public void setLenght(double l){
        length=l;
    }
        public void setBreath(double b){
        breath=b;
    }
}