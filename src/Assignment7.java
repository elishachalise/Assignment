import java.util.Scanner;

public class Assignment7 {

    public static void main(String[] args) {

        System.out.println("====Volume of Cylinder===");
        float pi = 3.14f, r, h, V;//r=radius ,h=height, v= volume of cylinder
        System.out.println("Enter the radius of cylinder: ");
        Scanner c = new Scanner(System.in);
        r = c.nextFloat();
        System.out.println("Enter the height of cylinder: ");
        h= c.nextFloat();
        V=pi*r*r*h;
        System.out.println("Volume of Cylinder: "+V);


    }
}
