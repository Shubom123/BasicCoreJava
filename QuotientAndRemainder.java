import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String args[]) {
        int numerator, denominator;
	double Q, R;
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
	System.out.println("Enter numerator:");
        numerator=sc.nextInt();
        System.out.println("Enter denominator:");
        denominator=sc1.nextInt();
	Q = numerator/denominator;
	R = numerator%denominator;
        System.out.println("Quotient: "+ Q);
        System.out.println("Remainder: "+ R);
        sc.close();
	sc1.close();
    }
}
