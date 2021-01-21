import java.util.Scanner;

public class Assignment19 {
    public static void main(String[] args) {
        System.out.println("Enter three side of Triangle: ");
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        System.out.println("==============");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("c: "+c);
        System.out.println("=====Types Of Triangle===");
        if(a==b && b==c ) {
            System.out.println("Equilateral Triangle");
        }else if(a==b || b==c || c==a) {
            System.out.println("Isosceles Triangle");
        }else {
            System.out.println("Scalene Triangle");
        }
    }
}
