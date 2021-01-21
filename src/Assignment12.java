import java.util.Scanner;

public class Assignment12 {

    public static void main(String[] args) {

        int Roll_no;
        System.out.println("Enter the roll no: ");
        Scanner s = new Scanner(System.in);
        Roll_no  = s.nextInt();
        String Name;
        System.out.println("Enter the Name: ");
        Name = s.next();

        String Nationality;
        System.out.println("Enter your Nationality: ");
        Nationality= s.next();

        System.out.println("Roll No    :   "+Roll_no);
        System.out.println("Name       :   "+Name);
        System.out.println("Nationality:   "+Nationality);





    }
}
