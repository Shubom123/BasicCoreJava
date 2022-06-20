import java.util.Scanner;

public class NumberSwaping {
    public static void main(String args[]) {
        int a, b, c;
        Scanner sc=new Scanner(System.in);
	Scanner sc1=new Scanner(System.in);
        System.out.println("Enter Value of a :");
        a=sc.nextInt();
        System.out.println("Enter Value of b :");
        b=sc1.nextInt();
        c=a;
        a=b;
        b=c;
        System.out.println("Values in a:" +a);
        System.out.println("Values in b:" +b);
        sc.close();
	sc1.close();
    }

}
