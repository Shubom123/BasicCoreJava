import java.util.Scanner;

public class EvanOdd {
    public static void main(String args[]) {

        System.out.println("Enter the number :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        if (num % 2 == 0)
            System.out.println(num + " is an even number");
        else
            System.out.println(num + " is an odd number ");
    }
}
