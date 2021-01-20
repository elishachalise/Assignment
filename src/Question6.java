import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        System.out.println("===Perimeter of Circle=====");
        float pi=3.14f,r,C;//r=radius ,c=perimeter of circle
        System.out.println("Enter the radius of circle: ");
        Scanner s = new Scanner(System.in);
        r=s.nextFloat();
        C=2*pi*r;
        System.out.println("Perimeter of Circle: "+C);

        System.out.println("===Perimeter of Rectangle====");
        float l,b,R;//l=length ,b=breadth ,R = perimeter of Rectangle
        System.out.println("Enter the Length of rectangle: ");
        l=s.nextFloat();
        System.out.println("Enter the breadth of rectangle: ");
        b=s.nextFloat();
        R=(l+b)*2;
        System.out.println("Perimeter of Rectangle: "+R);

        System.out.println("===Perimeter of the Triangle====");
        float be,ba,h,T;//be=length of triangle, ba=base ,h= height , T= perimeter of triangle
        System.out.println("Enter the Length of triangle: ");
        be=s.nextFloat();
        System.out.println("Enter the base of triangle: ");
        ba=s.nextFloat();
        System.out.println("Enter the height of the triangle: ");
        h=s.nextFloat();
        T=be+ba+h;
        System.out.println("Perimeter of Triangle : "+T);






    }
}
