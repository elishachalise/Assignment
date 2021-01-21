import java.util.Scanner;

public class Assignment25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int highestscore =0;
        String highestname=null;
        String s;
        int c;
        System.out.println("Enter the no of student: ");
        int n = sc.nextInt();
        for(int i =0;i<n;i++) {
            System.out.println("Enter Student Name and score: ");
            s= sc.next();
            c=sc.nextInt();
            if(c>highestscore) {
                highestscore = c;
                highestname=s;
            }

        }
        System.out.println("Student with highest score  "+highestname);


    }
}
