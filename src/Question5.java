import java.util.Scanner;

public class Question5 {

    public static void main(String[] args) {
        System.out.println("=====Area of a circle==== ");
        float pi=3.14f;//	//double d = Math.PI; we can use it instead of this line it is fixed in math
        float r,c;
        System.out.println("Enter the radius: ");
        Scanner s = new Scanner(System.in);
        r= s.nextFloat();
        c=pi*r*r;
        System.out.println("Area of Circle : "+c);

        System.out.println("====Area of Rectangle====");
        float l,b,R;
        System.out.println("Enter the Length of Rectangle:");
        l=s.nextFloat();
        System.out.println("Enter the Breadth of Rectangle: ");
        b=s.nextFloat();
        R=l*b;//l= length b=breadth
        System.out.println("Area of Rectangle: "+R);

        System.out.println("=====Area of Triangle===");
        float ba,h,T;
        System.out.println("Enter the base of Triangle: ");
        ba=s.nextFloat();
        System.out.println("Enter the height of Triangle: ");
        h=s.nextFloat();
        T=ba*h/2;//ba= base ,h = height
        System.out.println("Area of Triangle : "+T);


    }
}
