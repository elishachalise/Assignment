public class Assignment27 {

    public void add(){
        int a =456;
        System.out.println("No is: "+a);
        int add =0;
        while(a!=0) {
            int digit = a%10;
            add=add+digit;
            a=a/10;
        }

        System.out.println("Addition of each no: "+add);
    }

    public void multiply(){
        int x=456;
        System.out.println("No is: "+x);
        int mult=1;

        while(x!=0) {
            int digit = x%10;
            mult=mult*digit;
            x=x/10;
        }

        System.out.println("Multiplication of each no: "+mult);


    }
    public static void main(String[] args) {

        Assignment27 as = new Assignment27();
        as.add();
        as.multiply();


    }

}
