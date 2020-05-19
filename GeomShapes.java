import java.util.*;
class Dimensions{
    int numOfSides;
    double sides[];
    double area;
    void calcArea(){
        area=0;
    }
    Dimensions(int num){
        numOfSides=num;
        sides=new double[num];
    }
    void readSides(){
        Scanner read=new Scanner(System.in);
        for(int i=0;i<numOfSides;i++){
            System.out.println("Enter side "+(i+1)+":");
            sides[i]=read.nextDouble();
        }
    }
}
class Square extends Dimensions{
    Square(){
        super(1);
        System.out.println("---Square---");
        readSides();
    }
    void calcArea(){
        area=sides[0]*sides[0];
    }
    void display(){
        System.out.println("Square Statistics: ");
        System.out.println("Side "+sides[0]);
        calcArea();
        System.out.println("Area: "+area);
    }
}
class Rectangle extends Dimensions{
    Rectangle(){
        super(2);
        System.out.println("---Rectangle---");
        readSides();
    }
    void calcArea(){
        area=sides[0]*sides[1];
    }
    void display(){
        System.out.println("Rectangle Statistics: ");
        System.out.println("Length "+sides[0]);
        System.out.println("Breadth "+sides[1]);
        calcArea();
        System.out.println("Area: "+area);
    }
}
class Triangle extends Dimensions{
    Triangle(){
        super(3);
        System.out.println("---Triangle---");
        readSides();
    }
    void calcArea(){
        double s=(sides[0]+sides[1]+sides[2])/2;
        area=Math.sqrt(s*(s-sides[0])*(s-sides[1])*(s-sides[2]));
    }
    void display(){
        System.out.println("Triangle Statistics: ");
        for(int i=0;i<3;i++)
        System.out.println("side "+(i+1)+" :"+sides[i]);
        calcArea();
        System.out.println("Area: "+area);
    }
}
public class GeomShapes{
    public static void main(String args[]){
        Square sObj=new Square(); Rectangle rObj=new Rectangle(); Triangle tObj=new Triangle();
        sObj.display(); rObj.display(); tObj.display();
    }
}
